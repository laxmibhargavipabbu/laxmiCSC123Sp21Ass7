package laxmiCSC123Sp21Ass7;

import java.util.Scanner;

public class Trace2 
{
	public static void main(String [] args)
	{
		int num, den, quo;
		Scanner keyboard = new Scanner(System.in);
		Divider2 dividerObj = new Divider2();
		for(int i=0;i<=1;i++)
		{
			System.out.printf("Please enter two integers, a numerator and denominator: ");
			num = keyboard.nextInt();
			den = keyboard.nextInt();
			try
			{
				quo = dividerObj.divideA(num, den);
				System.out.printf("The quotient of 4 and 2 using integer arithmetic is %d\n",quo);
			}
			catch (ArithmeticException ex )
		    { 
			  System.out.printf("Message: %s\n",ex);
		      ex.printStackTrace();
		    } 
		}
		keyboard.close();
	}
}
