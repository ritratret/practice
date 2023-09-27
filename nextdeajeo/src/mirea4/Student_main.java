package mirea4;

import java.util.ArrayList;
import java.util.Scanner;

//0926
public class Student_main {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		Scanner scanner = new Scanner(System.in);
//		int count = scanner.nextInt();
//		int [][] setence = new int [3][7]; // 배열받기 3행 7열
//
//
//		System.out.print("정보를 입력하세요");
//		for (int i = 0 ; i < count ; i++) {
//			setence[i] = (String)(scanner.nextInt());
//		}

		ArrayList<Integer> sentence = new ArrayList<Integer>();
		
		
		
		while (true) {
			
			int person = 0;
			if (person == 4)
				break; //종료조건
				
			
			//학생 수 만큼 카운터 입력받음
			System.out.println("학생은 몇명입니까?");
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			
			System.out.println(count);
			
			for (int i = 0; i <count+1; i++) {
				//문자열...생성자에 해당하는거 입력
				System.out.println("번호, 이름, 국어, 수학, 영어 점수를 입력");
				String stScore = String.valueOf(sc.nextLine()); //정수를 문자로 변환
				
				System.out.println(stScore);
			}
			
			
			
		}
		
		
		
		
		
//		ArrayList<Recode> arr = new ArrayList<Recode>();
//		System.out.println("Array 1:" + s1);
	}

}
