import java.util.Scanner;

public class ArrayTest5 {
	
	final static int STUDENTS = 5;
	public static void main(String[] args) {
		
		int[][] array = {{10,20,30,40},{10,20,30,40},{10,20,30,40}};
		for(int r=0; r<array.length; r++) {
			for(int c=0; c<array[r].length; c++) {
				System.out.println(r+"За"+c+"ї­");
			}
		}
	}

}
