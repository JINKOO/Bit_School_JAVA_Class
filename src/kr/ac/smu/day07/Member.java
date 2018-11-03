package kr.ac.smu.day07;

public class Member {

	private String name;
	private String phone;
	private String addr;
	private char gender;
	
	//생성자 자동완성 기능.
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String name, String phone, String addr, char gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.gender = gender;
	}


	//멤버 변수당 set,get함수를 만들어야 하는데 멤버변수가 많으면 불편하다. 자동 완성 기능 쓴다.
	public String getName() {
		return name;
	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
