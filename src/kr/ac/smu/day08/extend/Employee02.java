package kr.ac.smu.day08.extend;

public class Employee02 {

	protected int no;          //���
	protected String name;        //�����
	protected int salary;      //����
	protected String grade;    //����
	
	public Employee02() {
		
	}
	
	public Employee02(int no, String name, int salary, String grade) {
		
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
