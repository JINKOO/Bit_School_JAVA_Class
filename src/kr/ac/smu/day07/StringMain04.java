package kr.ac.smu.day07;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello world";
		
		int searchIdx = str.indexOf("e");  //0������ ���� �˻�
		System.out.println("\'e\' ������ġ " + searchIdx);
		
		searchIdx = str.indexOf("o"); //���� ó�� o�� ������ index �� ����
		System.out.println("\'o\' ������ġ " + searchIdx);
		
		searchIdx = str.indexOf("p"); //ã�����ϴ� ���� ���ٸ� -1����
		System.out.println("\'p\' ������ġ " + searchIdx);
		
		searchIdx = str.lastIndexOf("o");  //������ ���� �ϳ��� �˻�. 
		System.out.println("\'o\' ������ ��ġ " + searchIdx);
		
		searchIdx = str.lastIndexOf("world");
		System.out.println("\"world\" ���� ��ġ : " + searchIdx);
		
		//str���� o�� ��ġ�� ��� �˰� ����. => �ݺ����� ����.
		
		char ch = 'l';
//		searchIdx = str.indexOf(ch);
//		searchIdx = str.indexOf(ch,0);
//		while(searchIdx != -1) {
//			System.out.println("\'" + ch + "\" ��ġ : " + searchIdx);
//			searchIdx = str.indexOf(ch,searchIdx + 1); //0���� ���� �˻��ϴ� ���� �ƴ϶� �˻��Ѱ� ���� ��ġ���� �˻�.
//		}
		
		System.out.println("--------------------");
		
		searchIdx = -1;
		while((searchIdx = str.indexOf(ch, searchIdx + 1)) != -1) {
			System.out.println("\'" + ch + "\" ��ġ : " + searchIdx);
			//searchIdx = str.indexOf(ch, searchIdx + 1); //0���� ���� �˻��ϴ� ���� �ƴ϶� �˻��Ѱ� ���� ��ġ���� �˻�.
		}
		
//		System.out.println("--------------------");
//		searchIdx = str.length();
//		while((searchIdx = str.lastIndexOf(ch, searchIdx - 1)) != -1) {
//			System.out.println("\'" + ch + "\" ��ġ : " + searchIdx);
//			searchIdx = str.lastIndexOf(ch, searchIdx - 1);
//		}
		
		
		System.out.println("=======================================");
		
		str = "hello world";
		
		String sub = str.substring(0,5); //0-4���� ����
		sub = str.substring(3,7);
		sub = str.substring(4);  //4���� ���� �� ������ 
		
		System.out.println("sub : [" + sub + "]");
		
		str = "hello";  //"hello!!!";
		str = str + "!!!";
		
		System.out.println("str : [" + str + "]");
		
		str = str.replace("l", "rt");
		System.out.println("������ str : " + str);
		
		str = "     hello     ";
		System.out.println("trim() �� [" +  str + "]���� : "  + str.length());
		
		str = str.trim(); //���ڿ� ������ ������ ������ ���Ѵ�. ������ �ܾ�ö� trim���� ����.
		System.out.println("trim() �� [" +  str + "]���� : "  + str.length());
		
		
		str = "Hello World";
		str = str.toUpperCase(); //�ڽ��� ���� �ٲ���� = ����Ѵ�. ++ -- �� �ڽ��� �� �ٲ�.
		System.out.println("�빮�� ���� : " + str);
		
		str = str.toLowerCase();
		System.out.println("�ҹ��� ���� : " + str);
		
		str = "ȫ�浿��:���:�����ô�"; //:�������� 3���� ���ڿ��� �и�. ���� Ÿ���� �迭Ÿ���̴�.
		String[] sArr = str.split(":");
		System.out.println(Arrays.toString(sArr));
		
		int num = 123; // 123 -> "123" ������ ���ڿ��� �ٲ���.
		//String strNum = num + "";
		String strNum = String.valueOf(num);
		System.out.println("strNum : " + strNum);

		
		char[] chars = {'H', 'e', 'l', 'l', 'o', '!'};
		str = String.valueOf(chars);
		
		System.out.println("str : "  + str);
		
		//"123" -> 123
		int num2 = Integer.valueOf("12345");//���� �ڷ���(int)���� �ٲ��ش�.
		num2 = Integer.parseInt("12345");  //�⺻ �ڷ���(int)���� �ٲ��ش�.
		System.out.println(num2);
	}
}

class MyString1 {
	
	String str;
	
	String concat(String addstr) {
		char[] arr = new char[str.length() + addstr.length()];
		str.getChars(0, str.length(), arr, 0);
		
		for(int i = str.length(), j = 0; i<addstr.length(); i++) {
			arr[i] = addstr.charAt(j++);
		}
		
		return new String(arr); //??
	}
}
