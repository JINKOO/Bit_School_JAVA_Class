package kr.ac.smu.day08.Homeowrk;
/*
 * 1. ���簢��  2. ���簢��  3. �ﰢ��  4. ��
���� : 3
�ﰢ���� �����߽��ϴ�
�غ� 5, ���� 3�϶��� �ﰢ���� ���̴� XXX�Դϴ�
����ҷ�?(����� quit�Է�) => y

1. ���簢��  2. ���簢��  3. �ﰢ��  4. ��
���� : 2
���簢���� �����߽��ϴ�
���� 7, ���� 2�϶��� ���簢���� ���̴� XXX�Դϴ�
����ҷ�?(����� quit�Է�) => Y

1. ���簢��  2. ���簢��  3. �ﰢ��  4. ��
���� : 1
���簢���� �����߽��ϴ�
���� ���̰� 5�϶��� ���簢���� ���̴� XXX�Դϴ�
����ҷ�?(����� quit�Է�) => quit

 */

//Shape Ŭ�� = ����Ŭ����.
//Rectanngle Ŭ�� = SquareŬ������ superŬ��
//ShapeŬ�󽺿� ���� ���̸� �������ΰ� �ƴϸ� �� sub���� ���� �� ���ΰ�.
public class HomewordkMain {

	public static void main(String[] args) {
		//Junit test: ��� �Ϻκ��� ����� �� ���ư��� Ȯ��.
		
		Triangle t = new Triangle(5, 3);
		Circle cir = new Circle(10);
		Rectangle rec = new Rectangle(3,4);
		Square sq = new Square(5);
		
		sq.printArea();
		rec.printArea();
		cir.printArea();
		t.printArea();
		
	}
}
