package codsoftInternship;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// input marks obtained in each subject
		//sum up marks obtained in all subjects= total marks
		//divide total by total number of subjects to get average percentage
		//assign grades based on average percentage achieved 
		//display results = total marks, average percentage,& corresponding grade to user
		Scanner sc=new Scanner(System.in);
		System.out.println("          enter the total marks of all subjects");

		int total= sc.nextInt();
		System.out.println("          enter the marks obtained in all subjects");
		
		int maths=sc.nextInt();
		int phy=sc.nextInt(); 
		int eng=sc.nextInt();
		int hin=sc.nextInt();
		int chem=sc.nextInt(); 
		int bio=sc.nextInt();
		int electr=sc.nextInt();
		int digital=sc.nextInt();
		
		int sum=(maths+eng+phy+hin+chem+bio+electr+digital);
		float d=sum*100;
		float avgPer=d/total;
		
		if(avgPer> 90) {
			System.out.println("          Grade A");
		}else if(avgPer>80 && avgPer<90) {
			System.out.println("          Grade B");
		}else if(avgPer>70 && avgPer<80) {
			System.out.println("          Grade C");
		}else if(avgPer>60 && avgPer<70) {
			System.out.println("          Grade D");
		}else{
			System.out.println("          Grade E, Needs Improvement");
		}
        
		System.out.println("          Display total marks"+total);
		System.out.println("          total marks obtained"+sum);
		System.out.println("          the average percentage"+ avgPer);
     }

}
