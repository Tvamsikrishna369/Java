package com.krishna.class1;

//public class ClassFinal {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


abstract class BClass {
	public void Greet () {
		System.out.println("In BClass : Hello");
	}
}

class DClass extends BClass{
	public void Greet () {
		System.out.println("In DClass : Hello");
	}
}

public class ClassFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DClass d = new DClass();
		d.Greet();
		
	}

}
