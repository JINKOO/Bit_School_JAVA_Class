package kr.ac.smu.day08.extend;

class A extends Object{ //�̷��� ������ class�� public�ϼ� ����. .java���Ϸ� �����Ѱ��� public���� 
	
	A() {
		super();  //Object������ ����Ʈ �����ڰ� �����Ǿ��ִ�. 
		System.out.println("A()������  ȣ��");
	}
}

class B extends A {
	
	B() {
		super();  //��Ű���尡 �����Ǿ��ִ�. �ᵵ �׸� �Ƚᵵ �׸�.
		System.out.println("B()������ ȣ��");
	}
}

class C extends B {

	C() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	C() {
//		System.out.println("C() ������ ȣ��");
//	}
}

public class ExtendMain {

	public static void main(String[] args) {
		
		new B();  //object ������ -> A������ -> B������
	}
}
