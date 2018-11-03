package kr.ac.smu.day08.extend;

public class Employee01 {

	private int no;          //사번
	private String name;        //사원명
	private int salary;      //연봉
	private String grade;    //직급
	
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
		System.out.println("사번 : " + no);
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		System.out.println("직급 : " + grade);
		System.out.println();
	}
}
