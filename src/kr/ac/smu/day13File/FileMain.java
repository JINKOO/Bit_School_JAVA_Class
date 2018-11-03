package kr.ac.smu.day13File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//File class는 오로지 파일관리만된다 파일 내용은 업데이트 못함.

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
//		//파일 객체가 가져온 정보가 파일인지 아닌지 판별.
//		boolean bool = fileObj.isFile();
//		System.out.println(name + " : " + (bool ? "파일 입니다." : "파일이 아닙니다."));
//		
//		bool = fileObj.isDirectory();
//		System.out.println(name + " : " + (bool ? "디렉토리입니다." : "디렉토리가 아닙니다."));
//	    
//		
//		bool = fileObj.exists();
//		System.out.println(name + " : " + (bool ? "존재합니다." : "존재하지 않습니다."));
//		
//		long length = fileObj.length();
//		System.out.println(name + " 크기 : " + length);
//		
//		long lastTime = fileObj.lastModified();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
//		System.out.println("마지막 수정 날짜 : " + sdf.format(new Date(lastTime)));
//		
//		bool = fileObj.canRead();
//		System.out.println(name + " : " + (bool ? "읽기가능" : "일기 불가능"));
//		
//		bool = fileObj.canWrite();
//		System.out.println(name + " : " + (bool ? "쓰기가능" : "쓰기 불가능"));
//		
		
		File dirObj = new File("iotest");
		//디렉 토리에 어떤 정보가 있는지 알아야 한다.
		System.out.println(dirObj.exists() ? "디렉토리 존재" : "디렉터리 존재하지않습니다.");
		
		String[] names = dirObj.list();  //이름만 나옴
		File[] file = dirObj.listFiles(); //파일 배열 형태로 나온다.
		
		System.out.println("-----------------------------------");
		System.out.println("  " + dirObj.getName() + "디렉토리 정보");
		System.out.println("-----------------------------------");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("  " + dirObj.getName() + "디렉토리 정보");
		System.out.println("-----------------------------------");
		for(File name : file) {
			System.out.println(name.getName());
		}
		System.out.println("-----------------------------------");
		
		dirObj = new File("iotest/새 폴더/test");
		Boolean bool = dirObj.mkdir(); //가운데가 존재한다는 가정한다는 하에 test를 만든다.
		System.out.println(bool ? "성공" : "실패");

		dirObj = new File("iotest/꾀꼬리/test");
		bool = dirObj.mkdirs();//자기경로에 없는 것들을 모두 생성한다.
		System.out.println(bool ? "성공" : "실패");

		System.out.println("-------------------------------------");
		bool = dirObj.delete(); //하위것들 부터 삭제한다.
		System.out.println(bool ? "폴더 삭제 성공" : "폴더 삭제 실패");
	}
}
