package kr.ac.smu.day08.extend;

public class Employee02 {

	protected int no;          //사번
	protected String name;        //사원명
	protected int salary;      //연봉
	protected String grade;    //직급
	
	public Employee02() {
		
	}
	
	public Employee02(int no, String name, int salary, String grade) {
		
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
