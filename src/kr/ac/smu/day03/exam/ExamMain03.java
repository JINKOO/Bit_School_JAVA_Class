package kr.ac.smu.day03.exam;

/*
 * 달팽이가 100M깊이의 우물에 빠졌다.
 * 시간당 5M속도로 우물을 기어 오른다.
 * 달팽이가 올라간 우물의 높이가 50M미만이면 -1m/h
 *                     50M이상이면 -2m/h
 *                     
 * [1시간후] 달팽이가 올라간 총높이 : 4m
 * [2시간후] 달팽이가 올라간 총놓이 : 8m
 * ...
 * [xx시간후] 달팽이가 올라간 총높이 : 100m 101m ...
 * 
 */

public class ExamMain03 {

	public static void main(String[] args) {

		int hour = 0;
		int snail = 0;
		
		while(snail < 100) {
			
			snail += (snail < 50 ? 5-1:5-2);	
			System.out.println("[" + ++hour + "]" + "달팽이가 올라간 총 높이 : " + snail + "M");
		
		}
//		while ((snail+=5) < 100) { //달팽이는 100M넘기만 하면 탈출
//			
//			//snail = snail + 5;
//			if (snail < 50) {
//				snail = snail - 1;
//			} else {
//				snail = snail - 2;
//			}
//
//			System.out.println("[" + ++hour + "]" + "달팽이가 올라간 총 높이 : " + snail + "M");
//		}
//		System.out.println("[" + ++hour + "]" + "달팽이가 올라간 총 높이 : " + snail + "M");
	}
}
