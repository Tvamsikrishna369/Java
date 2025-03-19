// inheritance

package com.krishna.class1;

class Bclass{
	
	String message;
	
	public Bclass() {
		System.out.println("In BClass");		
	}
	
	public Bclass(String message) {
		this.message = message;
		System.out.println("BClass message : " + message);
	}
	
}


class DClass extends Bclass {
	public DClass() {
		System.out.println("in Dclass");
	}
	public DClass(String message) {
		super(message);
		System.out.println("DClass: message: " + message);
	}
}

//class DClass1 extends BClass , Dclass{	//multiple inheritance - system cannot 
//	System.out.println("from DClass1");
//}

class DClass1 extends DClass {	//multi level inheritance
//	System.out.println("from DClass1");
//	System.out.println("in Dclass");
//	System.out.println("form DClass1");
}



public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DClass dcls = new DClass("hello");

	}

}
