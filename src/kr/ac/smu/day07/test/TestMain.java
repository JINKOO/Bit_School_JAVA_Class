package kr.ac.smu.day07.test;

import kr.ac.smu.day07.Test;

public class TestMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println("name : " + t.name); 
//		System.out.println("addr : " + t.addr);  //����Ʈ �̹Ƿ� 
//		System.out.println("money : " + t.money); //private�̹Ƿ�
		System.out.println("addr : " + t.getAddr());
		System.out.println("money : " + t.getMoney());
		
		t.info(); //ȣ�⸸ �һ�.
		//���� money�� ���� �� �� �˰� �ʹ�. => �޼ҵ带 ����. money���� �����ϰ� �ʹ�.
		
	}
}
