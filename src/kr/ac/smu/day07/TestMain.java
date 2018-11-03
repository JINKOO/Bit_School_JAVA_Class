package kr.ac.smu.day07;

public class TestMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println("이름 : " + t.name);
		System.out.println("주소 : " + t.addr);
		System.out.println("잔액 : " + t.getMoney());
//		System.out.println("잔액 : " + t.money); //Test class의 money는 private지정자이다.

//		t.money = 20000;
		t.setMoney(20000);
		t.info();
	}
}
