package kr.ac.smu.day07.stat;

public class Employee {

	private String name; // 사원명
	static int employeeCount;// 총 사원 수

	public Employee(String name) {
		this.name = name;
		Employee.employeeCount++; // 사원이 들어올때 마다 총 사원 수는 증가된다.
		System.out.println(name + "사원이 입사 했습니다.");
		System.out.println("지금까지 입사한 총 사원수 : " + employeeCount + "명");
		// 현재 객체가 3개 생성되서 각각의 객체가 employeeCount가지고 있기때문에.
		// 객체는 3개가 만들어져도 모든 객체가 하나의 employeeCount변수가 공유되어야한다. -> static변수의 필요성.
	}
	
	public void info() {
		System.out.println("사원 이름 : " + name);
	}
	
	public static void empCount() {
		System.out.println("입사한 총 사원 수 : " + Employee.employeeCount + "명");
		//info(); 안된다.
	}	
}
