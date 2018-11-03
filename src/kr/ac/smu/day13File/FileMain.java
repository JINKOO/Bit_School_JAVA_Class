package kr.ac.smu.day13File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//File class�� ������ ���ϰ������ȴ� ���� ������ ������Ʈ ����.

public class FileMain {

	public static void main(String[] args) {
		
//		File fileObj = new File("iotest/a.txt");
//		
//		String name = fileObj.getName();
//		String path = fileObj.getParent();
//		String absolutePath = fileObj.getAbsolutePath();
//		
//		System.out.println(name);
//		System.out.println(path);
//		System.out.println(absolutePath);
//		
//		
//		//���� ��ü�� ������ ������ �������� �ƴ��� �Ǻ�.
//		boolean bool = fileObj.isFile();
//		System.out.println(name + " : " + (bool ? "���� �Դϴ�." : "������ �ƴմϴ�."));
//		
//		bool = fileObj.isDirectory();
//		System.out.println(name + " : " + (bool ? "���丮�Դϴ�." : "���丮�� �ƴմϴ�."));
//	    
//		
//		bool = fileObj.exists();
//		System.out.println(name + " : " + (bool ? "�����մϴ�." : "�������� �ʽ��ϴ�."));
//		
//		long length = fileObj.length();
//		System.out.println(name + " ũ�� : " + length);
//		
//		long lastTime = fileObj.lastModified();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
//		System.out.println("������ ���� ��¥ : " + sdf.format(new Date(lastTime)));
//		
//		bool = fileObj.canRead();
//		System.out.println(name + " : " + (bool ? "�бⰡ��" : "�ϱ� �Ұ���"));
//		
//		bool = fileObj.canWrite();
//		System.out.println(name + " : " + (bool ? "���Ⱑ��" : "���� �Ұ���"));
//		
		
		File dirObj = new File("iotest");
		//�� �丮�� � ������ �ִ��� �˾ƾ� �Ѵ�.
		System.out.println(dirObj.exists() ? "���丮 ����" : "���͸� ���������ʽ��ϴ�.");
		
		String[] names = dirObj.list();  //�̸��� ����
		File[] file = dirObj.listFiles(); //���� �迭 ���·� ���´�.
		
		System.out.println("-----------------------------------");
		System.out.println("  " + dirObj.getName() + "���丮 ����");
		System.out.println("-----------------------------------");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("  " + dirObj.getName() + "���丮 ����");
		System.out.println("-----------------------------------");
		for(File name : file) {
			System.out.println(name.getName());
		}
		System.out.println("-----------------------------------");
		
		dirObj = new File("iotest/�� ����/test");
		Boolean bool = dirObj.mkdir(); //����� �����Ѵٴ� �����Ѵٴ� �Ͽ� test�� �����.
		System.out.println(bool ? "����" : "����");

		dirObj = new File("iotest/�Ҳ���/test");
		bool = dirObj.mkdirs();//�ڱ��ο� ���� �͵��� ��� �����Ѵ�.
		System.out.println(bool ? "����" : "����");

		System.out.println("-------------------------------------");
		bool = dirObj.delete(); //�����͵� ���� �����Ѵ�.
		System.out.println(bool ? "���� ���� ����" : "���� ���� ����");
	}
}
