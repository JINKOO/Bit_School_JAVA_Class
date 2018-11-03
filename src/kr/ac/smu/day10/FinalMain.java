package kr.ac.smu.day10;

import java.util.Random;

/*
 * 117.16.40.180
 * final Ű���� 
 * 1. ��� ���� : ���(���� ����)
 * 2. �޼ҵ�    : �������̵� ����
 * 3. Ŭ����    : ��� ����.
 */

/*final*/ class Super {

	private /*final*/ int max = 100;
	
	public Super() {
		max = 50;
	}
	
	public /*final*/ void info() {
		System.out.println("Super class���� ������ info()�޼ҵ�...");
	}
}

class Sub extends Super {
	
	@Override
	public void info() {
		System.out.println("Sub class���� �������� info()�޼ҵ�...");
	}
}

class MyRandom extends Random {  //������ �ִ� API�� ��ӹ޾� ������ �޼ҵ带 �������̵� �Ͽ� �����ϰ��� �Ҷ� �̷��� �� �� �ִ�.

	@Override
	public int nextInt(int bound) { //nextInt�� randomŬ������ �޼ҵ�. 
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;
	}
}

//class MyString extends String {  //String class�� final�̾ �� ������� ������ �� �� ����.
//	
//}

public class FinalMain {

	public static void main(String[] args) {
		
		//1~100���� ����
//		Random r = new Random();
//		
//		int random = r.nextInt(100) + 1;
//		//random �� ���� 0����. +1�� ���̱� �ȴ�.
//		System.out.println("����� ���� : " + random);
		
		
		//���� �ִ� class�� �����ؼ� �����.
		MyRandom r = new MyRandom();
		int random = r.nextInt(100); //1~100
		System.out.println("����� ���� : " + random);
		
	}
}
