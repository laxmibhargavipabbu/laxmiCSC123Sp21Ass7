package Assignement7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTester 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = new int[5];
		int value = 0;
		int indexValue = 0;
		while (true)
		{
			try
			{
				System.out.printf("\nPlease enter value: ");
				value = keyboard.nextInt();
				System.out.printf("\nPlease enter an array index: ");
				indexValue = keyboard.nextInt();
				arr1[indexValue] = value;
				System.out.printf("\nThe value for the array at index %d is %d\n",indexValue, arr1[indexValue]);	
				break;
			}
			catch(IndexOutOfBoundsException ex)
			{
				System.out.printf("Message: %s\n", ex);
				ex.printStackTrace();
			}
			catch(InputMismatchException ex)
			{
				System.out.printf("Message: %s\n", ex);
				ex.printStackTrace();
				keyboard.next();
			}
			catch(Exception ex)
			{
				System.out.printf("Message: %s\n", ex);
				ex.printStackTrace();
			}
		}
		keyboard.close();
	}
}
