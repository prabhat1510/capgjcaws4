package hrmsapp.exceptions;

public class HolidayNotFoundException extends Exception{
	String holidDayExcpetionMessage;

	public HolidayNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public HolidayNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public HolidayNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public HolidayNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public HolidayNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
