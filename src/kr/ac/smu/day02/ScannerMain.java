package kr.ac.smu.day02;

import java.util.Scanner;
//import java.util.Random;
//import java.util.LinkedList;
//import java.util.*; //���� ��Ű���� �ִ� �������� Ŭ���� ���� �� 10�� �̸��϶��� ���� ���ش�. 

/*
 * Scanner �Է� �޼ҵ�
 * 
 * ����
 *  int ���� �Է� : sc.nextInt();
 *  long ���� �Է� : sc.nextLong();
 *  short ���� �Է� : sc.nextShort();
 *  byte ���� �Է� : sc.nextByte();
 *  
 * �Ǽ�
 *  float ���� �Է� : sc.nextFloat();
 *  double ���� �Է� : sc.nextDouble();
 *  
 * ����
 *  boolean�Է� : sc.nextBoolean(); �� true, false���� �Է� �ؾ��Ѵ�.
 *  
 * ���ڿ�
 *  sc.next() : �ܾ� �����θ� �Է�(���ڿ� �Է� ���Ḧ ���鹮�ڷ� �ν�)
 *  sc.nextLine() : ���� ������ �Է�(���ڿ� �Է� ���Ḧ enter�� �ν�)
 *  
 * ����
 *  sc.nextLine().charAt(0)
 */
public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		//Ű���� �Է� => ������ �ڷ��� �ʿ�
		//Scanner Ÿ���� ������ �������Ѵ�.
		//Scanner�� �ٸ� class�� �ִ�.
		
		System.out.println("���� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("���ڿ��� �Է� : ");
		String str1 = sc.next();
		System.out.println("str1 : " + str1);
		
		System.out.println("���ڿ� �Է� : ");
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		
		System.out.println("���� �Է� : ");
		int num1 = sc.nextInt(); //Ű����� ���� �Է� nextInt()�޼ҵ� �̿� //next => ������ �������ڴ�. int���� �������� �ϳ� �������ڴ�.
		System.out.println("num1 : " + num1);
		
		System.out.println("���� �Է�: ");
		long num2 = sc.nextLong();
		System.out.println("num2 : " + num2);
		
		double num3 = sc.nextDouble();
		System.out.println("�Ǽ� �Է�: ");
		System.out.println("num3 : " + num3);
		
		float num4 = sc.nextFloat();
		System.out.println("num4 : " + num4);
	}
}
