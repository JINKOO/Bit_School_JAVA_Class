package kr.ac.smu.day11;

import java.util.Random;

//A class�� Generic������� ��ȯ.

class B<T> { //������ Object���� �ƴ϶� Ÿ���� �������ش�.
	//private Object obj; //����� String��, random��... �������� �Ź� �ٸ� Ÿ������ �ϰ� �ʹ�.
    
	private T obj;
	
	B () {
		
	}
	
	B(T obj) {
	
		this.obj = obj;
	}
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
	void info() {
		System.out.println("obj : " + obj);
	}
	
}

class A {
	
	private Object obj;
	
	A() {
		
	}
	
	A(Object obj) {
		this.obj = obj;
	}
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
	
	void info() {
		System.out.println("obj : " + obj);
	}
}

public class GenericMain {

	public static void main(String[] args) {
		
	    B<String> b = new B<String>(new String("������")); //��������� String������ �ϰ� �ʹ�.
		b.getObj();
		
		B<Random> b2 = new B<Random>(new Random());
		b2.getObj();                               //���� ����� ����ȯ�� �� �ʿ䰡 ����.
		
		b.info();
		b2.info();
		
//		Random r1 = (Random).getObj();
//		String str1 = String.getObj();
//		
		
		System.out.println("======================================");
		
		A a = new A(new String("Hello"));
		A a2 = new A(new String("random"));
		
		a.info();
		a2.info();
		
		//��� ��ü�� �� �ִ���.. ����� ����ȯ�� ���.
		A[] arr = {a, a2};
		
		Object obj = arr[0].getObj();
		System.out.println("���ڿ��� ����: " + ((String) obj).length());

		String str = (String)arr[0].getObj();
		System.out.println("���ڿ��� ���� : " + str.length());
		
		Random r = (Random)arr[1].getObj(); //������ ������ �ȳ��µ� �����ϸ� ����: string type�� randomŸ������ �翬�� ������.
		System.out.println("����� ���� : " + r.nextInt(10));
		
		String str2 = (String)arr[1].getObj();
	}
}
