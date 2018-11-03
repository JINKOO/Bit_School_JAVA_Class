package kr.ac.smu.day13File;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.smu.util.FileClose;

public class FileIOMain07 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		PrintWriter pw = null;
		//PrintStream도 있다. 
		
		try {
			
			fr = new FileReader("iotest/FileIOMain03.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("iotest/File_copy.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw); //출력을 원활하게.
			
			//얘는 버퍼 2개낌.
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				
//				bw.write(str);
//				bw.newLine(); //계행.
				
				pw.println(str); //출력도 하고 계행.	
			}
			bw.flush();
			System.out.println("완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(br,fr);
			FileClose.close(bw,fw);
		}
		
	}

	
}
