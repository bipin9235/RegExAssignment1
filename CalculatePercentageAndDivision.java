package till_selection_20_july;
/*
 * Write a program to take input marks of five subjects and calculate the percentage and display
	their division [>=75.00 Distinction, >=60.00 AND <75.00 First division, >=50.00 AND <60.00 Second
	division, >=40.00 AND <50.00 Third division, <40.00 Fail]
 */

import java.util.Scanner;

public class CalculatePercentageAndDivision {

	public static void main(String[] args) {
		//Scanner Object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----To Calculate percentage and division-----");
		// variables to store marks
		int english=0;
		int math=0;
		int hindi=0;
		int physics=0;
		int chemistry=0;
		
		// Input variables through console
		System.out.print("Enter mark of English out of 100: ");
		english=sc.nextInt();
		
		System.out.print("Enter mark of Maths out of 100: ");
		math=sc.nextInt();
		
		System.out.print("Enter mark of Hindi out of 100: ");
		hindi=sc.nextInt();
		
		System.out.print("Enter mark of Physics out of 100: ");
		physics=sc.nextInt();
		
		System.out.print("Enter mark of Chemistry out of 100: ");
		chemistry=sc.nextInt();
		
		//variable to store percentage total marks 
		int total=english+math+hindi+physics+chemistry;
		
		float percentage=(total/5);
		
		if(percentage>=75)
		{
			System.out.println("Percent Obtained: "+percentage+" Division : Distinction");
		}
		else if(percentage>=60&&percentage<75)
		{
			System.out.println("Percent Obtained: "+percentage+" Division : First");
		}
		else if(percentage>=50&&percentage<60)
		{
			System.out.println("Percent Obtained: "+percentage+" Division : Second");
		}
		else if(percentage>=40&&percentage<50)
		{
			System.out.println("Percent Obtained: "+percentage+" Division : Third");
		}
		else
		{
			System.out.println("Percent Obtained: "+percentage+" Fail!");
		}
		
		// close scanner
		sc.close();

	}

}
