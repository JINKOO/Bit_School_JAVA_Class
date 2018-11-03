package kr.ac.smu.day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar
 * 추상 클래스
 * 
 * 항상 현재시간 기준.
 * 
 * 시간 정보를 변경해야할때.
 * set() 오버라이딩 해서 쓴다.
 * 
 * 하위에 그레고리 class가 있다.
 * 
 * Calendar클래스는 객체 생성을 할 수 없다.
 * 
 * Calendar
 * int get(int CalendarField)
 * 
 * 년도 
 * public static final YEAR = 1;
 * get(1); = get(Calendar.YEAR);
 * 
 * getTime() => Cal형을 Date형으로
 */
public class CalendarMain {

	public static void main(String[] args) {
		
//		Date d = new Date();
//		System.out.println("d : " + d);
//		System.out.println("=========================================");
//		
		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		
		//날짜 정보 : 2018년 1월 16일(화)
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)  +1 ;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); //1(일) ~ 7(토)
		String[] dayArr = {"", "일", "월", "화", "수", "목", "금", "토"}; //0 ~ 6
		
		System.out.println("날짜정보 : " + year + "년" + month + "월" + date + "일(" + dayArr[day] + ")");
		
		System.out.println("=======================================");
		//2016년 9월 23일 날자 변경
		
		c.set(2016, 9-1, 23);
		//무슨 요일??
		System.out.println("2016년 9월 23일은 " + dayArr[c.get(Calendar.DAY_OF_WEEK)] + "입니다.");
		
//		int maxDate = c.getActualMaximum(Calendar.MONTH); //월 중에서 가장 큰 달.
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("maxDate : " + maxDate);
		System.out.println("9월은 " + maxDate + "로 구성되어있습니다.");
		
		Date d = c.getTime();
		System.out.println("d : " + d);
		d = new Date();
		c.setTime(d);
		
		System.out.println(c.get(Calendar.YEAR) + "년" + c.get(Calendar.MONTH) + 1 + "월" + c.get(Calendar.DATE) + "일");
		
		
		System.out.println("==================================");
		
		//날짜 정보 : 2018년 1월 16일(화)
		String pattern = "yyyy년 MM년 dd일(E)";
		String pattern2 = "yyyy년 MM년 dd일(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //Date형으로 받는다.
		
		System.out.println("날짜 정보 : " + sdf.format(new Date())); 
		
		//메소드 chain기법 .을이용해서
		c = Calendar.getInstance();
		System.out.println("날짜 정보 : " + sdf.format(c.getTime()));
	}
}
