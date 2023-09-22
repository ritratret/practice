package mirea2;

public class Circle { // 포인터로 점 구했으니 반지름이 있으면 둘레perimeters와 넓이 area를 구할 수 있음
	Point po; // class안에 class가 들어옴: Composition(구성한다)
	
	private double radius; 		// 반지름
	private double perimeters; 	// 2*Math.pi*radius
	private double area; 		// Math.pi*radius^2
	
	public Circle() {}
	public Circle(Point po, double radius) {
		this.po = po; this.radius = radius;
	}
	public void calcPerimeter() {
		perimeters = 2*Math.PI*radius;
	}
	public void calcArea() {
		area = Math.PI* radius * radius;
	}
	public void setPoint(Point po) {
		this.po = po;
	}
	public Point getPoint() {
		return po;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void print() {
		po.print();
		System.out.println("반지름 = " + radius);
	}
	
	public boolean collision(Circle cl) {
		double tot_radius = this.radius + cl.radius; // 두 원의 반지름의 합이, 두 원 사이의 길이보다 크면 충돌
		double dist = po.distanTo(cl.po);//쉼표아니고 쩜 인거 잊지말기!!!!!!!!!!!!
		if (dist < tot_radius) return true;
		else return false;
	}

}
