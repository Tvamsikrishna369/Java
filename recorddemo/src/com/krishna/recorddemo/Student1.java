package com.krishna.recorddemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//record student(int id, String name) {
//	
//}



//public class Student1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		student abc = new student(2, "krishna");
//		System.out.print(abc);
//		
//	}
//
//}
//

//-------------------------- INTERFACE ----------------------------
//interface First{
//	public void hello();
//}
//
//class FirstImpl implements First{
//	public void hello() {
//		System.out.println("Hello");
//	}
//}
//
//public class Student1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

//-------------------- COLLECTIONS -----------------------------------

//public class Student1 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String> lstElements = new ArrayList<>();
//		lstElements.add("one");
//		lstElements.add("two");
//		lstElements.add("three");
//		lstElements.add("four");
//		lstElements.remove(1);
		
//		Iterator<String> iterator = lstElements.iterator();
//		while(iterator.hasNext()) {
//			String element = iterator.next();
//			System.out.println(element);
//		}
		
//		for (String str : lstElements){
//			System.out.println(str);
//		}
//		
//		lstElements.forEach(str -> System.out.println(str));
//		
//		System.out.print(lstElements);
//	}
//}


//-------------------- COLLECTIONS -----------------------------------


public class Student1 {
	
	public static void main(String[] args) {
		Map<Integer, Integer> myMap = new HashMap<>();
		myMap.put(1, 2);
		myMap.put(2, 3);
		myMap.put(3, 4);
		myMap.put(4, 5);
	
//		can not iterate by directly we need to use Entry
		
		for(Entry<Integer, Integer> entry : myMap.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("k: " + key + " v: " + value);;
		}
		
	}
}
