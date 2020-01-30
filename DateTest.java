class Date {
	int year;
	String month;
	int day;
	
	public void setDate(int y, String m, int d) {
		this.year=y;
		this.month=m;
		this.day=d;
	}
	public void setDate(int y) {
		this.year=y;
	}
	public void printDate() {
		System.out.println(year+"."+month+"."+day);
	}
	
	
}

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		d.setDate(2009,"5",30);
		d.printDate();
		d.setDate(2010);
		d.printDate();
	}

}
