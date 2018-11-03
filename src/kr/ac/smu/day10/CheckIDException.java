package kr.ac.smu.day10;

//내가 정의한 예외타입

//클라스만 정의하면 된다.
public class CheckIDException extends Exception {

	public CheckIDException() {
		super();
	}

	public CheckIDException(String message) {
		super(message);
	}
}
