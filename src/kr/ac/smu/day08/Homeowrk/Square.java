package kr.ac.smu.day08.Homeowrk;

public class Square extends Rectangle { //한 변의 길이만 알면 된다.

	public Square(int x) {
		super(x,x); //rec에는 매개변수가 2개인 생성자밖에 없다. 호출하면 그 생성자에 넓이 구하는 것이 있기 때문에 여기서 안구해도 된다.
	}

	@Override
	public void printArea() {
		System.out.println("변의 길이가 : " + getX() + "일 때 정사각형의 넓이 : " + getArea() + "입니다.");
	}
	
	
}
