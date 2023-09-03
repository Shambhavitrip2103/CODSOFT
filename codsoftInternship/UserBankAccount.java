package codsoftInternship;

public class UserBankAccount{
	//connect ATM class with user's bank account to access modify account balance
	//validate user input to ensure it is within acceptable limits( sufficient balance for withdrawals) 
			
	private double depositAmount;
	private double withdrawAmount;
	private double balance;
	public UserBankAccount (){ 
		
	}
	public double getBalance() {
		return balance;
	}	
	public void setBalance(double balance) {
		this.balance+=balance;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	
	public void setDepositAmount(double depositAmount) {
		this.depositAmount+=depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount=withdrawAmount;
	}
}