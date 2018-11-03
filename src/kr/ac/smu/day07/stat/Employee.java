package kr.ac.smu.day07.stat;

public class Employee {

	private String name; // �����
	static int employeeCount;// �� ��� ��

	public Employee(String name) {
		this.name = name;
		Employee.employeeCount++; // ����� ���ö� ���� �� ��� ���� �����ȴ�.
		System.out.println(name + "����� �Ի� �߽��ϴ�.");
		System.out.println("���ݱ��� �Ի��� �� ����� : " + employeeCount + "��");
		// ���� ��ü�� 3�� �����Ǽ� ������ ��ü�� employeeCount������ �ֱ⶧����.
		// ��ü�� 3���� ��������� ��� ��ü�� �ϳ��� employeeCount������ �����Ǿ���Ѵ�. -> static������ �ʿ伺.
	}
	
	public void info() {
		System.out.println("��� �̸� : " + name);
	}
	
	public static void empCount() {
		System.out.println("�Ի��� �� ��� �� : " + Employee.employeeCount + "��");
		//info(); �ȵȴ�.
	}	
}
