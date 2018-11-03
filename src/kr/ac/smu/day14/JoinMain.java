package kr.ac.smu.day14;


class BoyThread extends Thread {
	
	public void run() {
		System.out.println("(남자 친구) : 나는 남자친구 Thread입니다.");
		System.out.println("(남자 친구) : 오늘 여자친구와 영화를 보기로 하였습니다.");
		System.out.println("(남자 친구) : 예매한 영화시간이 얼마 남지 않았습니다.");
//		System.out.println("(남자 친구) : 여자친구가 올때 까지 기다리겠습니다.");
		System.out.println("(남자 친구) : 나의 인내심은 5초까지다.");
		
		//여자친구의 Thread가 다끝나고 수행ㅎ야한다.
		GirlThread gt = new GirlThread();
		gt.start();
		
		
		//여자친구thread가 끝날때까지 run에서 빠져서 block으로 간다. 끝나는 시점을 계속 기다리고
		//만역 여자친구에 무한반복 코드가 있으면 boy는계속 block
		try {
//			gt.join();
			gt.join(5000); //5초가 지나면 무조건 runnalble로
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		System.out.println("(남자 친구) : 여자친구가 왔습니다.");
//		System.out.println("(남자 친구) : 여자친구와 영화를 보러갑니다.");
		System.out.println("(남자 친구) : 5초지낫다. 집에간다.");
	}
}

class GirlThread extends Thread {
	
	public void run() {
		
		System.out.println("(여자친구) : 나는 여자친구 Thread입니다.");
		System.out.println("(여자친구) : 오늘 남자친구의 애정도를 체크하겠습니다.");
		System.out.println("(여자친구) : 10초도 못기다리면 남자친구가 아니겠죠???");
	
		for(int i = 1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("(여자친구) : " + i + "초가 지났습니다. 남자친구가 기다릴까요??");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("(여자친구) : 남자친구가 없습니다.");
	}
}

public class JoinMain {

	public static void main(String[] args) {
		
		BoyThread bt = new BoyThread();
		bt.start();
		
//		GirlThread gt = new GirlThread();
//		gt.start();
		
	}
}
