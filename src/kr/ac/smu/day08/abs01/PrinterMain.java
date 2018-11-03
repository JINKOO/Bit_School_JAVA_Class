package kr.ac.smu.day08.abs01;

/*
 * 출력할 프린터를 입력하세요(1. LG,  2. SAMSUNG) : 1
 * LG프린터에서 출력중...
 * 
 * 출력할 프린터를 입력하세요(1. LG,  2. SAMSUNG) : 2
 * SMASYNG프린터에서 출력중...
 */
public class PrinterMain {

	public static void main(String[] args) {  //main메소드의 내용부는 짧을 수록 좋다.
		
		Menu menu = new Menu();
		menu.process();
		
	}
}
