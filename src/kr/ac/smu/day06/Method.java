package kr.ac.smu.day06;

/*
 * �޼ҵ� �����ε�(�Ű������� ���� ������ ����� �ϸ� �̸��� ���� �ϰ� ����) 
 *  :���� class������ �޼ҵ� ���� �����ϳ�
 *   �Ű������� ������ �ڷ����� ���� �ٸ� ��. => ���� �ٸ� �޼ҵ�� �ν��Ѵ�.
 *   ex) System.out.println("hello");
 *       System.out.println();
 *       System.out.println(10);
 *       
 *   class PrintWriter {
 *      
 *      void println(String str) {}
 *      void println(int i) {}
 *      void println(char c) {}
 *      
 *   }
 */

public class Method {

	//��ü ���� ���α׷������� �޼ҵ带 �����ϴ� ���� �޼ҵ�� + �Ű������� �����Ѵ�.
	//C���� �޼ҵ� ������ �޼ҵ��;
	//���� �ڹٿ����� �Ű������� �ٸ��� ������ �޼ҵ�� ����.
	void call() {
		System.out.println("call() �޼ҵ� ȣ��...");
	}
	
//	int call() { //���� Ÿ���� �޼ҵ� ���� ���� ���Ѵ�.
//		System.out.println("call() �޼ҵ� ȣ��" );
//		return 1;
//	}
	
//	void call(char c) {
//		System.out.println("call() �޼ҵ� ȣ��...");
//	}
	
//	void call(int i) {  //�޼ҵ� �����ε�
//		System.out.println("call(int) �޼ҵ� ȣ��...");
//	}
	void call(double d) {
		System.out.println("call(double) �޼ҵ� ȣ��...");
	}
	
	void call(String str) {
		System.out.println("call(String) �޼ҵ� ȣ��");
	}
	void call(String str, int i) {
		System.out.println("call(String, int) �޼ҵ� ȣ��");
	}
}
