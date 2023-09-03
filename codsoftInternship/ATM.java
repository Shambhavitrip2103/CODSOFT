package codsoftInternship;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		//Design user interface for ATM, including options withdrawing, depositing & CheckingBalance
				//implement method for each option, withdraw(amount), deposit(amount), checkBalance
		        /*display appropriate messages to the user based on their chosen options & success or failure
				of their transactions*/
				AtmOperationInterf ss =new AtmOperationImpl();
				int atmnumber= 63066; 
				int atmpin=789;
				int k;
				Scanner sc=new Scanner(System.in);
				System.out.println();
				System.out.println("           ...HELLO , WELCOME TO THE ATM MACHINE...");
				System.out.print("              Enter ATM Number : ");
				int atmNumber =sc.nextInt();
				System.out.print("              Enter Pin : ");
				int pin = sc.nextInt();
				
				if((atmnumber == atmNumber)&&(atmpin==pin)) {
				  while(true) {
					  System.out.println("       1. View Available Balance");
					  System.out.println("       2. withdraw amount");
					  System.out.println("       3. Deposit Amount");
					  System.out.println("       4. View Mini Statement");
					  System.out.println("       5. Exit from the application");
					  System.out.println("       Enter the choice: ");
		 	     	  int ch=sc.nextInt();
					  if(ch==1) {  
						  double viewbalance =0;
						  ss.viewBalance(); 
						  System.out.println("available balance"+viewbalance);
						
					  }else if(ch==2) {
						  System.out.println("Enter amount to withdraw ");
						  double withdrawAmount= sc.nextDouble();
						  ss.withdrawAmount(withdrawAmount);
						  
					  }else if(ch==3) {				  
						  System.out.println("Enter the amount to deposit : ");
						  double depositAmount=sc.nextDouble();
						  ss.depositAmount(depositAmount);
						  
					  }else if(ch==4) {
						  ss.viewMiniStatement();
					  }else if(ch==5) {
						  
						  System.out.println("  Collect Your ATM Card \n Thank YOU FOR USING the ATM Machine");
						  System.out.println();
						  System.exit(k=0);
					  }else {
						  System.out.println("please enter the correct choice");
					  }
				  } 
				}else {
					System.out.println("incorrect Atm number or pin");

					System.exit(k= 0);
				}
	}

}
