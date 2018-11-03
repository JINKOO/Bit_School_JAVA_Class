package kr.ac.smu.day12.homwork;

import java.util.Calendar;

/*
 * �⵵ �Է� �� ������ 1-12�� ���
 * �⵵ �� �Է¹����� Ư�� �� ���
 */

public class CalendarUtil {

	private Calendar c; //��� ������ Ȱ���Ѵ�. �ȱ׷��� �޸� ��� ��ȿ����.
	
	public CalendarUtil() {
	    c = Calendar.getInstance();                 
	}
	
	private void showByDay(int week, int lastDay) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("------------------------------------------------------");
		int count = 0;//�������� �����Ҷ� ����.
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
	
	//Ư�� �⵵. Ư�� ���� �˷��ָ� �ش� ���� ���.
	public void showByMonth(int year, int month) {
//		Calendar c = Calendar.getInstance();     //��ȿ����. 
		c.set(year, month - 1, 1); 
		//�ش� ���� 1���� ��������???
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		//�ش���� ��������??
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); //date�ᵵ �������.
		System.out.println("< " + year + "��" + month + "�� >");
		
		//�޷� ���
		showByDay(week, lastDay);
		
	}
	
	//Ư�� �⵵�� �˷��ָ� 1-12������ �޷� ���.
	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}
}
