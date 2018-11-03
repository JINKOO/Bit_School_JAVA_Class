package kr.ac.smu.day08.extend;

public class Manager02 extends Employee02 {  //protected 은 상속받은 관계에서 쓴다. setter getter 안써도 된다. 접근 가능하니까.

	Employee01[] empList;

	public Manager02(int no, String name, int salary, String grade, Employee01[] empList) {

		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;

	}

	public void info() {

		System.out.println("사번 : " + no);
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		System.out.println("직급 : " + grade);

		System.out.println("=====================");
		System.out.println("\t<관리 사원 목록>");

		for (Employee01 e : empList) {
			e.info(); // Employee1에 있는 info 메소드
		}

	}

}
