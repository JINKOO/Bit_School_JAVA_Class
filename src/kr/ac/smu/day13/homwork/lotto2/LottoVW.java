package kr.ac.smu.day13.homwork.lotto2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
		
		Random r = new Random();
		
		Set<Integer> lottoNums = new HashSet<>();
		
		while(lottoNums.size() < 6) {
			lottoNums.add(r.nextInt(45) + 1);
			System.out.print("!");
		}
		
		return Arrays.toString(lottoNums.toArray());
	}
}
