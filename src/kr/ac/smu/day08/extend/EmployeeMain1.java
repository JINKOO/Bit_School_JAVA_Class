package kr.ac.smu.day08.extend;

public class EmployeeMain1 {

	public static void main(String[] args) {
		
		Employee01 e1 = new Employee01(1, "ȫ�浿", 3_500, "���");
		Employee01 e2 = new Employee01(2, "������", 4_500, "���");
		Employee01 e3 = new Employee01(3, "���ؿ�", 4_000, "���");
		Employee01 e4 = new Employee01(4, "���ȣ", 3_500, "�븮");
		Employee01 e5 = new Employee01(5, "�輱��", 5_500, "����");
		
//		e1.info();
//		e2.info();
//		e3.info();
//		e4.info();
//		e5.info();
//		
		Employee01[] empList = {e1, e2, e4};
		Manager01 m = new Manager01(100, "��ĸƾ", 8_000, "����", empList);
		
		Manager02 m02 = new Manager02(100, "��ĸƾ", 8_000, "����", empList);
		
		Manager03 m03 = new Manager03(100, "��ĸƾ", 8_000, "����", empList);
		
		//m.info();
		//m02.info();
		m03.info();
	}
}
