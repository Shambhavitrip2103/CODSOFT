package codsoftInternship;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AtmOperationImpl implements AtmOperationInterf{

	 UserBankAccount atm= new UserBankAccount();
	Map<Double, String> mista= new HashMap<Double, String>();

	public void viewBalance() {
		System.out.println("Available Balance is : " +atm.getBalance());
			}
  
	public void withdrawAmount(double withdrawAmount) {
		
		if(withdrawAmount%100==0) {
		if(withdrawAmount<=atm.getBalance()) {
			mista.put(withdrawAmount,"the withdrawn amount" );
		System.out.println( "Collect the cash"+ withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		}
		else {
			System.out.println("Insufficient Balance ....   ");
		}
		}
		else {
			System.out.println("Please enter the amount in multiple of 100");
		}
	}

	public void depositAmount(double depositAmount) {
		mista.put(depositAmount,"Amount that is deposited");
		System.out.println(depositAmount+" Deposited Successfully !! ");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	public void viewMiniStatement() {
		
		for(Entry<Double, String>m: mista.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());	
		}
}
	
}
