package com.krishna.abstractclass;

//abstract cannot call / create duplicate
//abstract class are hiding and it will show what we need to show
//

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

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DClass d = new DClass();
		d.Greet();
		
	}

}
