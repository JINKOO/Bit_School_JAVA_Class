package kr.ac.smu.day14;

class NameThread extends Thread {

	public NameThread() {
		super();
	}

	public NameThread(String name) {
		super(name);
	}

	@Override
	public void run() {		
		System.out.println("수행중인 Thread이름 : " + getName());
		
		int index = getName().lastIndexOf('-');
		String str = getName().substring(index);
		
		setName("changeThread" + str);
		
		System.out.println("변경된 THread이름은 : " + getName());
		
		//이 전체 코드를 한 번에 수행해야된다는 가정이 없다.
	}
}

public class NameThreadMain {

	public static void main(String[] args) {
		
		NameThread nt = new NameThread(); //이름 생성 안하면 0부터 만든다.
		NameThread nt2 = new NameThread("nameThread-1"); //이름을 가지는 thread만들 수 있다.
		
		nt.start();
		nt2.start();
		//수행 순서 뒤죽박죽.
	}
}
