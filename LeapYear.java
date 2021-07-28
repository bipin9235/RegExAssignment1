
/*
 * #Task 4: Write a program to check whether the given year is leap year or not?
 * Registration ID: JIRSS1132
 * Name: Bipin Kumar
 */
package till_selection_20_july;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// variable to store year
		int year=0;
		
		// input year from console
		System.out.print("Enter year: ");
		year=sc.nextInt();
		
		/*
		 * condition1: If year is century year and divisible by 400 is leap year other wise not a leap year.
		 * condition 2: If year is not century year and divisible by 4 is leap year other wise not a leap year.
		 */
		
		if(year%100==0) // check whether the year is century year 
		{
			if(year%400==0)//check whether the year is divisible by 400 
			{
				System.out.println(year+" is a leap year!");
			}
			else
			{
				System.out.println(year+" is not a leap year!");
			}
		}
		else if(year%4==0)// for non century year check whether it is divisible by 4
		{
			System.out.println(year+" is a leap year!");
		}
		else
		{
			System.out.println(year+ " is not a leap year!");
		}
		sc.close();
	}

}
