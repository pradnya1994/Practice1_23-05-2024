//Java program to swap two numbers without using third variable
package practice23_05_2023;

import java.util.Scanner;

public class SwapValues2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of a: ");
		int a= sc.nextInt();
		 System.out.println("Enter the value of b: ");
		 int b = sc.nextInt();
		 sc.close();
		 
		a= a+b;
		b= a-b;
		a= a-b;
		 
		 System.out.println("Value of a is : "+a);
		 System.out.println("Value of b is : "+b);
		 
		

	}

}
