package com.krishna.threads;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class FileUtil{
	public static List<File> traversDirectory(String path) {
		File file = new File(path);
		List<File> lstFiles = new ArrayList<>();
		if(file != null && file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for(File sfile: listFiles) {
				if(sfile.isFile()) {
					lstFiles.add(sfile);
				}
				if(sfile.isDirectory()){
					lstFiles.addAll(traversDirectory(sfile.getPath()));
				}
			}
		}
		return lstFiles;	
	}
}



//class mytraverseTask implements runnable{
//	
//	public void someMethod() {
//		FileUtil futil= new FileUtil();
//		List<File> files = futil.traversDirectory(path1);
//	}
//
//	String path1 = "D:\\Java\\threads";
//	
////	public void run() {
////		FileUtil futil= new FileUtil();
////		List<File> files = futil.traversDirectory(path1);
//		
////	}
//}




public class ReadFilesDeep {

	public static void main(String[] args) {

		String path = "D:\\Java\\threads";
		FileUtil futil = new FileUtil();
		List<File> files = futil.traversDirectory(path);
		System.out.println(files);


		

//	private static void traversDirectory(String path) {
//		// TODO Auto-generated method stub
//		
	}

}

//	private static List<File> traversDirectory(String path) {
//		// TODO Auto-generated method stub
//		return null;
//	}
