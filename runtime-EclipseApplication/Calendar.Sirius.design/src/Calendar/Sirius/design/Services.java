package Calendar.Sirius.design;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.vacation_manager.Calender.Date;

/**
 * The services class used by VSM.
 */
public class Services {
	private static final Pattern WEEK_PATTERN = Pattern.compile("KW (\\d*)");
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
	public int getDayOfDate(Date date) {
		java.util.Date d = date.getDay();
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int woy = c.get(Calendar.WEEK_OF_YEAR);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		
		Matcher m = WEEK_PATTERN.matcher("KW 42");
		String week = m.group(1);
		
		return d.hashCode() % 17;
	}
	public int getMonthOfDate(Date date) {		
		java.util.Date d = date.getDay();		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int month = c.get(Calendar.MONTH) + 1;
		return month;
	}
	public int getWeekOfMonth(Date date) {		
		java.util.Date d = date.getDay();		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int month = c.get(Calendar.MONTH) + 1;
		return month;
	}

}


