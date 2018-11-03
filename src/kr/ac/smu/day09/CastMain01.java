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
//	static void print(Child03 c) {  //child03 만들었는데 여기서 이것도 추가해야된다.
//		c.info();
//	}
	
	//매개변수 묵시적 형변환 //수정하고자 하는 것을 최소화.
	static void print(Parent p) {  //여기서 묵시형변환 발생(매개변수나 리턴 타입으로도 많이 쓴다.)
		p.info();//오버라이딩 발생.
		
		//instance of 쓰는 것은 오로지 상속 관계일때 만 쓴다.
		//Parent p가 들어오는데 얘가 무슨 타입인지 정확히 보고 싶다.
		//p가 가리키는 것이 parent객체인지 child01객체인지, child02객체인지..
		//명시적 형변환을 이용하여 자식의 멤버변수, 메소드를 사용하고 싶다.
		if(p instanceof Child01) {  //무조건 자식 부터 물어봐야한다. 부모부터 물어보면 무조건 true기때문에 여기만 들어간다.
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
//		System.out.println(p instanceof Child01);  //p가 가리키는 것이 Child01이냐
//		System.out.println(p instanceof Child02);
//		System.out.println(p instanceof Child03);
//		System.out.println(p instanceof Parent); //상속
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
		
		//묵시적 객체형변환
		
		Parent p = new Child01(); //p는 parent 타입.
		p.info();                 //오버라이드 때문에 자식의 info가 출력.
		//p.study(); 오버라이드안된것은 안되.
		//p.sleep();
		
		//System.out.println("name : " + p.name);  //private는 자신의 class에서만 가능.class기준.
		                                         //parent형이라고 해서 private 접근 하는 것이 아님.
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
