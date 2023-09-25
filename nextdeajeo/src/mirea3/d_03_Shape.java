package mirea3;

class Shape {
	public double area; // 면적(공통부분)

	public void display() {
		System.out.println("면적은" + this.area + "입니다.");
	}

	public void calcArea() {
	}
}

class Circle extends Shape { // Shape의 자식 Circle
	public double radius;

	public Circle(double radius) {
		this.radius = radius;
		calcArea();
	}

	public double getRadius() { // get/set
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		calcArea();
	}

	public void calcArea() {
		area = Math.PI * radius * radius;
	}
}
//문제 Rectangle class를 작성하시오 Circle을 기준으로 작성
//가로 width, 세로 height

class Rectangle extends Shape {
	public double height;
	public double width;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void clacArea() {
		area = height * width;
	}
}

class Triangle extends Shape
{ // Parent(super) class / child(sub)
	public double height;
	public double width; // area

	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
		calcArea();
	}

	public void setHeight(double height) {
		this.height = height;
		calcArea();
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
		calcArea();
	}

	public double getWidth() {
		return width;
	}

	public void calcArea() {
		area = width * height / 2;
	}
}

public class d_03_Shape {
	public static void shareprint(Shape sh) { // 부모를 매개변수로 해서 자식들은 다 들어올 수 있음
	if (sh instanceof Circle3) { //instanceof는 true false를 return한다
		Circle3 cl = (Circle3 ) sh; // downcasting
		cl.setRadius(100); // 자식에만 있는거 호출할려면 다운캐스팅해야함
		cl.calcArea();
		cl.display();
	}
	else if ( sh instanceof Rectangle) {
		Rectangle re = (Rectangle) sh;
		re.setHeight(100);
		re.setWidth(200);
		re.calcArea();
		re.display();
	}
	else if (sh instanceof Triangle) {
		Triangle tr = (Triangle) sh;
		tr.setHeight(50);
		tr.setWidth(50);
		tr.calcArea();
		tr.display();
	}
	}
	public static void main(String[] args) {
		Circle3 cl = new Circle3(10);
		cl.display();
		
		Shape sh = new Circle3(20);
		sh.display();
		//sh로부터 반지름을 출력
		Circle3 ccl = (Circle3) sh; // downcasting. Circle로 돌아간 다음에 캐스팅
		System.out.println("원의 반지름은 " + ccl.getRadius()); // ccl(Circle)에서 getRadius함수를 호출한다
		
		Rectangle re = new Rectangle(10,20);
		re.display();
		
		Triangle tr = new Triangle(10,5);
		tr.display();
		
		//부모의 배열에 위의 cl, re, tr을 입력하시오. 면적을 출력하시오
		Shape [] parent = new Shape[3]; //부모의 배열에 인스턴스
		parent[0] = cl;
		parent[1] = re;
		parent[2] = tr;
		for (int i =0; i<3; i++) {
			parent[i].display();
		}
		
		shareprint(cl); // 권장. 부모로 매개변수를 지정하고, 자식 클래스를 전달해서 작업하는 방법
		//디자인 패턴의 기본 패턴
		shareprint(re);
		shareprint(tr);
		for (int i = 0; i<3; i++) {
			shareprint(parent[i]);
		}
	}

}
