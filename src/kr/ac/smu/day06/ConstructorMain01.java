package kr.ac.smu.day06;

/*
 * 
 * ������ Ư¡
 * 1.Ŭ������� ����
 * 2.��ȯ�� ���� ���� �ʴ´�.
 * 3.JVM�� ����Ʈ ������ �ڵ�����.(�� class���� �����ڰ� �������� �ʴ� ��쿡��)
 * 4.�����ε��� ����
 * 5.��ü�� �ʱ�ȭ(������� �ʱ�ȭ)
 * 
 */

class Car {
	
	Car() {
		System.out.println("����Ʈ ������ Car() ȣ��...");
	}
	
	Car(String name) {
		System.out.println("Car(String) ������ ȣ��");
	}
	
	Car(String name, int price) {
		System.out.println();
	}
	
	void car() { //�����ڶ����� �޼ҵ�� �ҹ��ڷ� ����.
		System.out.println("�Ϲ� �޼ҵ� void Car() ȣ��");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.car();
		
		Car c2 = new Car("�׷���");
		
	}
}
