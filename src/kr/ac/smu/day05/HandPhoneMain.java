package kr.ac.smu.day05;

public class HandPhoneMain {
/*
 * 프로그램 실행을 위한 class (Main 메소드를 가지고 있는 class)
 * 실행 class
 */
	public static void main(String[] args) {
		
		HandPhone hp1 = new HandPhone(); //instance 객체 생성.
		HandPhone hp2 = new HandPhone();
		HandPhone hp3 = new HandPhone();
		
		hp1.name = new String("홍길동");  //String class의 특징.
		hp1.phone = "010-3187-5668";   
		hp1.company = "삼성";
		
		//hp2 객체 생성.
		hp2.name = "고길순";
		hp2.phone = "010-3470-5665";
		hp2.company = "애플";
		
		//hp3 객체 생성. 
		hp3.name = "최길동";
		hp3.phone = "010-4346-5667";
		hp3.company = "엘지";
		
		//출력 => 출력 만큼은 노가다를 어떻게 하면 적게 할 수 있을까? => (참조)변수인 hp1, hp2, hp3만 다르다. => 배열 사용 할 수 있다.
		//HandPhone형의 배열을 만든다.
		System.out.println("소유쥬 : " + hp1.name + ", 전화번호 : " + hp1.phone + ", 제조사 : " + hp1.company);
		System.out.println("소유쥬 : " + hp2.name + ", 전화번호 : " + hp2.phone + ", 제조사 : " + hp2.company);
		System.out.println("소유쥬 : " + hp3.name + ", 전화번호 : " + hp3.phone + ", 제조사 : " + hp3.company);
		
		System.out.println("---------------------------------------");
		System.out.println("HandPhone형 배열을 이용한 출력");
		//HandPhone형의 배열을 만든다.
		//방법 1 : 배열에 일일히 대입하여 출력
		HandPhone[] hpArr = {hp1, hp2, hp3};
		
		for(int i = 0; i<hpArr.length; i++) {
			System.out.println("소유주 : " + hpArr[i].name + ", 전화번호 : " + hpArr[i].phone + ", 제조사 : " + hpArr[i].company);
		}
		
		System.out.println("---------------------------------------");
		//방법 2 : 배열 선언후 초기화하고 출력
		HandPhone[] hpArr2 = new HandPhone[3];  //참조변수만 만들었을 뿐 handphone객체를 가리키는 것은 생성하지 않음. nullpoint에러 발생.
		/*for(int i = 0; i<hpArr2.length; i++) {  //이 코드가 있어야 각 참조변수가 객체를 가리킨다.
			hpArr2[i] = new HandPhone();        //[] 가 아니라 ()를 통해 인스턴스를 만든다. 인스턴스를 만드는 경우는 배열이 아니라 메소드에 의해서만 만들 수 있다.
		}
		*/
		//HandPhone[] hpArr2 = new HandPhone[] {new HandPhone(), new HandPhone(), new HandPhone()}; 
		//아래 방식은 에러가난다.
		hpArr[0].name = "홍길동";
		hpArr[1].name = "고길순";
		hpArr[2].name = "최길동";
		for(int i = 0; i<hpArr2.length; i++) {  //참조변수가 가리키는 값이 없기 때문에 에러가 발생한다. 
			System.out.print(" 소유주 : " + hpArr2[i].name); 
		}
	}
}
