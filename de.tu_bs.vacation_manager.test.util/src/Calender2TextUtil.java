package de.tu_bs.vacation_manager.test.util;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import de.tu_bs.vacation_manager.Calender.Date;

public class Calender2TextUtil {
	
	public String dateFormat (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	
	public String dateFormatSingleDay (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("dd", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	
	public String dateFormatYear (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("yyyy", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	public String dateFormatWeekdays (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("EEE", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 	
	}
	
	public String dateMonth (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("MMM", Locale.ENGLISH);
		String inputDate = day.getDay().toString();
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 
		
	}
	
	public int[] getMonthDays(String month)
	{
		int[] ret = new int[]{};
		GregorianCalender calender;
		if(month.equals("Januar"))
		{
			ret = new int[]{};
		}
			
	}
	
	
/*	public String dateCurrentDate (Date day) throws ParseException{
		
		DateFormat input = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		DateFormat outputFormat = new SimpleDateFormat("MMM", Locale.ENGLISH);
		String inputDate = day.
		java.util.Date date = input.parse(inputDate);
		String formattedDate = outputFormat.format(date);
		
		return formattedDate; 
		
	}*/
	
	
	public String getDayType (Date day) {
		
		String dayType="";
		
		String inputDayType = day.getDayType().toString();	
		if (inputDayType == "WorkingDay") 
			dayType="Werktag"; 
		else if (inputDayType == "Holiday")
			dayType="Urlaub";
		else if (inputDayType == "Vacation") 
			dayType="Urlaub";
		else if (inputDayType == "PublicHoliday") 
			dayType="Feiertag";
		
		return dayType; 
		
	}
	
	
	

}
