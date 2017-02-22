
import java.io.File;
import java.io.FileOutputStream;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.egl.internal.EglModule;
import org.eclipse.epsilon.emc.emf.AbstractEmfModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

public class StartEGL {

	public static void main(String[] args) {
		// Parse main.egx
	    try {
	    	// Egl-Datei laden und Output setzen
	    	EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
	    IEolExecutableModule module = new EglTemplateFactoryModuleAdapter(eglTemplateFactory);
	    	System.out.println("Parsing template files...");
	    eglTemplateFactory.setOutputRoot("model/calender.html");
	    	module.parse(new File("model/Calender2HTML.egl").getAbsoluteFile());
	
	    	// Fehler beim Parsen ausgeben
	    	if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
		}
	    	
	    	// Metamodell hinzufügen
	    	EmfModel model = new EmfModel();
	    	StringProperties properties = new StringProperties();
	    properties.put(EmfModel.PROPERTY_NAME, "Mein Kalender");
	    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, "model/Calender.ecore");//"file:/" + new File(metamodel).getAbsolutePath());
	    	properties.put(EmfModel.PROPERTY_MODEL_URI, "file:/" + new File("model/mynew.calender").getAbsolutePath());
	    properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "true");
	    properties.put(EmfModel.PROPERTY_READONLOAD, true + "");
	    	properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, true + "");
	    model.load(properties, (IRelativePathResolver) null);
	    eglTemplateFactory.getContext().getModelRepository().addModel(model) ;
	    	
	    
	    	// Ausführen und in Datei schreiben
	    System.out.println(	module.execute());
	    File file = new File("model/calender.html");
	    FileOutputStream fop = new FileOutputStream(file);
		if (!file.exists()) {
			file.createNewFile();
		}
		byte[] contentInBytes = ((String) module.execute()).getBytes();
		fop.write(contentInBytes);
		fop.flush();
		fop.close();
	    	module.getContext().getModelRepository().dispose();
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    
	   
	    //module.execute(template, postprocessor);
	    
	    

	   /*7 // Load the XML document
	    PlainXmlModel model = new PlainXmlModel();
	    model.setFile(new File("library.xml"));
	    model.setName("L");
	    model.load();

	    // Make the document visible to the EGX program
	    module.getContext().getModelRepository().addModel(model);
	    // ... and execute
	    module.execute();
	  }*/
	}

}
