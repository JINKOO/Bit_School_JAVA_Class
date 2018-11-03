package kr.ac.smu.day13.homwork.lotto1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoVW {

	public void start() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 수 입력 : ");
		
		int gameCount= Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i<=gameCount; i++) {
			System.out.println("게임" + i + " : " + getLotto());
		}
	}
	
	private String getLotto() {
		int[] lottoNums = new int[6];
		
		Random r = new Random();
		//중복 된 수 가 나오면 안된다.
		//방법 1
		/*
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1;
			for(int j = 0; j<i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.println("!");
					i--; //중복 된 수가 나오면 i가 증가 하면 안된다.
					break;
				}
			}
		}
		*/
		//방법 2
		/*
		outer : for(int i = 0; i<lottoNums.length;) {
			lottoNums[i] = r.nextInt(45) + 1;
			for(int j = 0; j<i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					continue outer;
				}
			}
			i++;
		}
		*/
		
		//방법 3
		/*
		boolean[] flags = new boolean[46]; //0-45사이의 숫자가 사용한 적이 있는지 체크하는용. false로 초기화.
		for(int i = 0; i<lottoNums.length;) {
			int num = r.nextInt(45) + 1;
			if(!flags[num]) { //사용된 적이 없다면
				lottoNums[i++] = num;
				flags[num] = true;
			} else {
				System.out.println("!");
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return Arrays.toString(lottoNums);
	}
}
