package kr.ac.smu.day10;

import java.io.FileReader;

abstract class Parent {
	
	abstract void print();
	abstract void read() throws Exception;  //�����Ҷ� Exception �ɾ��ش�.
}

class Child extends Parent {

	@Override
	void print() {
		// TODO Auto-generated method stub
	}

	@Override
	void read() throws Exception {  //read()�� ȣ���� �ֿ��� ����ó��.
		// TODO Auto-generated method stub
	}
}

public class ExceptionMain06 {

	static void a() {
		System.out.println("a() �޼ҵ� ȣ��...");

		try {
			FileReader fr = new FileReader("a.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// static void b() throws NullPointerException, ArithmeticException {
	static void b() throws Exception {
		System.out.println("b() �޼ҵ� ȣ��...");

		// ���� ȣ���� �𿡰� ����ó�� ���ѱ�
		String str = null;
		System.out.println("���ڿ��� ���� : " + str.length());

		System.out.println(10 / 0);

		System.out.println("!!!"); // ���� �߻� ���� ���ѱ�⶧���� ����ȵ�.

	}

	public static void main(String[] args) { //main�޼ҵ忡���� ����ó�� �Ѵ�.

		System.out.println("main start...");

		a();
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException ���� ó��");
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticExeption ���� ó��");
//		}

		System.out.println("main end...");
	}
}
