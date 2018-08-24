
public class Date {
	
	public int day;
	public String month;
	public int year;
	public void display()
	{
		System.out.println("day:-"+day+"\t month:-"+month+"\t year:-"+year);
	}
	
	public  Date()
	{
		day=33;
		month="feb";
		year=424;
	}
	public Date(int day,String month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
}
	
	