package kr.ac.smu.day12.homwork;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc /*= new Scanner(System.in)*/;
	private CalendarUtil util; //객체 변수도 이렇게 설정 할 수 있다.
	
	
	public CalendarView() {
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}
	

	//키보드 입력 받는 메소드(클래스로 따로 만들어도 된다.)
	private int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}

	public void process() {
		while (true) {
			int type = scanInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
            //Util class를 이용해야한다. 여기서 객체 만들면 while문 때문에 계속 만드러진다. 멤버변수로 설정
			
			int year = 0, month = 0;    //여기서 변수 미리 선언
			switch (type) {
			case 1:
				year = scanInt("년도 입력 : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("년도 입력 : ");
				month = scanInt("월 입력 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
		}
	}
}
