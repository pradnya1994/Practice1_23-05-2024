//How to read and print an integer value in Java?
package practice23_05_2023;

import java.util.Scanner;

public class IntegerValue {

	public static void main(String[] args) 
	{
		int a;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a ");

		a =sc.nextInt();
		System.out.println("Value of a is -" +a);


	}

}
