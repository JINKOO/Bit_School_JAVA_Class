package kr.ac.smu.day08.Homeowrk;

public class Circle extends Shape {

	public Circle(int r) {
		super(r);
		setArea(r * r * 3.14);
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("������ :" + getX() + "�� ���� ���� : " + getArea() + "�Դϴ�.");
	}
}
