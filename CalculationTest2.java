import java.util.Scanner;

class Calculation2 {
	
	int Plus(int a, int b) {
		return a+b; 
	}
	int Minus(int a, int b) {
		return a-b; 
	}
	int Multiplication(int a, int b) {
		return a*b; 
	}
	int division(int a, int b) {
		return a/b; 
	}
	int remainder(int a, int b) {
		return a%b; 
	}
	
	// �ߺ��޼ҵ�(overloading method)
	
	int Plus(double a, double b) { 
		return (int) (a+b); 
	}
	int Minus(double a, double b) {
		return (int) (a-b); 
	}
	int Multiplication(double a, double b) {
		return (int) (a*b); 
	}
	int division(double a, double b) {
		return (int) (a/b); 
	}
	int remainder(double a, double b) {
		return (int) (a%b); 
	}
}


public class CalculationTest2 {

	public static void main(String[] args) {
		Calculation2 cal = new Calculation2();
		System.out.println("====== ������ ���� =======");
		System.out.println("���ϱ�: "+cal.Plus(3,7));
		System.out.println("����: "+cal.Minus(3,7));
		System.out.println("���ϱ�: "+cal.Multiplication(3,7));
		System.out.println("������: "+cal.division(3,7));
		System.out.println("������: "+cal.remainder(3,7));
		
		System.out.println("====== �Ǽ��� ���� =======");
		System.out.println("���ϱ�: "+cal.Plus(3.5,7.5));
		System.out.println("����: "+cal.Minus(3.5,7.5));
		System.out.println("���ϱ�: "+cal.Multiplication(3.5,7.5));
		System.out.println("������: "+cal.division(3.5,7.5));
		System.out.println("������: "+cal.remainder(3.5,7.5));
		
	}

}
