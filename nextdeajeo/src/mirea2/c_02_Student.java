package mirea2; // Student 파일 여기서 실행

public class c_02_Student {

	public static void main(String[] args) {
		Student st1 = new Student("대한이", 100 ,100,90); // 인스턴스
		Student st2 = new Student("민국이",90,90);
		Student st3 = new Student("만세");
		
		st2.setEng(88); // set2의 영어점수 88로변경
		st2.eng = 88; // setEng을 써서, 혹은 직접적으로 점수 변경가능
		
		st3.setKor(88); st3.setMat(77);st3.setEng(99);   
		st1.setKor(80);
		System.out.println(st1.getMat());

		st1.print();//대한
		st2.print();//민국
		st3.print();//만세
		
		//**프린트를 꼭 밑에다 놓아둘것.순서 중요함!!!
		
		//Q: 민국이 영어점수 88
		//만세 국 99 영어 88 수학 77
		//대한이 국어점수 80으로 바꿈
		//대한이 수학점수 출력
		
		
	}

}
