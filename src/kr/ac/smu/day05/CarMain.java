package kr.ac.smu.day05;

class Car {
	// Car.java������ ���� ���� �� �ִ�. �� ���� package�ȿ��� ������ class�� �����ϸ� �ȵȴ�.
	// ���� ����� �ٸ� package������ ���� �ִ�.
	// ���� �̹���� ���� ���� �ȸ���� �Ż縮�� main �޼ҵ�ȿ��� ����°� �� ���̴� ���� package�ȿ����� ��밡���ϴ�.
	// �Ż縮 �� class�� ������ default ����������. public���� �ȵȴ�.
	
	String name; //�� �̸�
	int price;   //���� ���� ���� 
	             //���� �� �̸��� ���ݿ� ���� �ͱ��� �߻�ȭ ��Ų����.���赵���� �׸��� ��
	             //heap������ �޸�ȭ ���Ѿ��Ѵ�.(��ü�� �������Ѿ�)

}

public class CarMain {
	// main �޼ҵ带 ������ �ִ� class
	// ������ new�̿��ؼ� ��ü�� ����� �ؾ������� main�޼ҵ带 ������ �ִ� class�� JVM�� �ڵ����� ���డ���ϰ���
	
	int a; //�̰��� �������.

	public static void main(String[] args) {

		int num;       //�޼ҵ� �ȿ� ����� ������ '��������'
		new Car();         //Car class�� �̿��ؼ� ��ü�� ����.(name �� price�� ������ ����)
		Car c = new Car(); //heap�� �ִ� Car�� �ּҰ��� ����ϱ� ���� ���������� �ʿ��ϴ�.c���� �ּҰ��� ����ִ�.
		                   //���� ������ ���ؼ� ��ü ���� (�������� ��ü�� �����ϴ� �����̴�.)
		                   //�� ��ü�� �������ִ� ��������� �޼ҵ带 �ľ� �ϴ� ���� �߿��ϴ�.
		                   //��ü�� �ּҸ� ������ �ִ� ���������� ������ ����.(heap���ִ� data�� �����ϱ� ���ؼ��� stack(��������)�� ���ؼ� ����).
		                   //���ٹ�� = c.������� or c.�޼ҵ�
		System.out.println(c); //���������� ������ �ִ°��� �ּҰ�
		System.out.println("name : " + c.name + ", price : " + c.price); //���� default���̹Ƿ� null, 0�� ���.
		
		
		c.name = "�׷���";
		c.price = 3200;
		System.out.println("name : " + c.name + ", price : " + c.price);
		
		Car c2 = new Car(); //�� �ϳ��� car ��ü ����. c1�� ������ �и��� �Ǿ��Ѵ�.
		c2.name = "Ƽ����";
		c2.price = 1800;
		
		//c�� c2�� �и��Ǿ��Ѵ�.
		//���� ������ ���� �޶�����.
		System.out.println("---------------------");
		System.out.println("name : " + c.name + ", price : " + c.price);
		System.out.println("name : " + c2.name + ", price : " + c2.price);
	}
}
