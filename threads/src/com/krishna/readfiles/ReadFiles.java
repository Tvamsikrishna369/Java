package com.krishna.readfiles;

import java.io.File;

public class ReadFiles {

	public static void main(String[] args) {
//		FileReader filereader = null;
//		try {
//			filereader = new FileReader("java");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		BufferedReader reader = new BufferedReader(filereader);
//		
//		System.out.println(reader);
		
		
//		File folder = new File("/Java);
//		File[] fileoffoler = folder.listFiles();
//		
//		for (File file: fileoffoler) {
//			if(file.isFile()) {
//				System.out.println(file.getName())
//			}
//		}
		
//		String path = "D:\\Java";
//		File rootPath = new File(path);
//		String[] fileList = rootPath.list();
//		for(String filename : fileList) {
//			File file = new File(filename);
//			System.out.println(file.getName());
//		} 
		
		
		String path = "D:\\Java\\threads";
		traversDirectory(path);
//		File rootPath = new File(path);
//		String[] filesList = rootPath.list();
//		File[] listFiles = rootPath.listFiles();
//		for(File file : listFiles) {
////			File file = new File(filename);
//			if(file.isDirectory()) {
//				File[] subfilesList = getFilesList(file.getPath());
//				for(File sfile: subfilesList) {					
//					System.out.println(sfile.getName() + " is " + (sfile.isDirectory() ? "Directory : " : "file : "));
//				}
//			} else 
//				System.out.println("file: " + file.getName());
//			
//		} 
	}
	
	
	public static void traversDirectory(String path) {
		File file = new File(path);
		if(file != null && file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for(File sfile: listFiles) {
				System.out.println(sfile.getName() + " " + (sfile.isDirectory() ? "Directory" : "File"));
				File subFile = new File(sfile.getPath());
				System.out.println(subFile.getName() + " " + (subFile.isDirectory() ? "Directory" : "File"));
				traversDirectory(subFile.getPath());
			}
		}
		return;
		
	}

//	public static File[] getFilesList(String path) {
//		// TODO Auto-generated method stub
//		File file = new File(path);
//		if(file.isDirectory()) {
//			return file.listFiles();
//		}
//		return null;
//	}

	
}
