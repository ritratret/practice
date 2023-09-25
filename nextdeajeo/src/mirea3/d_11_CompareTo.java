package mirea3;

//<>가 일반화 프로그래밍으로 구현되어 있다 : 데이터 타입이 된다
class Student17 implements Comparable<Student17> {
	int rollno;
	String name;
	int age;
	
	Student17(int rollno, String name, int age) {
		this.rollno= rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student17 st) { // 재정의: 클래스 비교가 가능해짐
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}
public class d_11_CompareTo {

	public static void main(String[] args) {
		Student17 st1 = new Student17(1,"김일",61);
		Student17 st2 = new Student17(2,"김이",60);
		if (st1.compareTo(st2) == 1) System.out.println(" " + "나이가 더 많습니다");
		


	}

}
