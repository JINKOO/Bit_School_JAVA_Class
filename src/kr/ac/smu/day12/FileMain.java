package kr.ac.smu.day12;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		File fileObj = new File("iotest/a.txt");
		//fileObj�� a.txt�� ������ �˾Ƴ��ڴ�.
//		File fileObj = new File("C:\\Lecture\\java-workspace\\CalendarHomework\\iotest\\a.txt");
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
	    String absolutePath = fileObj.getAbsolutePath();
		
		System.out.println("���� �̸� : " + fileName);
		System.out.println("���� ���� : " + parent);
		System.out.println("��� : " + path);
		System.out.println("���� ��� : " + absolutePath);
		
		if(fileObj.exists()) {
			System.out.println("a.txt�� �����մϴ�.");
		} else {
			System.out.println("a.txt�� �������� �ʽ��ϴ�.");
		}
		
		long length = fileObj.length(); //���� ũ�� �˷��ش�. byte����. �������� longŸ�Դϴ�.(ũ�Ⱑ Ŭ�� ������)
		System.out.println("���� ũ�� : " + length);
	}
}

