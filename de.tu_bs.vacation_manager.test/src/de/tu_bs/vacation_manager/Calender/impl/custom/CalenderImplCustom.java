package de.tu_bs.vacation_manager.Calender.impl.custom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.tu_bs.vacation_manager.Calender.impl.CalenderImpl;

public class CalenderImplCustom extends CalenderImpl{

	@Override
	public void showGui() {
		System.out.println("Starte Gui...");
		makeGui();
	}
	
	private void makeGui()
	{
		JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("JButton Beispiel");
        JPanel panel = new JPanel();
 
        // JButton mit Text "Drück mich" wird erstellt
        JButton button = new JButton("Drück mich");
 
        // JButton wird dem Panel hinzugefügt
        panel.add(button);
 
        meinJFrame.add(panel);
 
        // Fenstergröße wird so angepasst, dass 
        // der Inhalt reinpasst    
        meinJFrame.pack();
 
        meinJFrame.setVisible(true);
	}
}
