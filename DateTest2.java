
class Date2 {
	private int year;
	private String month;
	private int day;
	
	public Date2() {
		month = "1월";
		day = 1;
		year = 2009;
	}
	public Date2(int year, String month, int day) {
		setDate(year,month,day);		
	}
	public Date2(int year) {
		setDate(year,"1월",1);
	}
	public void setDate(int year, String month, int day) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public void print() {
		System.out.println("년: "+year+", 월: "+month+", 일: "+day);
	}
}

public class DateTest2 {

	public static void main(String[] args) {
		Date2 date1 = new Date2(2009,"3월",2);
		Date2 date2 = new Date2(2010);
		Date2 date3 = new Date2();
		
		date1.print();
		date2.print();
		date3.print();

	}

}
