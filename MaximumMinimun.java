package till_selection_20_july;
/*
 * Write a program to take four values and display maximum and minimum among them
 */

import java.util.Scanner;

public class MaximumMinimun {

	public static void main(String[] args) {
		// Scanner Object Creation
		Scanner sc=new Scanner(System.in);
		
		// Declare 4 variables
		int  a=0;
		int  b=0;
		int  c=0;
		int  d=0;
		int max=0;
		int min=0;
		
		// Input values of variable a, b,c,d
		System.out.print("Enter value of a: ");
		a=sc.nextInt();
		
		System.out.print("Enter value of b: ");
		b=sc.nextInt();
		
		System.out.print("Enter value of c: ");
		c=sc.nextInt();
		
		System.out.print("Enter value of d: ");
		d=sc.nextInt();
		
		//Logic for maximum
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					max=a;
				}
				else
				{
					max=d;
				}
			}
			else
			{
				if(c>d)
				{
					max=c;
				}
				else
				{
					max=d;
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					max=b;
				}
				else
				{
					max=d;
				}
			}
			else
			{
				if(c>d)
				{
					max=c;
				}
				else
				{
					max=d;
				}
			}
		}
		
		// Logic for minimun
		if(a<b)
		{
			if(a<c)
			{
				if(a<d)
				{
					min=a;
				}
				else
				{
					min=d;
				}
			}
			else
			{
				if(c<d)
				{
					min=c;
				}
				else
				{
					min=d;
				}
			}
		}
		else
		{
			if(b<c)
			{
				if(b<d)
				{
					min=b;
				}
				else
				{
					min=d;
				}
			}
			else
			{
				if(c<d)
				{
					min=c;
				}
				else
				{
					min=d;
				}
			}
		}
		
		System.out.println("Maximum : "+max+" Minimun : "+min);
		
		sc.close();// close scanner object
	}

}
