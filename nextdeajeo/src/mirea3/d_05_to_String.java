package mirea3;

class Student { //extends Object 가 생략되어 있음
	//공통기능: clone, toString, equals, hashcode(주소를 이용해 중복되지 않는 수로 구분)를 공통으로 가짐
	//주소를 전달하면 같은 데이터를 다른 변수가 같이 가리키고 있다
	//데이터는 하나고 가리키는 것이 2개 이상임
	//클래스가 참조에 의해 구동되기 때문에 복사가 안되기때문에 Object
	//주소참조는 복사가 안되니까 이럴때 clone을 사용
	//비교 문제(참조에 의한 경우, 주소비교 ==, 값에의한 비교(equals)
	//포인터를 가리고서???? 참조라고 쓰기위해 만들어진 문법들이다. 
	//hash 함수: 나비(20+10+22+32)<-- 이렇게 주소 갯수를 나눠 주소를 저장하는것
	private int rno;
	private String name;
	public Student(int r, String n){
	rno = r;
	name = n;
	}
	public String toString() { // **문자열이 들어가는 함수에서 자동으로 실행
		return rno + " " + name;
	}
}

public class d_05_to_String {

	public static void main(String[] args) {
		Student s = new Student(101, "대한민국만세");
		System.out.println("학생정보:");
		System.out.println(s);

	}

}
