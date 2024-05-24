//Java program to check whether input number is EVEN or ODD
package practice23_05_2023;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		 
		if(num % 2 == 0)
		{
			System.out.println("Given number is even number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}
			
	}

}
