package kr.ac.smu.day08.Homeowrk;

public class Triangle extends Shape {

	public Triangle(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void printArea() {
		//���̸� ��� �� ���.
//		double area = (double)getX() * getY() / 2;   //this.getX() * getY() / 2;
//		setArea(area);
		this.setArea(getX() * getY() / 2.);
		//���
		
		System.out.println("�غ� " + getX() + ", ���� " + getY() + "�϶� ���̴� " + getArea() + "�Դϴ�.");
	}

}
