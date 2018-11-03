package kr.ac.smu.day15;

/*
 * 
 * singleton �ϳ��� ��ü�� ���� �ʹ�.
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
			instance = new Car(); // ���⸦ ��� �޴� �ָ� �ϸ� ��.
		}
		return instance;
	}
}

public class SingletonMain {

	public static void main(String[] args) {

		// ��ü�� �ϳ��� ����� �ϰ� �ʹ�.
		Car c = Car.getInstance();
		Car c2 = Car.getInstance();
		
		System.out.println(c);
		System.out.println(c2);
	}
}
