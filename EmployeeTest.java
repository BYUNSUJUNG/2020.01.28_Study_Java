class Employee {
	private String name;
	private int salary; //private ����
	int age;
	
	public Employee(String n, int a, double s) {
		name = n;
		age = a;
		salary = (int) s;
		
	}
	public String getName() { // //private ������ �޼ҵ带 ����ϸ� ȣ�Ⱑ��
		return name;
		
	}
	private int getSalary() { //private �޼ҵ�
		return salary;
		
	}
	int getAge() { // ���� �����ڰ� ������ package
		return age;
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e;
		e = new Employee("ȫ�浿",0,30);
		//e.salary = 300; //private ����
		e.age = 26;
		//int sa = e.getSalary(); //private �޼ҵ�
		String s = e.getName();
		int a = e.getAge();
	}

}
