package mirea3;
//정점에 컬러로 표현하는 클래스가 필요
//Point룰 상속한 다음 color를 표현할 수 있도록 클래스 작성
//pointer(주소)상속 및 정점표현(비교)
public class ColorPoint extends Point2 {
	String color;
	public ColorPoint() {
		color = "검정";
	}
	public ColorPoint (String color, double x, double y) {
		super(x,y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor (){
		return color;
	}
	public String toString() {
		return super.toString() + "color: " + color;
	}

}
