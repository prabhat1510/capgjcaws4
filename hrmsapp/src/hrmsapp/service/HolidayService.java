package hrmsapp.service;

import java.util.List;

import hrmsapp.data.Holiday;
import hrmsapp.exceptions.HolidayNotAddedException;
import hrmsapp.exceptions.HolidayNotFoundException;

public interface HolidayService {
	public List<Holiday> getAllHoliday() throws HolidayNotFoundException;
	public String addHoliday(Holiday holiday) throws HolidayNotAddedException;
}
