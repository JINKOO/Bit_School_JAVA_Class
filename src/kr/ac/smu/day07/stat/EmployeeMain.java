package kr.ac.smu.day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee("홍길동");
		Employee e2 = new Employee("고길동");
		Employee e3 = new Employee("최길동");
		
		e.info();
		e2.info();
		e3.info();
		
		Employee.empCount();
		
	}
}
