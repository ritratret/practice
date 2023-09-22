package mirea2;

import java.util.Scanner;

//가위바위보 중에 하나를 입력받기 Scanner 
//입력받고 종료조건 확인
public class User {
	String temp = "";
	//변수는 초기화 하지 않고 사용하면 쓰레기나 에러가 발생한다
	
	int input  = 0;
	Scanner person; // 사람입력을 받아온다
	public User() {} // default 생성자(클래스 이름과 같음), 생성자라 리턴값이 없음
	//default 생성자 만들어야 하는 이유: 클래스 배열에서 빌요로 한다
	public User(int input) { 
		// overloading: 함수이름은 같은데 매개변수 타입이나 매개변수 갯수가 다를 때
		// 다른 함수로 인식하는걸 의미한다
		// 오버로딩 방식: 함수 이름은 같게. 매개변수는 타입 or 개수가 다르게
		this.input = input; //입력받기
	}
	public int getUser() {
		System.out.println("가위(0), 바위(1), 보(2) 중에 하나 선택. 종료(-1)");
		person = new Scanner(System.in);
		temp = person.nextLine();
		if(temp == null || temp.equals("-1")) {
			return -1;
		}
		input = Integer.parseInt(temp);
		input = input % 3;
		return input;
	}

}
