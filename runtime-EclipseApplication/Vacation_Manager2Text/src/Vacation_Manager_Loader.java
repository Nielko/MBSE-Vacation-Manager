import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.tu_bs.vacation_manager.Calender.CalenderPackage;



public class Vacation_Manager_Loader {
	public static void main(String[] args) {
		CalenderPackage.eINSTANCE.eClass();

		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("calender", new XMIResourceFactoryImpl());
	    

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI("my.calender111"), true);
		
		EObject root = r.getContents().get(0);
		
		Iterator<EObject> i = r.getAllContents();
		while(i.hasNext())
			System.out.println(i.next());
	}
}