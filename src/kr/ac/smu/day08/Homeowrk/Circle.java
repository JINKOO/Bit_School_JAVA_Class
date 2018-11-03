package kr.ac.smu.day08.Homeowrk;

public class Circle extends Shape {

	public Circle(int r) {
		super(r);
		setArea(r * r * 3.14);
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("반지름 :" + getX() + "인 원의 넓이 : " + getArea() + "입니다.");
	}
}
