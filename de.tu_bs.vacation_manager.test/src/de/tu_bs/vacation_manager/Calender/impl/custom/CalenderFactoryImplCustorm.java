package de.tu_bs.vacation_manager.Calender.impl.custom;

import de.tu_bs.vacation_manager.Calender.Calender;
import de.tu_bs.vacation_manager.Calender.impl.CalenderFactoryImpl;
import de.tu_bs.vacation_manager.Calender.impl.CalenderImpl;

public class CalenderFactoryImplCustorm extends CalenderFactoryImpl{
	
	@Override
	public Calender createCalender() {
		CalenderImpl calender = (CalenderImpl) new CalenderImplCustom();
		return calender;
	}
}
