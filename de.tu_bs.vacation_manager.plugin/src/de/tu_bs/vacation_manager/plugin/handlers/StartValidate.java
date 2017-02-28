package de.tu_bs.vacation_manager.plugin.handlers;


import java.io.File;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.tu_bs.vacation_manager.Calender.Calender;
import de.tu_bs.vacation_manager.Calender.CalenderPackage;
import de.tu_bs.vacation_manager.Calender.Employee;

public class StartValidate {

	public static void start(String project)
	{
		CalenderPackage.eINSTANCE.eClass();

		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("calender", new XMIResourceFactoryImpl());
	    

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI(project+"/model/mynew.calender"), true);
		//new File(project+"/model/Calender2HTML.egl").getAbsoluteFile()
		EObject root = r.getContents().get(0);
		
		Iterator<EObject> i = r.getAllContents();
		Calender cal = (Calender) i.next();
		System.out.println(cal.toString());
		
		// Urlaubstage berechnen
		try
		{
			for (int j = 0; j< cal.getPersons().size(); j++)
			{
				System.out.println("HoliApps: "+((Employee) cal.getPersons().get(j)).getHolidayapplications().size());
				((Employee) cal.getPersons().get(j)).setLeaveDays(30-((Employee) cal.getPersons().get(j)).getHolidayapplications().size());
			}
		}
		catch(Exception e)
		{
			
		}
		
		//Validaieren
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(cal);
		System.out.println((diagnostic.getSeverity()));
				System.out.println(diagnostic.getMessage());
		for(Diagnostic child: diagnostic.getChildren())
			System.out.println(child.getMessage());
	}
}

