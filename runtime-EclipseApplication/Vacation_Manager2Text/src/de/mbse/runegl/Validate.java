package de.mbse.runegl;

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

public class Validate {

	public Validate()
	{
		CalenderPackage.eINSTANCE.eClass();

		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("calender", new XMIResourceFactoryImpl());
	    

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI("model/mynew.calender"), true);
		
		EObject root = r.getContents().get(0);
		
		Iterator<EObject> i = r.getAllContents();
		Calender cal = (Calender) i.next();
		System.out.println(cal.toString());
		
		//Validaieren
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(cal);
		System.out.println((diagnostic.getSeverity()));
				System.out.println(diagnostic.getMessage());
		for(Diagnostic child: diagnostic.getChildren())
			System.out.println(child.getMessage());
	}
	
	public static void main(String[] args)
	{
		new Validate();
	}
}
