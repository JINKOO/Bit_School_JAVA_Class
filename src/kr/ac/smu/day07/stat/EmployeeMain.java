package kr.ac.smu.day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee("ȫ�浿");
		Employee e2 = new Employee("��浿");
		Employee e3 = new Employee("�ֱ浿");
		
		e.info();
		e2.info();
		e3.info();
		
		Employee.empCount();
		
	}
}
