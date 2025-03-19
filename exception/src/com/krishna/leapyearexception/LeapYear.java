package com.krishna.leapyearexception;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Year (1 - 9999) : ");
		
		try {
			int year = Integer.parseInt (input.nextLine());
			if(year > 1 && year < 9999) {
				boolean isLeapYear = (year %4 ==0 && year%100 !=0) || (year%400==0);
				if(isLeapYear) {
					System.out.println(year + " Is a Leap Year.");
				} else {
					System.out.println(year + " is Not a Leap Year!");
				}
			} else {
				System.out.println(" Enter a Valid Year between (1 - 9999)");
			}
		} catch(NumberFormatException e) {
			System.out.println("Please enter a valid input");
		}
		input.close();
	}
}
