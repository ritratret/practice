package mirea4;
//0926
//성적 클래스를 만들고
//번호 이름 국어 수학 영어 총점 평균 

//Q: 성적클래스를 번호 이름 국어 수학 영어 총점 평균
//ArrayList를 자료구조로 해서 입력
//CRUD 함수 만들어 데이터를 관리하도록 메뉴화 하시오
class Recode { // 성적
	int num;
	String name;
	int kor;
	int mat;
	int eng;
	int total; // 총점
	int average; // 평균
	
	public Recode(int num, String name, int kor, int mat, int eng) { // 생성자
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		totalAll();
		averageAll();
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void totalAll() { // 합계
		total = kor+mat+eng;
	}
	
	public void averageAll() { //평균 
		average = total/3;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + mat + " " + eng + " " + total + " " + average);
	}
}