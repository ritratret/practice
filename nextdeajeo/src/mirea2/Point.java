package mirea2;

public class Point { // 포인터. 각도에 따른 길이
	public double x;
	public double y;

	public Point() {
	} // 배열을 사용할때는 default 생성자를 만들어야함!! 그냥 생성하는게 자동
	// 만약 만들지 않을 시 기본적으로 default 생성자 만들어 줌!!!
	// 하지만 직접만들면 자동으로 안만들어주니까 기본적으로 그냥 만들자
	// 매개변수가 없는 생성자 만듦

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	public double distance() { // 포인트의 원점으로부터의 거리값이 나옴
		return Math.sqrt(x * x + y * y); // 루트
	}

	public double distanTo(Point po) { // 포인터로 들어온 값과의 차로 거리를 구함. 두 점 간의 거리
		double dx = this.x - po.x;
		// double은 표현자리가 많아서 정밀할 수 있다. int는 정수로만 움직여서 좀더 정확함
		double dy = this.y - po.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public double theta() {// 세타 - 원점과 이어진 직선의 안쪽 각도
		double radian_result = Math.atan2(x, y); // 길이를 주면 라디안으로 바꿔줌
		return Math.toDegrees(radian_result); // toDegrees:라디안을 각도로 바꿔줌
	}

	public void print() {
		System.out.println("x= " + x + "y=" + y);
	}
	public void printx() {
		System.out.println("x= " + x);
	}
	public void printy() {
		System.out.println("y=" + y);
	}

}
