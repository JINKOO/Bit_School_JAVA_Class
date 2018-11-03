package kr.ac.smu.day06;

public class MethodMain02 {

	//다른 클래스에 들어있는 메소드를 사용하려면 그 해당 메소드가 있는 클래스를 인스턴스 객체를 생성해야한다.
	public static void main(String[] args) {
		
		Method m = new Method();  //m이 가리키는 객체를 작동하게 한다.
		m.call();
		m.call(10);
		m.call(12.34);
		m.call('A'); //char형이 없지만 묵시형변환으로 얘가 받을 수 있는 메소드를 찾음(int가 있다.)
	}
}
