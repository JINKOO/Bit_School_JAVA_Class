package kr.ac.smu.day07;

public class Member {

	private String name;
	private String phone;
	private String addr;
	private char gender;
	
	//������ �ڵ��ϼ� ���.
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


	//��� ������ set,get�Լ��� ������ �ϴµ� ��������� ������ �����ϴ�. �ڵ� �ϼ� ��� ����.
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
