
class BankAccount {
	
		String owner;
		int accountNumber;
		int balance;
		
		public void deposit(int amount) { // ����
			balance+=amount;
		}
		public void withdraw(int amount) { // ����
			balance-=amount;
		}
		public String toString() {
			return "���� ���´� �ݾ��� "+balance;
		}
}	

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount();
		bankAcc.deposit(500);
		System.out.println(bankAcc);
		bankAcc.withdraw(1000);
		System.out.println(bankAcc);

	}

}
