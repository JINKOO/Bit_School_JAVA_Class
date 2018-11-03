package kr.ac.smu.day07;

public class StringMain03 {

	public static void main(String[] args) {

		String str = new String("Hello");
		String str2 = new String("hello");

		// String str = "hello";
		// String str2 = "hello;"

		// �ּ� ��
		if (str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}

		// boolean bool = str.equals(str2);
		boolean bool = str.equalsIgnoreCase(str2);

		// ���ڿ� �� ������ �����ڵ� ���� ���Ѵ�. 0���� ���� ����
		// if(str.equals(str2)) { //str2��� ��� ���ڿ��� ���͵� ��.
		if (bool) {
			System.out.println("���� ���� ���ڿ� �Դϴ�.");

		} else {
			System.out.println("���� �ٸ� ���ڿ� �Դϴ�.");
		}

		String prefix = "He";

		if (str.startsWith(prefix)) // prefix���ڿ��� �����ϴ°�.
			System.out.println(str + "�� " + prefix + "�� �����մϴ�.");
		else
			System.out.println(str + "�� " + prefix + "�� ���۵��� �ʽ��ϴ�.");

		str = "hello.txt";
		if (str.endsWith(".txt")) { // .txt�� ������ ���� �˻�.
			System.out.println(str + "�� �ؽ�Ʈ �����Դϴ�.");
		} else {
			System.out.println(str + "�� �ؽ�Ʈ ������ �ƴմϴ�.");
		}

		String strA = new String("banana");
		String strB = new String("boat");

		int compare = strA.compareTo(strB);

		if (compare == 0) {
			System.out.println(strA + "==" + strB);
		} else if (compare < 0) {
			System.out.println(strA + "<" + strB);
		} else
			System.out.println(strA + ">" + strB);

		String[] names = { "ȫ�浿", "�̱��", "ȫ���", "ȫ�浿", "��ö��", "�ڼ�ȫ", "����" };

		// �̸��� ȫ�浿�� ��� �˻�
		for (String name : names) {
			// if(name.equals("ȫ�浿")) {
			if (name.compareTo("ȫ�浿") == 0) {
				System.out.println(name);
			}
		}
		
		System.out.println("< ȫ�� ���� ���� ��� �˻� >");
		
		for(int i = 0; i<names.length; i++) {
			if(names[i].startsWith("ȫ")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("< �̸��� �浿�� ��� �˻� >");
		
		for(String name : names) {
			if(name.endsWith("�浿")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< �̸��� ȫ�� �ִ� ��� �˻� >");
	
		for(String name : names) {
			if(name.contains("ȫ"))
				System.out.println(name);
		}
	}
}

class MyString {

	String str;

	int compareTo(String str2) {

		int i = 0;
		while (i != str.length() && i != str2.length()) {
			if (str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
			i++;
		}
		if (str.length() == str2.length())
			return 0;
		if (i == str.length())
			return -str2.charAt(i);
		return str.charAt(i);
	}
}



