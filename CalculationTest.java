import java.util.Scanner;

class Calculation {
	
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
	
}


public class CalculationTest {

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		System.out.println("더하기: "+cal.Plus(3,7));
		System.out.println("빼기: "+cal.Minus(3,7));
		System.out.println("곱하기: "+cal.Multiplication(3,7));
		System.out.println("나누기: "+cal.division(3,7));
		System.out.println("나머지: "+cal.remainder(3,7));
		
	}

}
