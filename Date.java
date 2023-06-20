
public class Date extends java.util.Date {
	private int day, month, year;

	public Date(int year, int month, int day) {
		super(year, month, day);
	}

	public Date() {
		super();
	}

	public void setYear(int year) {
		super.setYear(year);
	}

	public void setMonth(int month) {
		super.setMonth(month);
	}

	public void setDay(int day) {
		super.setDate(day);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public boolean equals(Date other) {
		return super.equals(other);
	}

	public String toString() {
		return super.getDate() + "/" + (super.getMonth() + 1) + "/" + (super.getYear() + 1900);

	}



}
