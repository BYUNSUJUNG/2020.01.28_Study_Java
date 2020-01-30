
class BankAccount {
	
		String owner;
		int accountNumber;
		int balance;
		
		public void deposit(int amount) { // 적금
			balance+=amount;
		}
		public void withdraw(int amount) { // 인출
			balance-=amount;
		}
		public String toString() {
			return "현재 상태는 금액은 "+balance;
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
