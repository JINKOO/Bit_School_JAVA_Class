package kr.ac.smu.day07;

public class Test {

	public String name;
	String addr;
	private int money;

	public Test() {   
		this.
		name = "ȫ�浿";
		addr = "����� ���ʱ�";
		money = 10000;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public int getMoney() {   //getter �Լ�
		return money;
	}
	
	public void setMoney(int money) { //setter �Լ�
		this.money = money;
	}

	public void info() { //info() �Լ��� Test�� Ŭ���� �ȿ� �����Ƿ� Test�� ��� ��� ���� ��밡��. 
		System.out.println("name : " + name + ", addr : " + addr + ", money : " + money);
	}
}
