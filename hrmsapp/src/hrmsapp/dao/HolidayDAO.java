package hrmsapp.dao;

import java.util.List;

import hrmsapp.data.Holiday;
import hrmsapp.exceptions.HolidayNotAddedException;
import hrmsapp.exceptions.HolidayNotFoundException;

public interface HolidayDAO {
	public List<Holiday> getAllHoliday() throws HolidayNotFoundException;
	public String addHoliday(Holiday holiday) throws HolidayNotAddedException;
}
