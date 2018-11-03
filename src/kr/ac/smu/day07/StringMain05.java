package kr.ac.smu.day07;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = new String();
		
		long start = System.currentTimeMillis(); //����ð��� �̾��ش�. ���� Ÿ���� long
		for(int i = 0; i< 100000; i++) {
			str = str + i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("�ҿ�ð� : " + (end - start) / 1000. + "��");
		
		
		System.out.println();
		
		//-----------------------------------------------------------------------------------------
		
		StringBuffer sb = new StringBuffer(); //����ִ� ���ڿ��� ����� ���
		
		start= System.currentTimeMillis();
		for(int i = 1; i<100000; i++) {
			sb.append(i);  //�⺻ �ڷ��� + String class�� +�� ���ڿ� ǥ������
		}
		
		end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� : " + (end - start) / 1000. + "��");
	}
}
