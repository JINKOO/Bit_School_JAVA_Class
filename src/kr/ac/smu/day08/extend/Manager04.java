package kr.ac.smu.day08.extend;

public class Manager04 extends Employee01 {

	private Employee01[] empList;

	public Manager04(int no, String name, int salary, String grade, Employee01[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info(); //������ �ҰŸ� �̰� ����� �������Ѵ�.
	}
	
	
}
