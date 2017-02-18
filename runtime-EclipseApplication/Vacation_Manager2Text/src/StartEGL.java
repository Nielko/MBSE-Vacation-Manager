
import java.io.File;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.egl.internal.EglModule;
import org.eclipse.epsilon.emc.emf.AbstractEmfModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

public class StartEGL {

	public static void main(String[] args) {
		// Parse main.egx
	    EglModule module = new EglModule();
	    try {
			module.parse(new File("model/Calender2HTML.egl").getAbsoluteFile());
			
			EmfModel model = new EmfModel();
		    model.setModelFile("/model/My.calender");
		    model.load();
		    
			//module.execute(null);
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			System.exit(-1);
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
