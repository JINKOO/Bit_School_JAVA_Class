package kr.ac.smu.day06;

class Singer {
	String name;  //가수명
}

public class MethodMain03 {

	static Singer[] getSingerMethod(String type) {
		
		Singer[] list = {new Singer(), new Singer()};
		
		switch(type) {
		case "발라드":
			list[0].name = "아이유";
			list[1].name = "헤이즈";
			break;
		case "트로트":
			list[0].name = "장윤정";
			list[1].name = "태진아";
			break;
		default:
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Singer[] list = getSingerMethod("발라드");   //getSingerMethod()가 MethodMain03class에 있어야 가능.
		                                           //호출하는 class와 피호출자 class가 다르면 무조건 객체.메소드 형태로 접근해야한다.
		for(Singer singer : list) {
			System.out.println(singer.name);
		}
	}
}
