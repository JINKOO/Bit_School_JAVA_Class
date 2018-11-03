package kr.ac.smu.day15;

/*
 * 
 * singleton 하나의 객체만 쓰고 싶다.
 * 
 */
class Car {

	private String name;
	private int speed;
	private static Car instance;
//	private static final Car instance = new Car();
	
	private Car() {

	}
	
	public static Car getInstance() {
		if (instance == null) {
			instance = new Car(); // 여기를 상속 받는 애를 하면 되.
		}
		return instance;
	}
}

public class SingletonMain {

	public static void main(String[] args) {

		// 객체를 하나만 만들게 하고 싶다.
		Car c = Car.getInstance();
		Car c2 = Car.getInstance();
		
		System.out.println(c);
		System.out.println(c2);
	}
}
