//Java Program to find square, cube and square root of a given number
package practice23_05_2023;

import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		
		System.out.println("Square of num is :  " + Math.pow(num, 2));
        System.out.println("Cube of num is : " + Math.pow(num, 3));
        System.out.println("Square Root of is : " + Math.sqrt(num));
		

	}

}
