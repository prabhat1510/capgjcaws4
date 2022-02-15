package hrmsapp.service;

import java.util.List;

import hrmsapp.dao.HolidayDAO;
import hrmsapp.dao.HolidayDAOImpl;
import hrmsapp.data.Holiday;
import hrmsapp.exceptions.HolidayNotAddedException;
import hrmsapp.exceptions.HolidayNotFoundException;

public class HolidayServiceImpl implements HolidayService {

	private HolidayDAO holidayDAO = new HolidayDAOImpl();
	@Override
	public List<Holiday> getAllHoliday() throws HolidayNotFoundException {

		return holidayDAO.getAllHoliday();
	}
	@Override
	public String addHoliday(Holiday holiday) throws HolidayNotAddedException {
		String message = holidayDAO.addHoliday(holiday);
		return message;
	}

}
