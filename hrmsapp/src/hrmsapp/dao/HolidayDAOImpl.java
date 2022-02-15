package hrmsapp.dao;

import java.util.ArrayList;
import java.util.List;

import hrmsapp.data.Holiday;
import hrmsapp.exceptions.HolidayNotAddedException;
import hrmsapp.exceptions.HolidayNotFoundException;

public class HolidayDAOImpl implements HolidayDAO {
	
	private List<Holiday> holidayList = new ArrayList<Holiday>();

	@Override
	public List<Holiday> getAllHoliday() throws HolidayNotFoundException {
		
		if(holidayList == null || holidayList.isEmpty() )
		//if(true)
		{
			throw new HolidayNotFoundException("No holiday exists");
		}
		return holidayList;
	}

	@Override
	public String addHoliday(Holiday holiday) throws HolidayNotAddedException {
		holidayList.add(holiday);

		if(holidayList.contains(holiday)) {
			return "Holiday added successfully";
			
		}else {
			//return "Holiday not added";
			throw new HolidayNotAddedException("Holiday not added");
		}
	}
	
	

}
