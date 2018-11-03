package kr.ac.smu.day14;

import java.io.Serializable;

/*
 *   alt + shift + s������ c(�⺻ ������) , o(�Ű����� �ִ� ����),r(setter getter),s(to String) 
 */
public class UserInfo implements Serializable{ //��ü ����ȭ 

	private String name;
	private transient int age; // ��ü ����ȭ �Ҷ� age�� ���ܵȴ�. (age�� �ȳѾ��.);
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

	//��ü�� ������ �ִ� ���� ��� ����.
	//��ü �ľ� Ȯ���ҋ� �� �Լ��� ���°� ����.
	public String toString() {
		return "UserInfo [name= " + name + ", age = " + age + ", Addr = " + addr + "]";
	}
}
