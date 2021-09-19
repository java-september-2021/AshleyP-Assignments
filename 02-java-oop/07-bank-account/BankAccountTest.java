public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myBankAccount = new BankAccount();
		myBankAccount.depositMoney(10, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //10
		myBankAccount.depositMoney(100, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //110
		System.out.println(BankAccount.getNumberOfAccounts()); //1
		System.out.println(BankAccount.getTotalMoney()); //110
		myBankAccount.withdrawMoney(10000, "checking"); //NSF
		myBankAccount.withdrawMoney(60, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //50
		}

}