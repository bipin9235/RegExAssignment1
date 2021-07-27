/*
   #Task4: Write a program to check whether the given year is leap year or not?
   Registration ID: JIRSS1132
   Name: Bipin Kumar
 */
age till_selection_20_july;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// variable to store year
		int year=0;
		
		// input year from console
		year=sc.nextInt();
		
		// Logic to check year is leap or not
		
		if((year%100==0)&&(year%400==0))
		{
			System.out.println(year+" is leap year");
		}
		else if(year%4==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+ " is not a leap year!");
		}
		sc.close();
	}

}
