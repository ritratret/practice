package mirea2;

import java.util.Scanner;

public class student_output_0922 {

	public static void main(String[] args) {
		
		while (true) { // 무한동력
	// student의 입력받은걸 출력하기
		Scanner sc=new Scanner(System.in);
			
			System.out.println("입력(0) 출력(1) 수정(2) 종료(-1)");
			int input = sc.nextInt();
			
			if (input == 0) {
			
			System.out.println("1) 이름, 국어, 수학, 영어 점수를 입력하시오");
			Student st1 = new Student(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt()); // 인스턴스
			sc.nextLine();
			
			System.out.println("2) 이름, 국어, 수학, 영어 점수를 입력하시오");
			Student st2 = new Student(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());// 나머지는 0으로 안나옴
			sc.nextLine();
			
			System.out.println("3) 이름, 국어, 수학, 영어 점수를 입력하시오");
			Student st3 = new Student(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			 // 이름은 String 배열. 나머지 점수는 int에 저장해서 4개필요함
			//입력받은 결과를 배열로 어딘가에 저장해서 반환
			
		
			String aName [] = { };
			int aKor [] = {};
			int aMat [] = {};
			int aEng [] = {};
			
			result [] = {aName,aKor};
			return result;
			
			} else if (input == 1) {
			
			System.out.println("결과를 출력하겠습니다");
			Student st0 = new Student(" ");
			
			st0.printMenu(); // 메뉴
			
			st1.print();//대한
			st2.print();//민국
			st3.print();//만세
			}
		}
	}

}
