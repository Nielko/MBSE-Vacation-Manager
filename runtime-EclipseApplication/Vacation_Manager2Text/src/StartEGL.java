
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

public class StartEGL {

	public static void main(String[] args) {
		// Parse main.egx
	    EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
	    module.parse(new File("main.egx").getAbsoluteFile());

	    if (!module.getParseProblems().isEmpty()) {
	      System.out.println("Syntax errors found. Exiting.");
	      return;
	    }

	    // Load the XML document
	    PlainXmlModel model = new PlainXmlModel();
	    model.setFile(new File("library.xml"));
	    model.setName("L");
	    model.load();

	    // Make the document visible to the EGX program
	    module.getContext().getModelRepository().addModel(model);
	    // ... and execute
	    module.execute();
	  }
	}

}
