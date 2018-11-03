package kr.ac.smu.day12.homwork;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc /*= new Scanner(System.in)*/;
	private CalendarUtil util; //��ü ������ �̷��� ���� �� �� �ִ�.
	
	
	public CalendarView() {
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}
	

	//Ű���� �Է� �޴� �޼ҵ�(Ŭ������ ���� ���� �ȴ�.)
	private int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}

	public void process() {
		while (true) {
			int type = scanInt("�׸��� �����ϼ���(1.Ư���⵵ 2.Ư���� 3.����) : ");
            //Util class�� �̿��ؾ��Ѵ�. ���⼭ ��ü ����� while�� ������ ��� ���巯����. ��������� ����
			
			int year = 0, month = 0;    //���⼭ ���� �̸� ����
			switch (type) {
			case 1:
				year = scanInt("�⵵ �Է� : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("�⵵ �Է� : ");
				month = scanInt("�� �Է� : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			}
		}
	}
}
