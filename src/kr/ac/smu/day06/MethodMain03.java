package kr.ac.smu.day06;

class Singer {
	String name;  //������
}

public class MethodMain03 {

	static Singer[] getSingerMethod(String type) {
		
		Singer[] list = {new Singer(), new Singer()};
		
		switch(type) {
		case "�߶��":
			list[0].name = "������";
			list[1].name = "������";
			break;
		case "Ʈ��Ʈ":
			list[0].name = "������";
			list[1].name = "������";
			break;
		default:
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Singer[] list = getSingerMethod("�߶��");   //getSingerMethod()�� MethodMain03class�� �־�� ����.
		                                           //ȣ���ϴ� class�� ��ȣ���� class�� �ٸ��� ������ ��ü.�޼ҵ� ���·� �����ؾ��Ѵ�.
		for(Singer singer : list) {
			System.out.println(singer.name);
		}
	}
}
