package kr.ac.smu.day08.extend;

public class Employee01 {

	private int no;          //���
	private String name;        //�����
	private int salary;      //����
	private String grade;    //����
	
//	public Employee01() {
//		
//	}
	
	public Employee01(int no, String name, int salary, String grade) {
		
		this.no= no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		
	}
	
	public void info() {
		System.out.println("��� : " + no);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + grade);
		System.out.println();
	}
}
