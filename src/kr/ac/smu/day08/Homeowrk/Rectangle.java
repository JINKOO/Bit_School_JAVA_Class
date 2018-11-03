package kr.ac.smu.day08.Homeowrk;

public class Rectangle extends Shape {

	public Rectangle(int x, int y) {
		super(x,y);
		setArea(x * y);
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("가로 : " + getX() + "세로 : " + getY() + "일때 직사각형의 넓이는 " + getArea() + "입니다.");
	}

}
