package de.tu_bs.vacation_manager.test.util;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import de.tu_bs.vacation_manager.Calender.Date;

public class Calender2TextUtil {
	
	public String getFormattedDate (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 
		
	}
	
	public String getFormattedWeekday (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("EEE", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	
	public String getFormattedSingleDay (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("dd", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	
	public String getFormattedYear (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("yyyy", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	
	public String getFormattedMonth (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("MMM", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	
	public String getDayType (Date day) {
		
		String dayType="";
		
		String inputDayType = day.getDayType().toString();	
		if (inputDayType.equals("WorkingDay")) 
			dayType="Werktag"; 
		if (inputDayType.equals("Holiday"))
			dayType="Urlaub";
		if (inputDayType.equals("Vacation"))
			dayType="Urlaub";
		//Ändern! zu Holiday
		else if (inputDayType.equals("PublicHolyday"))
			dayType="Feiertag";
		
		return dayType; 	
	}
	
	
	public String getStartWeekDay (Date day) throws ParseException {
		
		String i = getFormattedWeekday(day);
		
		System.out.println(i);
		System.out.println(day);
		
		if (i.equals("Sun")){
				return "<li></li><li></li><li></li><li></li><li></li><li></li>";
				}
		if (i.equals("Mon")){
			return "";
			}
		if (i.equals("Tue")){
			return "<li></li>";
			}
		if (i.equals("Wed")){
			return "<li></li><li></li>";
			}
		if (i.equals("Thu")){
			return "<li></li><li></li><li></li>";
			}
		if (i.equals("Fri")){
			return "<li></li><li></li><li></li></li><li>";
			}
		else
		 return "<li></li><li></li><li></li></li><li></li><li></li>";
		
	
	}
	
	
	
	
}
