package kr.ac.smu.day08.extend;

public class EmployeeMain1 {

	public static void main(String[] args) {
		
		Employee01 e1 = new Employee01(1, "홍길동", 3_500, "사원");
		Employee01 e2 = new Employee01(2, "고진권", 4_500, "사원");
		Employee01 e3 = new Employee01(3, "김준원", 4_000, "사원");
		Employee01 e4 = new Employee01(4, "우상호", 3_500, "대리");
		Employee01 e5 = new Employee01(5, "김선민", 5_500, "과장");
		
//		e1.info();
//		e2.info();
//		e3.info();
//		e4.info();
//		e5.info();
//		
		Employee01[] empList = {e1, e2, e4};
		Manager01 m = new Manager01(100, "나캡틴", 8_000, "부장", empList);
		
		Manager02 m02 = new Manager02(100, "나캡틴", 8_000, "부장", empList);
		
		Manager03 m03 = new Manager03(100, "나캡틴", 8_000, "부장", empList);
		
		//m.info();
		//m02.info();
		m03.info();
	}
}
