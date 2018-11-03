package kr.ac.smu.day09;

public class CastMain01 {

//	static void print(Child01 c) {
//		c.info();
//	}
//	
//	static void print(Child02 c) {
//		c.info();
//	}
//	
//	static void print(Child03 c) {  //child03 ������µ� ���⼭ �̰͵� �߰��ؾߵȴ�.
//		c.info();
//	}
	
	//�Ű����� ������ ����ȯ //�����ϰ��� �ϴ� ���� �ּ�ȭ.
	static void print(Parent p) {  //���⼭ ��������ȯ �߻�(�Ű������� ���� Ÿ�����ε� ���� ����.)
		p.info();//�������̵� �߻�.
		
		//instance of ���� ���� ������ ��� �����϶� �� ����.
		//Parent p�� �����µ� �갡 ���� Ÿ������ ��Ȯ�� ���� �ʹ�.
		//p�� ����Ű�� ���� parent��ü���� child01��ü����, child02��ü����..
		//����� ����ȯ�� �̿��Ͽ� �ڽ��� �������, �޼ҵ带 ����ϰ� �ʹ�.
		if(p instanceof Child01) {  //������ �ڽ� ���� ��������Ѵ�. �θ���� ����� ������ true�⶧���� ���⸸ ����.
			Child01 c01 = (Child01)p;
			c01.sleep();
			c01.sleep();
			
		} else if(p instanceof Child02) {
			Child02 c02 =(Child02)p;
			c02.play();
			c02.sing();
			c02.info();
			
		} else if(p instanceof Child03) {
			
		} else if(p instanceof Parent) {
			
		}
//		System.out.println(p instanceof Child01);  //p�� ����Ű�� ���� Child01�̳�
//		System.out.println(p instanceof Child02);
//		System.out.println(p instanceof Child03);
//		System.out.println(p instanceof Parent); //���
	}
	
	
	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		c01.info();
		c01.study();
		c01.sleep();
		
		Child02 c02 = new Child02();
		c02.info();
		c02.play();
		c02.sing();
		
		System.out.println("============================");
		
		//������ ��ü����ȯ
		
		Parent p = new Child01(); //p�� parent Ÿ��.
		p.info();                 //�������̵� ������ �ڽ��� info�� ���.
		//p.study(); �������̵�ȵȰ��� �ȵ�.
		//p.sleep();
		
		//System.out.println("name : " + p.name);  //private�� �ڽ��� class������ ����.class����.
		                                         //parent���̶�� �ؼ� private ���� �ϴ� ���� �ƴ�.
		p= new Child02();
		p.info();
		
		System.out.println("============================");
		
		print(new Child01());
		print(new Child02());
		print(new Child03());
		//print(new Parent());
		
		System.out.println("============================");
		
		Parent obj = Parent.getInstance();
		obj.info();
		
	}
}
