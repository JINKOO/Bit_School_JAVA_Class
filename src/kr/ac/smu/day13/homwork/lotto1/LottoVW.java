package kr.ac.smu.day13.homwork.lotto1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoVW {

	public void start() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� �Է� : ");
		
		int gameCount= Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i<=gameCount; i++) {
			System.out.println("����" + i + " : " + getLotto());
		}
	}
	
	private String getLotto() {
		int[] lottoNums = new int[6];
		
		Random r = new Random();
		//�ߺ� �� �� �� ������ �ȵȴ�.
		//��� 1
		/*
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1;
			for(int j = 0; j<i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.println("!");
					i--; //�ߺ� �� ���� ������ i�� ���� �ϸ� �ȵȴ�.
					break;
				}
			}
		}
		*/
		//��� 2
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
		
		//��� 3
		/*
		boolean[] flags = new boolean[46]; //0-45������ ���ڰ� ����� ���� �ִ��� üũ�ϴ¿�. false�� �ʱ�ȭ.
		for(int i = 0; i<lottoNums.length;) {
			int num = r.nextInt(45) + 1;
			if(!flags[num]) { //���� ���� ���ٸ�
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
