package kr.ac.smu.day08.Homeowrk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest {

	@Ignore
	@Test
	public void 삼각형Test() {
		Triangle shape = new Triangle(10,7);  //객체를 만들수 있는 지 test
		//shape.printArea();
		//assertNotNull(shape);  //shape에 있는 값이 null이 아닐 거야 예측.
		//예측성공하면 초록색 //예측 실패하면 빨간색.
		//출력하는 대신에 확인.
		//assertNull(shape);
		
		//assertEquals(3, shape.getArea(), 0); //
	}
	//@Ignore
	
	@Test
	public void 정사각형() {
		
	}
}
