package kr.ac.smu.day10;

import java.util.Random;

/*
 * ���� ���� ó�� if else ���. but ����ڰ� �������� ���� ���ܰ� �߻��� �� �ִ�. �̷��� �Ϳ� �����ϰ� ��ó�ϰ� �ʹ�.
 * ���� ó�� (������ �߻� �޴��ϴ��� �׺κж����� ���������ϴ� ���� �������ؼ�, ���� �͵��� ���� �����ϰ�)
 * �����ڰ� �ڵ带 �� �� �ǵ���� ����
 * ���� �߻� (����, ����)
 * 
 * (���� ���� ó��)
 * try
 * catch //catch�� ���ٸ� ���α׷� ���� ����ȴ�. 
 * finally /���� ������� ������ ���� �Ǵ� �κ�.
 * 
 * (���� ���� ó��)
 * throws
 * �����Ҷ� ���̾���.
 * �޼ҵ� ������ ���ܸ� ����ó�� �ϴ� ���� �ƴ϶�
 * �ڽ��� ȣ���� ������ ����ó���� ���ѱ�� ���� �ϴ� Ű����
 * ��� ������ ����ó���� �ʿ��մϴ�.
 * ���������� ����ó���ϴ� class�� ���� ����� ��.
 * 
 * ex)
 * abstract class AAA {
 * 
 *   void info() {
 *   }
 *   
 *   abstract void read();
 *   abstract void write();  //read�� write�� ���ܰ� �߻��� �� ���� �� ����. but�����Ҷ��� (�������̵���)try catch�� ���� �Ⱦ��� �𸥴�.
 *   
 *   abstract void read() throws ArithmeticException;
 *   abstract void read() throws NullPointException; //�� �ڵ�� �ݵ�� ���� ó�� �ڵ尡 �ʿ��ϴٰ� ����ϴ°�.
 *   
 *   ���������� ó��
 *   public void print() throws Exception;
 * }
 * 
 * (����� ���� ����ó��)
 * throw
 * ���ܰ� �ƴѵ� ���ܶ�� ���������� �߻�.
 * ����� ����.
 */

public class ExceptionMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		
		int num = r.nextInt(2);//0-2;
		System.out.println("����� ���� : " + num);
		
		System.out.println(10 / num); //JVM�� ���� ó�� ������ ������ ���α׷� ���� 34���� ���� ���� �ʴ´�.
		
		System.out.println("main end...");
	}
}
