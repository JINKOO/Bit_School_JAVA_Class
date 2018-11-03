package kr.ac.smu.day09;

import java.util.ArrayList;
import java.util.Random;

public class CastMain02 {

	public static void main(String[] args) {
		
		//Child01 = new Parent(); //범위는 좌변이 더 크다. 컴파일 시 오류 발생.
		
		//Child01 c01 = (Child01)new Parent(); //실행 오류. Chile01공간 생성X.
		
		Parent p = new Child01(); //묵시적 형변환
		Child01 c01 = (Child01)p; //Child01메모리가 더 크다. => 명시적 형변환
		
		c01.info();
		c01.sleep();
		c01.study();
	/*
	 *  public class ArrayList{
	 *        
	 *      public void add(Object obj) {
	 *      
	 *            
	 *      }
	 *      
	 *      public Object get(int index) {
	 *      
	 *      }  
	 *  }
	 */
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(12.34);
		list.add(new Random());
		list.add(new Child01());
		
		int num = (int)list.get(0);
		
		Child01 obj = (Child01)list.get(4);
		
		System.out.println("0번지 : " + num);
		System.out.println("4전지 : " + obj);    //주소값 출력.
		obj.info();
		obj.study();
		
	}
}
