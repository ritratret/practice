package mirea2;

import java.util.Scanner;

public class student_output_0922 {
	
	public static void main(String[] args) {
	// student의 입력받은걸 출력하기
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1) 이름, 국어, 수학, 영어 점수를 입력하시오");
	Student st1 = new Student(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt()); // 인스턴스
	
	System.out.println("2) 이름, 국어, 수학, 영어 점수를 입력하시오");
	Student st2 = new Student(sc.nextLine(),sc.nextInt(),sc.nextInt()); // 나머지는 0으로 안나옴
	
	System.out.println("3) 이름, 국어, 수학, 영어 점수를 입력하시오");
	Student st3 = new Student(sc.nextLine(),sc.nextInt());
	
	System.out.println("결과를 출력하겠습니다");
	Student st0 = new Student(" ");
	
	st0.printMenu(); // 메뉴
	
	st1.print();//대한
	st2.print();//민국
	st3.print();//만세
	}

}
