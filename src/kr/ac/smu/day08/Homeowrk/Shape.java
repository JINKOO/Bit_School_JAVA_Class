package kr.ac.smu.day08.Homeowrk;

//각 도형의 슈퍼클래스
public abstract class Shape {

	private int x;
	private int y;
	private double area;
	//x y는 변의 길이가 될 수 도 있고 반지름이 될 수 도 있다.

	public Shape(int x) {//원 넓이에 대한 반지름.
		this.x = x; //this(x,x);
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract void printArea(); 
}
