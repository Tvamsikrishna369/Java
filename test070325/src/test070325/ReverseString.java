package test070325;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "hello World";
		
		String reverse = "";

		
		for(int i=test.length()-1; i >=0; i-- ) {
			
			reverse += test.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
