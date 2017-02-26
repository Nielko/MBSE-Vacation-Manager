package de.mbse.runegl;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

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

public class StartEGL extends JFrame{

	  // constructor for ButtonFrame
	  StartEGL(String title) 
	  {
	    super( title );                     // invoke the JFrame constructor
	    setLayout( new FlowLayout() );      // set the layout manager
	    
	    JButton bValidate = new JButton("Validiere Kalender");
	    add( bValidate ); 
	    bValidate.addActionListener(e -> new Validate());

	    JButton bCalender = new JButton("Exportiere Kalender");
	    add( bCalender ); 
	    bCalender.addActionListener(e -> StartEGL.start("model/"));
	    
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
	  }

	public static void main(String[] args) {
		
		StartEGL frm = new StartEGL("Vacation Rquest Manager");

	    frm.setSize( 300, 200 );     
	    frm.setVisible( true ); 
		
	}
	
	public static void start(String path)
	{
		try {
	    	// Egl-Datei laden und Output setzen
	    	EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
	    IEolExecutableModule module = new EglTemplateFactoryModuleAdapter(eglTemplateFactory);
	    	System.out.println("Parsing template files...");
	    	module.parse(new File(path+"Calender2HTML.egl").getAbsoluteFile());
	
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
	    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, path+"Calender.ecore");//"file:/" + new File(metamodel).getAbsolutePath());
	    	properties.put(EmfModel.PROPERTY_MODEL_URI, "file:/" + new File(path+"mynew.calender").getAbsolutePath());
	    properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "true");
	    properties.put(EmfModel.PROPERTY_READONLOAD, true + "");
	    	properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, true + "");
	    model.load(properties, (IRelativePathResolver) null);
	    eglTemplateFactory.getContext().getModelRepository().addModel(model) ;
	    	
	    
	    	// Ausführen und in Datei schreiben
	    System.out.println(	module.execute());
	    File file = new File(path+"calender.html");
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
	}

}
