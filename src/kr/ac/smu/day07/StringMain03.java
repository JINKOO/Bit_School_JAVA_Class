package kr.ac.smu.day07;

public class StringMain03 {

	public static void main(String[] args) {

		String str = new String("Hello");
		String str2 = new String("hello");

		// String str = "hello";
		// String str2 = "hello;"

		// 주소 비교
		if (str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}

		// boolean bool = str.equals(str2);
		boolean bool = str.equalsIgnoreCase(str2);

		// 문자열 비교 서로의 유니코드 값을 비교한다. 0번지 부터 시작
		// if(str.equals(str2)) { //str2대신 상수 문자열이 들어와도 되.
		if (bool) {
			System.out.println("서로 같은 문자열 입니다.");

		} else {
			System.out.println("서로 다른 문자열 입니다.");
		}

		String prefix = "He";

		if (str.startsWith(prefix)) // prefix문자열로 시작하는가.
			System.out.println(str + "은 " + prefix + "로 시작합니다.");
		else
			System.out.println(str + "은 " + prefix + "로 시작되지 않습니다.");

		str = "hello.txt";
		if (str.endsWith(".txt")) { // .txt로 끝나는 파일 검색.
			System.out.println(str + "은 텍스트 파일입니다.");
		} else {
			System.out.println(str + "은 텍스트 파일이 아닙니다.");
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

		String[] names = { "홍길동", "이길순", "홍길순", "홍길동", "최철수", "박수홍", "고길순" };

		// 이름이 홍길동인 사람 검색
		for (String name : names) {
			// if(name.equals("홍길동")) {
			if (name.compareTo("홍길동") == 0) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 홍씨 성을 가진 사람 검색 >");
		
		for(int i = 0; i<names.length; i++) {
			if(names[i].startsWith("홍")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("< 이름이 길동인 사람 검색 >");
		
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름에 홍이 있는 사람 검색 >");
	
		for(String name : names) {
			if(name.contains("홍"))
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



