package kr.ac.smu.day08.Homeowrk;

//�� ������ ����Ŭ����
public abstract class Shape {

	private int x;
	private int y;
	private double area;
	//x y�� ���� ���̰� �� �� �� �ְ� �������� �� �� �� �ִ�.

	public Shape(int x) {//�� ���̿� ���� ������.
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
