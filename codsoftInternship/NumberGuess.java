package codsoftInternship;
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

	public static void main(String[] args) {		
		Random rand= new Random();
		Scanner sc=new Scanner(System.in);
		 
		System.out.println();
	    System.out.println("        ------------------------");	
	    System.out.println("     ...pick a number, any number...");	
	    System.out.println("        ------------------------");	
	    System.out.println();	
	   
	    int random_number = rand.nextInt(99) +1;
	    System.out.println("pick a number between 0 and 100(you have 5 guesses):");
	    System.out.println("        ------------------------");    
	    int guess;
	    int numberOfTries =1;
	    boolean win= false;
	    
	    while(win == false) {
	    	guess= sc.nextInt();
	    	
	    	if (numberOfTries < 5) {
	    	if(guess == random_number) {
	    	System.out.println();	
	    	System.out.println("you got it ! It is indeed:" + random_number);	
	    	System.out.println("It only took you"+ numberOfTries + "guesses to get it right!");	
	    	sc.close();
	    	win = true;
	    	}
	    	else if(guess< random_number) {
	    		System.out.println("you are too low");
	    		System.out.println();
	    		System.out.println("guess again: ");
	    	}
	    	else if(guess> random_number) {
	    		System.out.println("you are too high");
	    		System.out.println();
	    		System.out.println("guess again :");
	    	}
	    } else if(numberOfTries== 5) {
	    	if(guess == random_number) {
	    		System.out.println();
	    		System.out.println("you got it ! It is indeed:" + random_number);
	    		System.out.println("It only took you"+ numberOfTries + "guesses to get it right!");	
	    		sc.close();
	    		win =true;
	    	}
	    	if(guess != random_number) {
	    		System.out.println();
	    		System.out.println("sorry , you can run out of attempts. the correct number is:"+random_number + "better luck next time!");
	    		System.out.println("play again,next Round");
	    	    sc.close();
	    	    break;
	    	    }
	    } numberOfTries= numberOfTries+1;
	  }	
   }
}
