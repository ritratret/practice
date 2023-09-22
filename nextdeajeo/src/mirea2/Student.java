package mirea2; // 클래스만 만든거임

//문제: 이름, 국어, 영어, 수학 점수를 저장하는 클래스를 작성
//생성자 구현
//get/set함수 구현
//이름 국어 영어 수학 점수를 출력하는 함수

// 클래스는 맨앞 철자 대문자, 함수 소문자(단어 이어붙일땐 뒤에 대문자), 변수 소문자

//Q: 총점, 평균 멤버변수를 추가하시고 데이터가 세팅될 때 자동으로 총점과 평균을 계산하도록 수정
public class Student { 
	String name;
	
	int kor;
	int eng; 
	int mat;
	int total;
	int average;
	
	public Student(String name, int kor, int mat, int eng) {//국 수 영
		// eng는 자동으로 0 초기화
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		totCalc();
		avrCalc();
	}
	public Student(String name, int kor, int mat) {//국 수 영
		// eng는 자동으로 0 초기화
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		totCalc();
		avrCalc();
		
	}
	
	public Student(String name, int kor) {//국 수 영
		// eng는 자동으로 0 초기화
		this.name = name;
		this.kor = kor;
		totCalc();
		avrCalc();
	}
	
	public Student(String name) {//국 수 영
		// eng는 자동으로 0 초기화
		this.name = name;
		totCalc();
		avrCalc();
	}
	
	public void printMenu() { 
		System.out.println("이름 국어 수학 영어 합계 평균");
	}
	
	public void setName(String name) { // 이름을 바꿈
		this.name = name;
	}
	public String getName() { // 이름 돌려받기
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
		totCalc();
		avrCalc();
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
		totCalc();
		avrCalc();
	}
	public int getEng() {
		return eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
		totCalc();
		avrCalc();
	}
	public int getMat() {
		return mat;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + mat + " " + eng + " " + total + " " + average);
	}
	
	
	public void totCalc() {
		total = kor + mat + eng; // 합계
	}
	public void avrCalc() {
		average = total / 3; // 평균
	}
	
}

