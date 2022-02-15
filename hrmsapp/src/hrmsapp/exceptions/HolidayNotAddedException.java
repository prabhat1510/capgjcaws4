package hrmsapp.exceptions;

public class HolidayNotAddedException extends Exception{
	String excpetionMessage;

	public HolidayNotAddedException() {
		// TODO Auto-generated constructor stub
	}

	public HolidayNotAddedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public HolidayNotAddedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public HolidayNotAddedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public HolidayNotAddedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
