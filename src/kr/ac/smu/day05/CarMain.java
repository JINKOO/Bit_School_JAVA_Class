package kr.ac.smu.day05;

class Car {
	// Car.java파일을 따로 만들 수 있다. 단 같은 package안에는 동명의 class가 존재하면 안된다.
	// 따로 만들면 다른 package에서도 쓸수 있다.
	// 현재 이방법은 따로 파일 안만들고 꼽사리로 main 메소드안에서 만드는것 이 아이는 같은 package안에서만 사용가능하다.
	// 꼽사리 낀 class는 무조건 default 접근제한자. public쓰면 안된다.
	
	String name; //차 이름
	int price;   //차에 대한 가격 
	             //현재 차 이름과 가격에 대한 것까지 추상화 시킨것임.설계도면을 그린것 뿐
	             //heap영역에 메모리화 시켜야한다.(객체를 생성기켜야)

}

public class CarMain {
	// main 메소드를 가지고 있는 class
	// 원래는 new이용해서 객체를 만들고 해야하지만 main메소드를 가지고 있는 class는 JVM이 자동으로 실행가능하게함
	
	int a; //이것이 멤버변수.

	public static void main(String[] args) {

		int num;       //메소드 안에 선언된 변수는 '지역변수'
		new Car();         //Car class를 이용해서 객체를 만듦.(name 과 price를 가지고 있음)
		Car c = new Car(); //heap에 있는 Car의 주소값을 기억하기 위한 참조변수가 필요하다.c에는 주소값이 들어있다.
		                   //참조 변수를 통해서 객체 접근 (여러개의 객체를 구분하는 목적이다.)
		                   //그 객체가 가지고있는 멤버변수와 메소드를 파악 하는 것이 중요하다.
		                   //객체의 주소를 가지고 있는 참조변수를 가지고 접근.(heap에있는 data를 접근하기 위해서는 stack(참조변수)을 통해서 접근).
		                   //접근방식 = c.멤버변수 or c.메소드
		System.out.println(c); //참조변수가 가지고 있는값은 주소값
		System.out.println("name : " + c.name + ", price : " + c.price); //현재 default값이므로 null, 0이 출력.
		
		
		c.name = "그랜져";
		c.price = 3200;
		System.out.println("name : " + c.name + ", price : " + c.price);
		
		Car c2 = new Car(); //또 하나의 car 객체 만듬. c1과 무조건 분리가 되야한다.
		c2.name = "티볼리";
		c2.price = 1800;
		
		//c와 c2는 분리되야한다.
		//참조 변수명에 따라 달라진다.
		System.out.println("---------------------");
		System.out.println("name : " + c.name + ", price : " + c.price);
		System.out.println("name : " + c2.name + ", price : " + c2.price);
	}
}
