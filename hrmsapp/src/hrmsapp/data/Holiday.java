package hrmsapp.data;

import java.time.LocalDate;

public class Holiday {
	
	private Integer holidayId;
	private String holidayDescription;
	private String type;
	private LocalDate holidayDate;
	
	
	
	public Holiday(Integer holidayId, String holidayDescription, String type, LocalDate holidayDate) {
		this.holidayId = holidayId;
		this.holidayDescription = holidayDescription;
		this.type = type;
		this.holidayDate = holidayDate;
	}
	public Integer getHolidayId() {
		return holidayId;
	}
	public void setHolidayId(Integer holidayId) {
		this.holidayId = holidayId;
	}
	public String getHolidayDescription() {
		return holidayDescription;
	}
	public void setHolidayDescription(String holidayDescription) {
		this.holidayDescription = holidayDescription;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getHolidayDate() {
		return holidayDate;
	}
	public void setHolidayDate(LocalDate holidayDate) {
		this.holidayDate = holidayDate;
	}
	@Override
	public String toString() {
		return "Holiday [holidayId=" + holidayId + ", holidayDescription=" + holidayDescription + ", type=" + type
				+ ", holidayDate=" + holidayDate + "]";
	}
	
	
}
