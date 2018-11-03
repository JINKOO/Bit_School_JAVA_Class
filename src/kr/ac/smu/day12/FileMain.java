package kr.ac.smu.day12;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		File fileObj = new File("iotest/a.txt");
		//fileObj가 a.txt의 정보를 알아내겠다.
//		File fileObj = new File("C:\\Lecture\\java-workspace\\CalendarHomework\\iotest\\a.txt");
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
	    String absolutePath = fileObj.getAbsolutePath();
		
		System.out.println("파일 이름 : " + fileName);
		System.out.println("상위 폴더 : " + parent);
		System.out.println("경로 : " + path);
		System.out.println("절대 경로 : " + absolutePath);
		
		if(fileObj.exists()) {
			System.out.println("a.txt가 존재합니다.");
		} else {
			System.out.println("a.txt가 존재하지 않습니다.");
		}
		
		long length = fileObj.length(); //파일 크기 알려준다. byte단위. 리턴형이 long타입니다.(크기가 클수 있으니)
		System.out.println("파일 크기 : " + length);
	}
}

