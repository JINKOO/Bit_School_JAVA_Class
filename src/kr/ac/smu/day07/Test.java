package kr.ac.smu.day07;

public class Test {

	public String name;
	String addr;
	private int money;

	public Test() {   
		this.
		name = "홍길동";
		addr = "서울시 서초구";
		money = 10000;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public int getMoney() {   //getter 함수
		return money;
	}
	
	public void setMoney(int money) { //setter 함수
		this.money = money;
	}

	public void info() { //info() 함수는 Test의 클래스 안에 있으므로 Test의 모든 멤버 변수 사용가능. 
		System.out.println("name : " + name + ", addr : " + addr + ", money : " + money);
	}
}
