package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter another integer: ");
		int n2 = input.nextInt();
		
		double avg = (n1 + n2)/2.0;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + avg + ".");
	}
}
