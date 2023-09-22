package mirea2;

public class c_03_PointTest {

	public static void main(String[] args) {
		Point po = new Point(1,1); // 새 인스턴스를 만듦 Point가 들어간 po로
		po.print();
		
		System.out.println(po.distance());
		Point po2 = new Point(2,2); // 새 인스턴스를 만듦 Point가 들어간 po2로
		System.out.println(po.distanTo(po2)); // po의 값(1,1)
		System.out.println(po2.distance()); // (2,2)
		
		System.out.println(po.theta());
		System.out.println(po2.theta());

	}

}
