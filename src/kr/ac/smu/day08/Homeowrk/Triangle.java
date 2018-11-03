package kr.ac.smu.day08.Homeowrk;

public class Triangle extends Shape {

	public Triangle(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void printArea() {
		//넓이를 계산 후 출력.
//		double area = (double)getX() * getY() / 2;   //this.getX() * getY() / 2;
//		setArea(area);
		this.setArea(getX() * getY() / 2.);
		//출력
		
		System.out.println("밑변 " + getX() + ", 높이 " + getY() + "일때 넓이는 " + getArea() + "입니다.");
	}

}
