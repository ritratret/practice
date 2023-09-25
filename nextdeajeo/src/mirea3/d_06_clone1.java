package mirea3;
//복사를 하고 싶은 클래스는 cloneable을 구현해주어야 함

public class d_06_clone1 implements Cloneable{
	int rollno;
	String name;
	d_06_clone1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	// 오버라이딩 (clone은 Object에 있는데 또 썼음)
	// 예외(복사를 못하면)가 발생하면 CloneNotSupportedException 클론을 지원하지 않는다. else if같네
	// 실행을 중지함
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	//참조문제를 해결하기 위해서 Object
	public static void main(String[] args) {
		try {
			d_06_clone1 s1 = new d_06_clone1(101,"대한민국");
			d_06_clone1 s2 = (d_06_clone1) s1.clone(); // 데이터를 다른주소에 복사해줘라. 공간 만들고 하나 더 만들어라
			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);
			System.out.println(s1==s2); // 주소값 비쇼
			System.out.println(s1);
			System.out.println(s2);
		} catch (CloneNotSupportedException c) {
			c.printStackTrace();
		}
		

	}

}
