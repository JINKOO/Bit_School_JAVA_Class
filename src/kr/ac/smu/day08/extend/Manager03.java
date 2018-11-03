package kr.ac.smu.day08.extend;

public class Manager03 extends Employee01 {

	Employee01[] empList;

	public Manager03(int no, String name, int salary, String grade, Employee01[] empList) {

		super(no, name, salary, grade);  //private선언된 변수를 super메소드를 통해 접근. 생성자 이용 값은 super에서 초기화한다.(같은 class)
//		this.no = no;
//		this.name = name;
//		this.salary = salary;
//		this.grade = grade;              //얘네는 원래 Employee1것이다.
		this.empList = empList;

	}

	@Override
	public void info() { //오버라이딩
		
		super.info(); 
		
		System.out.println("=====================");
		System.out.println("\t<관리 사원 목록>");

		for (Employee01 e : empList) {
			e.info(); // Employee1에 있는 info 메소드
		}
	}
}
