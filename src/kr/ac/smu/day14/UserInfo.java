package kr.ac.smu.day14;

import java.io.Serializable;

/*
 *   alt + shift + s누른후 c(기본 생성자) , o(매개변수 있는 생성),r(setter getter),s(to String) 
 */
public class UserInfo implements Serializable{ //객체 직렬화 

	private String name;
	private transient int age; // 객체 직렬화 할때 age는 제외된다. (age는 안넘어간다.);
	private String addr;
	
	public UserInfo() {
		
	}
	
	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	//객체가 가지고 있는 값을 찍기 위해.
	//객체 파악 확인할떄 이 함수를 쓰는게 좋다.
	public String toString() {
		return "UserInfo [name= " + name + ", age = " + age + ", Addr = " + addr + "]";
	}
}
