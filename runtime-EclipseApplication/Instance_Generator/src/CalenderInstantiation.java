import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import de.tu_bs.vacation_manager.Calender.Calender;
import de.tu_bs.vacation_manager.Calender.CalenderFactory;
import de.tu_bs.vacation_manager.Calender.Date;
import de.tu_bs.vacation_manager.Calender.Employee;
import de.tu_bs.vacation_manager.Calender.Month;
import de.tu_bs.vacation_manager.Calender.WorkingDayType;
import de.tu_bs.vacation_manager.Calender.KW;

public class CalenderInstantiation {
	
	public static void main(String[] args) throws ParseException {
		
		int year = 2017-1900;
		int [] sizeMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
		
		//Überprüfung eines Schaltjahres
		if (new GregorianCalendar().isLeapYear(year) == true)
			sizeMonth[1] = 27;
		
		Calender cal = CalenderFactory.eINSTANCE.createCalender();
		cal.setName("Vacation Manager");

		
		
		///////Fixe Feiertage
		String [] publicHolidayDate = {"01.01.", "01.05.", "03.10", "25.12.", "26.12."};
		String [] publicHolidays = new String [100];

		//Zum Feiertag wird das aktuelle Jahr hinzugefügt
		for (int i = 0; i<publicHolidayDate.length; i++){	
			publicHolidays [i] = publicHolidayDate[i]+""+(year+1900);
		}
				
		//Erstellung und Überprüfung der einzelnen Kalendertage
		for (int month=0; month<=11; month++){
			
			for (int day=1; day<=sizeMonth[month]; day++){	
				Date date = CalenderFactory.eINSTANCE.createDate();
				date.setDay(new java.util.Date(year,month,day));
				date.setName(""+date.getDay());
				cal.getDates().add(date);
				
				//Funktion zum formatieren des Datum
				DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
				DateFormat outputFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
				String inputDate = date.getDay().toString();
				java.util.Date days = input.parse(inputDate);
				String formattedDate = outputFormat.format(days);
				
				//Überprüfung ob das Datum ein Wochenende ist
				if (date.getDay().getDay() == 0 || date.getDay().getDay() == 6 )
					date.setDayType(WorkingDayType.RESTRICTED_DAY);
				
				//Überprüfung ob das Datum ein Feiertag ist
				for (int i = 0; i<publicHolidayDate.length; i++){	
					if (formattedDate.compareTo(publicHolidays[i]) == 0 )	
					date.setDayType(WorkingDayType.PUBLIC_HOLYDAY);
				}				
			}
		}
		
		//Erstellung Monate
		/*String [] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};	
		for (int monate=1; monate<=monthName.length; monate++){
			Month month = CalenderFactory.eINSTANCE.createMonth();
			month.setMonthname();
			cal.getMonth().add(month);
			cal.get
		}*/
		
		KW kw = CalenderFactory.eINSTANCE.createKW();
		
		
		String [][] employees = { 
				{"Peter Meyer" ,"10"}, 
				{"Max Mustermann" ,"7"}, 
				{"Patrick Müller" ,"5"},
				{"Anna Meyer" ,"30"}	
				};		
		
		for (int i = 0; i<employees.length; i++){
			for (int j = 0; j<employees[i].length-1; j++){
				Employee employee = CalenderFactory.eINSTANCE.createEmployee();
				employee.setName(employees[i][j]);
				employee.setLeaveDays(Integer.parseInt(employees[i][j+1]));
				cal.getPersons().add(employee);	
			}
		}
			
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("calender", new XMIResourceFactoryImpl());
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createFileURI("my.calender"));
		r.getContents().add(cal);
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(cal);
		System.out.println((diagnostic.getSeverity()));
				System.out.println(diagnostic.getMessage());
		for(Diagnostic child: diagnostic.getChildren())
			System.out.println(child.getMessage());
		
		System.out.println("Instanz erstellt");
		
		
		try {
			r.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}