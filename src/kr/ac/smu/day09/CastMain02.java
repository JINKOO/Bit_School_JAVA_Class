package kr.ac.smu.day09;

import java.util.ArrayList;
import java.util.Random;

public class CastMain02 {

	public static void main(String[] args) {
		
		//Child01 = new Parent(); //������ �º��� �� ũ��. ������ �� ���� �߻�.
		
		//Child01 c01 = (Child01)new Parent(); //���� ����. Chile01���� ����X.
		
		Parent p = new Child01(); //������ ����ȯ
		Child01 c01 = (Child01)p; //Child01�޸𸮰� �� ũ��. => ����� ����ȯ
		
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
		
		System.out.println("0���� : " + num);
		System.out.println("4���� : " + obj);    //�ּҰ� ���.
		obj.info();
		obj.study();
		
	}
}
