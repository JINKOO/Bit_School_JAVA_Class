package kr.ac.smu.day08.Homeowrk;

public class Rectangle extends Shape {

	public Rectangle(int x, int y) {
		super(x,y);
		setArea(x * y);
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("���� : " + getX() + "���� : " + getY() + "�϶� ���簢���� ���̴� " + getArea() + "�Դϴ�.");
	}

}
