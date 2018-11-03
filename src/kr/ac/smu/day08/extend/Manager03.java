package kr.ac.smu.day08.extend;

public class Manager03 extends Employee01 {

	Employee01[] empList;

	public Manager03(int no, String name, int salary, String grade, Employee01[] empList) {

		super(no, name, salary, grade);  //private����� ������ super�޼ҵ带 ���� ����. ������ �̿� ���� super���� �ʱ�ȭ�Ѵ�.(���� class)
//		this.no = no;
//		this.name = name;
//		this.salary = salary;
//		this.grade = grade;              //��״� ���� Employee1���̴�.
		this.empList = empList;

	}

	@Override
	public void info() { //�������̵�
		
		super.info(); 
		
		System.out.println("=====================");
		System.out.println("\t<���� ��� ���>");

		for (Employee01 e : empList) {
			e.info(); // Employee1�� �ִ� info �޼ҵ�
		}
	}
}
