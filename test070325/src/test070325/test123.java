package test070325;

import java.util.Scanner;

public class test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		
		if(num <= 5000 ) {
			int result = num/100*10;
			System.out.println(result + num);
		} else if(num <= 10000 ) {
			int result = num/100*10;
			System.out.println(result + num);
		} else {
			System.out.println(num);
		}
	}
}
