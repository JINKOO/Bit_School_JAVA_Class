package kr.ac.smu.day07;

public class TestMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println("�̸� : " + t.name);
		System.out.println("�ּ� : " + t.addr);
		System.out.println("�ܾ� : " + t.getMoney());
//		System.out.println("�ܾ� : " + t.money); //Test class�� money�� private�������̴�.

//		t.money = 20000;
		t.setMoney(20000);
		t.info();
	}
}
