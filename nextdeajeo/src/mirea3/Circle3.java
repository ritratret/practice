package mirea3;

public class Circle3 {
	ColorPoint po; // class
	double radius;
	double perimeter;
	double area;

	public Circle3() {
	}

	public Circle3(double radius) { // 생성자1
		this.radius = radius;
		this.po = new ColorPoint();
		calcPerimeter();
		calcArea();
	}

	public Circle3(double radius, ColorPoint po) { // 생성자2
		this.radius = radius;
		this.po = po;
		calcPerimeter();
		calcArea();
	}

	public void calcPerimeter() {
		perimeter = 2 * Math.PI * radius;
	}

	public void calcArea() {// 넓이
		area = Math.PI * radius * radius;
	}

	public ColorPoint getPo() {
		return po;
	}

	public void setPo(ColorPoint po) {
		this.po = po;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		calcPerimeter();
		calcArea();
	}

	public double getPerimeters() {
		return perimeter;
	}

	public void setPerimeters(double perimeters) {
		this.perimeter = perimeters;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean collisionCheck(Circle3 cl) { // 충돌값
		double radius = this.radius + cl.radius;
		double dist = this.po.distanTo(cl.po);
		return dist < radius; // 반지름 더한 값보다 점의 거리가 작으면 true(충돌)
	}

	public String toString() {
		return po.toString() + "반지름 " + radius + "둘레: " + perimeter + "면적: " + area;

	}

}
