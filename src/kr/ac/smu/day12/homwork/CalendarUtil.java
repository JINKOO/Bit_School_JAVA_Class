package kr.ac.smu.day12.homwork;

import java.util.Calendar;

/*
 * 년도 입력 을 받으면 1-12월 출력
 * 년도 월 입력받으면 특정 월 출력
 */

public class CalendarUtil {

	private Calendar c; //멤버 변수로 활용한다. 안그러면 메모리 사용 비효율적.
	
	public CalendarUtil() {
	    c = Calendar.getInstance();                 
	}
	
	private void showByDay(int week, int lastDay) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("------------------------------------------------------");
		int count = 0;//토요일찍고 계행할때 변수.
		for(int i = 1; i<=week-1; i++) {
			System.out.print("\t");
			count++;
		}
		for(int i = 1; i<=lastDay; i++) {
			System.out.print(i + "\t");
			if(++count % 7 == 0)
				System.out.println();
		}
		if(count % 7 != 0)
			System.out.println();
		System.out.println("------------------------------------------------------");
	}
	
	//특정 년도. 특정 월을 알려주면 해당 월을 출력.
	public void showByMonth(int year, int month) {
//		Calendar c = Calendar.getInstance();     //비효율적. 
		c.set(year, month - 1, 1); 
		//해당 월의 1일이 무슨요일???
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		//해당월의 마지막날??
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); //date써도 상관없다.
		System.out.println("< " + year + "년" + month + "월 >");
		
		//달력 출력
		showByDay(week, lastDay);
		
	}
	
	//특정 년도를 알려주면 1-12월까지 달력 출력.
	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}
}
