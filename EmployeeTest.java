class Employee {
	private String name;
	private int salary; //private 변수
	int age;
	
	public Employee(String n, int a, double s) {
		name = n;
		age = a;
		salary = (int) s;
		
	}
	public String getName() { // //private 변수라도 메소드를 사용하면 호출가능
		return name;
		
	}
	private int getSalary() { //private 메소드
		return salary;
		
	}
	int getAge() { // 접근 제어자가 없으면 package
		return age;
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e;
		e = new Employee("홍길동",0,30);
		//e.salary = 300; //private 변수
		e.age = 26;
		//int sa = e.getSalary(); //private 메소드
		String s = e.getName();
		int a = e.getAge();
	}

}
