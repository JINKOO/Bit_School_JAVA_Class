package kr.ac.smu.day07.test;

import kr.ac.smu.day07.Test;

public class TestMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println("name : " + t.name); 
//		System.out.println("addr : " + t.addr);  //디폴트 이므로 
//		System.out.println("money : " + t.money); //private이므로
		System.out.println("addr : " + t.getAddr());
		System.out.println("money : " + t.getMoney());
		
		t.info(); //호출만 할뿐.
		//오직 money에 대한 것 만 알고 싶다. => 메소드를 통해. money값을 수정하고 싶다.
		
	}
}
