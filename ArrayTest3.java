import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int total = 0;
		int size;
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		int[] scores = new int[size];
		
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("������ �Է��Ͻÿ�:  ");
			scores[i] = scan.nextInt();
		}
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		System.out.println("��� ������ "+total/scores.length);
			
		}
	}

}
