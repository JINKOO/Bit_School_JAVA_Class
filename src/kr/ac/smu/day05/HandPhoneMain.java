package kr.ac.smu.day05;

public class HandPhoneMain {
/*
 * ���α׷� ������ ���� class (Main �޼ҵ带 ������ �ִ� class)
 * ���� class
 */
	public static void main(String[] args) {
		
		HandPhone hp1 = new HandPhone(); //instance ��ü ����.
		HandPhone hp2 = new HandPhone();
		HandPhone hp3 = new HandPhone();
		
		hp1.name = new String("ȫ�浿");  //String class�� Ư¡.
		hp1.phone = "010-3187-5668";   
		hp1.company = "�Ｚ";
		
		//hp2 ��ü ����.
		hp2.name = "����";
		hp2.phone = "010-3470-5665";
		hp2.company = "����";
		
		//hp3 ��ü ����. 
		hp3.name = "�ֱ浿";
		hp3.phone = "010-4346-5667";
		hp3.company = "����";
		
		//��� => ��� ��ŭ�� �밡�ٸ� ��� �ϸ� ���� �� �� ������? => (����)������ hp1, hp2, hp3�� �ٸ���. => �迭 ��� �� �� �ִ�.
		//HandPhone���� �迭�� �����.
		System.out.println("������ : " + hp1.name + ", ��ȭ��ȣ : " + hp1.phone + ", ������ : " + hp1.company);
		System.out.println("������ : " + hp2.name + ", ��ȭ��ȣ : " + hp2.phone + ", ������ : " + hp2.company);
		System.out.println("������ : " + hp3.name + ", ��ȭ��ȣ : " + hp3.phone + ", ������ : " + hp3.company);
		
		System.out.println("---------------------------------------");
		System.out.println("HandPhone�� �迭�� �̿��� ���");
		//HandPhone���� �迭�� �����.
		//��� 1 : �迭�� ������ �����Ͽ� ���
		HandPhone[] hpArr = {hp1, hp2, hp3};
		
		for(int i = 0; i<hpArr.length; i++) {
			System.out.println("������ : " + hpArr[i].name + ", ��ȭ��ȣ : " + hpArr[i].phone + ", ������ : " + hpArr[i].company);
		}
		
		System.out.println("---------------------------------------");
		//��� 2 : �迭 ������ �ʱ�ȭ�ϰ� ���
		HandPhone[] hpArr2 = new HandPhone[3];  //���������� ������� �� handphone��ü�� ����Ű�� ���� �������� ����. nullpoint���� �߻�.
		/*for(int i = 0; i<hpArr2.length; i++) {  //�� �ڵ尡 �־�� �� ���������� ��ü�� ����Ų��.
			hpArr2[i] = new HandPhone();        //[] �� �ƴ϶� ()�� ���� �ν��Ͻ��� �����. �ν��Ͻ��� ����� ���� �迭�� �ƴ϶� �޼ҵ忡 ���ؼ��� ���� �� �ִ�.
		}
		*/
		//HandPhone[] hpArr2 = new HandPhone[] {new HandPhone(), new HandPhone(), new HandPhone()}; 
		//�Ʒ� ����� ����������.
		hpArr[0].name = "ȫ�浿";
		hpArr[1].name = "����";
		hpArr[2].name = "�ֱ浿";
		for(int i = 0; i<hpArr2.length; i++) {  //���������� ����Ű�� ���� ���� ������ ������ �߻��Ѵ�. 
			System.out.print(" ������ : " + hpArr2[i].name); 
		}
	}
}
