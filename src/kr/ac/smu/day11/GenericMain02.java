package kr.ac.smu.day11;

import java.util.Date;
import java.util.Random;

class ArrayList<T> {
	
	private T[] list;
	int loc;
	
	public ArrayList() {
		// TODO Auto-generated constructor stub
	//	list = new T[10];
		loc = 0;
	}
	
	void add(T obj) {
//		if(loc == list.length) {
//			Object[] copy = new Object[list.length * 2];
//			System.arraycopy(list, 0, copy, 0, loc);
//			list = copy;
//		}
		list[loc++] = obj;
	}
}

//class ArrayList {
//	
//	private Object[] list;
//	int loc;
//	
//	public ArrayList() {
//		// TODO Auto-generated constructor stub
//		list = new Object[10];
//		loc = 0;
//	}
//	
//	void add(Object obj) {
//		if(loc == list.length) {
//			Object[] copy = new Object[list.length * 2];
//			System.arraycopy(list, 0, copy, 0, loc);
//			list = copy;
//		}
//		list[loc++] = obj;
//	}
//}

public class GenericMain02 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("Hello"));
		list.add("good-bye");
		list.add(new StringBuilder("abc").toString());
		//list.add(new Random());
//		ArrayList list = new ArrayList();
//		
//		list.add(new String("Hello"));
//		list.add(new Random());
//		list.add(new Date());
//		
	}
}
