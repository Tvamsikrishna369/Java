
//java code do math operation using exception


package com.krishna.mathexception;

import java.util.Scanner;

public class MathException {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter the First Value: ");
			double fval = input.nextInt();
			
			System.out.print("Enter the Second Value: ");
			double sval = input.nextInt();
			
			System.out.print("Enter the Operation (+, -, /, *): ");
			char operation = input.next().charAt(0);
			
			double result = performOperation(fval, sval, operation);
			System.out.println("The Result is: " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed");
		} catch (Exception e) {
			System.out.println("Error: Invalid Input");
		} finally {
			input.close();
		}
		
//		public static double performOperation(double fval,double sval, char Operation) throws ArithmeticException{
//			
//			switch (operation) {
//			case'+':
//				return fval + sval;
//			case '-':
//				return fval - sval;
//			case '*':
//				return fval * sval;
//			case '/':
//				if(sval == 0) {
//					throw new ArithmeticException();
//				}
//				return fval/sval;
//			default:
//				throw new IllegalArgumentException("Invalid Operation");
//			}
//			
//			return result;
//		}

	}

	private static double performOperation(double fval, double sval, char operation) throws ArithmeticException {
		// TODO Auto-generated method stub
//		double result = performOperation(fval, sval, operation);
//		System.out.println("The Result is: " + result);
		switch (operation) {
		case'+':
			return fval + sval;
		case '-':
			return fval - sval;
		case '*':
			return fval * sval;
		case '/':
			if(sval == 0) {
				throw new ArithmeticException();
			}
			return fval/sval;
		default:
			throw new IllegalArgumentException("Invalid Operation");
		}
	}

}
