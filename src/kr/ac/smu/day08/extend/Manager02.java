package kr.ac.smu.day08.extend;

public class Manager02 extends Employee02 {  //protected �� ��ӹ��� ���迡�� ����. setter getter �Ƚᵵ �ȴ�. ���� �����ϴϱ�.

	Employee01[] empList;

	public Manager02(int no, String name, int salary, String grade, Employee01[] empList) {

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

		for (Employee01 e : empList) {
			e.info(); // Employee1�� �ִ� info �޼ҵ�
		}

	}

}
