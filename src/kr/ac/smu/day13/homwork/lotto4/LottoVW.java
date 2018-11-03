package kr.ac.smu.day13.homwork.lotto4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list); //섞어주는 기능.
		
		int[] lottoNums = new int[6];
		for(int i = 0; i<lottoNums.length; i++) {
			lottoNums[i] = list.get(i);
		}
		
		return Arrays.toString(lottoNums);
	}
}
