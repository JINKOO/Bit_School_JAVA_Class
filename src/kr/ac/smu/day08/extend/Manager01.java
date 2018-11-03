package kr.ac.smu.day08.extend;

public class Manager01 {

	int no;
	String name;
	int salary;
	String grade;        //�� 4���� ��� ������ ��ӹ޴� ������ ����
	Employee01[] empList;
	
	
	public Manager01(int no, String name, int salary, String grade, Employee01[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	public void info() {
		
		System.out.println("��� : " + no);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + grade);
		
		System.out.println("=====================");
		System.out.println("\t<���� ��� ���>");
		
		for(Employee01 e : empList) {
			e.info(); //Employee1�� �ִ� info �޼ҵ�
		}
		
	}
}
