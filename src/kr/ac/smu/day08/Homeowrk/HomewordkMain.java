package kr.ac.smu.day08.Homeowrk;
/*
 * 1. 정사각형  2. 직사각형  3. 삼각형  4. 원
선택 : 3
삼각형을 선택했습니다
밑변 5, 높이 3일때의 삼각형의 넓이는 XXX입니다
계속할래?(종료시 quit입력) => y

1. 정사각형  2. 직사각형  3. 삼각형  4. 원
선택 : 2
직사각형을 선택했습니다
가로 7, 세로 2일때의 직사각형의 넓이는 XXX입니다
계속할래?(종료시 quit입력) => Y

1. 정사각형  2. 직사각형  3. 삼각형  4. 원
선택 : 1
정사각형을 선택했습니다
변의 길이가 5일때의 정사각형의 넓이는 XXX입니다
계속할래?(종료시 quit입력) => quit

 */

//Shape 클라스 = 슈퍼클래스.
//Rectanngle 클라스 = Square클래스의 super클라스
//Shape클라스에 변의 길이를 넣을것인가 아니면 각 sub에서 정의 할 것인가.
public class HomewordkMain {

	public static void main(String[] args) {
		//Junit test: 어느 일부분의 모듈이 잘 돌아가나 확인.
		
		Triangle t = new Triangle(5, 3);
		Circle cir = new Circle(10);
		Rectangle rec = new Rectangle(3,4);
		Square sq = new Square(5);
		
		sq.printArea();
		rec.printArea();
		cir.printArea();
		t.printArea();
		
	}
}
