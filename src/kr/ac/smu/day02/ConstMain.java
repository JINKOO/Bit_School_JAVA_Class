package kr.ac.smu.day02;

public class ConstMain {

	public static void main(String[] args) {
		
		char ch;
		ch = 'A';
		ch = 'a';
		ch = '*';
		ch = '\''; //���� ����ǥ�� ���ȭ ��Ų��.
		ch = '\"';
		ch = '\u0041';
		ch = '\\';
		String path = "c:\\aaa\\bbb\\aa.txt";  //�������� ��� ǥ���Ҷ� 2���� ����Ѵ�.
		
		System.out.println("ch : " + ch);
		
		String str = new String("A");
		str = new String("3");
		str = new String("!");
		str = new String("\""); //�ֵ���ǥ�� ���ȭ ��Ų��. 
		str = new String("\'"); 
		
		final double PI = 3.14;  
		//final => ������ ���ȭ ��Ų��. ������Ŵ. ������ �������� �α� ���� �빮�ڷ� ���ش�.
		//final�� class���� ���� �� �� �ְ� �޼ҵ� �տ��� ���� �� �ִ�. ���� �ǹ̰� �ٸ���.
		
		int radius = 10;
		double area;
		area = radius * radius * PI;
		
		System.out.println("������ : " + radius + " => �� ���� : " + area);
		
		//pi = 3.141592;   //pi���� ���ٲٰ� �ؾ��Ѵ�.
		radius = 1;
		area = radius * radius * PI;
		System.out.println("������ : " + radius + " => �� ���� : " + area);
	}
}
