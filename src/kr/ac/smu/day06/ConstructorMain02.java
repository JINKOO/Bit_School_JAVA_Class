package kr.ac.smu.day06;

/*
 *  �Ű����� �����ڸ� ���鶧���� �⺻������ ����Ʈ �����ڸ� ������ �����. ���� ����.
 */
class Member {

	String name;
	int age;
	String bloodtype;

	Member() {
		this("�̸� ����");
	}

	Member(String name) {
		this(name, -1);
	}

	Member(String name, int age) {
		this(name, -1, "�� �� ����");
	}

	Member(String name, int age, String bloodtype) {
		this.name = name;
		this.age = age;
		this.bloodtype = bloodtype;
	}

	// Member(){
	// this("�̸� ����", -1, "�˼� ����");
	// }
	//
	// Member(String name) {
	// this(name, -1, "�˼� ����");
	// }
	//
	// Member(String name, int age) {
	//
	// this(name, age, "�˼� ����"); //�������� �� ó��
	//// this.name = name;
	//// this.age = age;
	//// this.bloodtype = "�˼�����";
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
		System.out.println("�̸�:" + this.name);
		System.out.println("����:" + this.age);
		System.out.println("������:" + this.bloodtype);
		System.out.println();
	}
}

public class ConstructorMain02 {

	public static void main(String[] args) {

		Member m1 = new Member();
		Member m2 = new Member("������");
		Member m3 = new Member("������", 26);
		Member m4 = new Member("������", 26, "A");

		m1.info();
		m2.info();
		m3.info();
		m4.info();
	}
}
