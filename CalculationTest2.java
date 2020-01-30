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
	
	// 중복메소드(overloading method)
	
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
		System.out.println("====== 정수형 버전 =======");
		System.out.println("더하기: "+cal.Plus(3,7));
		System.out.println("빼기: "+cal.Minus(3,7));
		System.out.println("곱하기: "+cal.Multiplication(3,7));
		System.out.println("나누기: "+cal.division(3,7));
		System.out.println("나머지: "+cal.remainder(3,7));
		
		System.out.println("====== 실수형 버전 =======");
		System.out.println("더하기: "+cal.Plus(3.5,7.5));
		System.out.println("빼기: "+cal.Minus(3.5,7.5));
		System.out.println("곱하기: "+cal.Multiplication(3.5,7.5));
		System.out.println("나누기: "+cal.division(3.5,7.5));
		System.out.println("나머지: "+cal.remainder(3.5,7.5));
		
	}

}
