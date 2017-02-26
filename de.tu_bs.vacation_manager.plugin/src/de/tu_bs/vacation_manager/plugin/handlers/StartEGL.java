package de.tu_bs.vacation_manager.plugin.handlers;


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

	public static void start(String project) {
		// Parse main.egx
	    try {
	    	
	    	/*Process ps=Runtime.getRuntime().exec(new String[]{"java -jar .."+project+"/StartEgl.jar"});
	        ps.waitFor();
	        System.out.println("Jar gestartet");
	        java.io.InputStream is=ps.getInputStream();
	        byte b[]=new byte[is.available()];
	        is.read(b,0,b.length);
	        System.out.println(new String(b));*/
	    	// Egl-Datei laden und Output setzen
	    	de.mbse.runegl.StartEGL.start("file://"+project);
	    	
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
