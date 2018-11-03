package kr.ac.smu.day06;

/*
 *  매개변수 생성자만 만들때에도 기본적으로 디폴트 생성자를 무조건 만든다. 오류 감지.
 */
class Member {

	String name;
	int age;
	String bloodtype;

	Member() {
		this("이름 없음");
	}

	Member(String name) {
		this(name, -1);
	}

	Member(String name, int age) {
		this(name, -1, "알 수 없음");
	}

	Member(String name, int age, String bloodtype) {
		this.name = name;
		this.age = age;
		this.bloodtype = bloodtype;
	}

	// Member(){
	// this("이름 없음", -1, "알수 없음");
	// }
	//
	// Member(String name) {
	// this(name, -1, "알수 없음");
	// }
	//
	// Member(String name, int age) {
	//
	// this(name, age, "알수 없음"); //생성자의 맨 처음
	//// this.name = name;
	//// this.age = age;
	//// this.bloodtype = "알수없음";
	// }
	//
	// Member(String name, int age, String bloodtype){
	// this.name = name;
	// this.age = age;
	// this.bloodtype = bloodtype;
	//
	// }
	//
	void info() {
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age);
		System.out.println("혈액형:" + this.bloodtype);
		System.out.println();
	}
}

public class ConstructorMain02 {

	public static void main(String[] args) {

		Member m1 = new Member();
		Member m2 = new Member("고진권");
		Member m3 = new Member("고진권", 26);
		Member m4 = new Member("고진권", 26, "A");

		m1.info();
		m2.info();
		m3.info();
		m4.info();
	}
}
