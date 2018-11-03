package kr.ac.smu.day02;

public class ConstMain {

	public static void main(String[] args) {
		
		char ch;
		ch = 'A';
		ch = 'a';
		ch = '*';
		ch = '\''; //작은 따옴표를 상수화 시킨다.
		ch = '\"';
		ch = '\u0041';
		ch = '\\';
		String path = "c:\\aaa\\bbb\\aa.txt";  //역슬래쉬 경로 표현할때 2개씩 써야한다.
		
		System.out.println("ch : " + ch);
		
		String str = new String("A");
		str = new String("3");
		str = new String("!");
		str = new String("\""); //쌍따옴표를 상수화 시킨다. 
		str = new String("\'"); 
		
		final double PI = 3.14;  
		//final => 변수를 상수화 시킨다. 고정시킴. 변수와 차이점을 두기 위해 대문자로 써준다.
		//final은 class에도 붙을 수 도 있고 메소드 앞에도 붙을 수 있다. 각각 의미가 다르다.
		
		int radius = 10;
		double area;
		area = radius * radius * PI;
		
		System.out.println("반지름 : " + radius + " => 원 넓이 : " + area);
		
		//pi = 3.141592;   //pi값은 못바꾸게 해야한다.
		radius = 1;
		area = radius * radius * PI;
		System.out.println("반지름 : " + radius + " => 원 넓이 : " + area);
	}
}
