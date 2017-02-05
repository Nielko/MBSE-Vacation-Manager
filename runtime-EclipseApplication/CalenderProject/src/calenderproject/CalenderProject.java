package calenderproject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.tu_bs.vacation_manager.Calender.Calender;
import de.tu_bs.vacation_manager.Calender.CalenderFactory;

public class CalenderProject {

	public static void main(String[] args) {
		//Calender.;
        // Retrieve the default factory singleton
        CalenderFactory factory = CalenderFactory.eINSTANCE;
        // create an instance of Calender
        Calender calender = factory.createCalender();
        calender.setName("Hallo");
        
        //calender.showGui();
        makeGui();
        
        // create a page
        //Webpage webpage = factory.createWebpage();
       // webpage.setTitle("This is a title");
        // add the page to myWeb
       // myWeb.getPages().add(webpage);
        // and so on, and so on
        // as you can see the EMF model can be (more or less) used as standard Java
	}
	
	//http://www.vogella.com/tutorials/EclipseRCP/article.html
	
	private static void makeGui()
	{
		/*JFrame frm = new JFrame();
		frm.setTitle("JFrame mit setSize()");

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setSize(300,200);
		frm.setLocation(50,50);
		frm.setVisible(true);*/
		System.out.println("Starte eigene GUI...");
	}

}
