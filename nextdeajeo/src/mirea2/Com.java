package mirea2;

public class Com {
	
	
	//컴퓨터가 숫자를 가짐
	//가위바위보 선택 변수
	//getComputer(); <컴퓨터의 값을 받아옴
	
	private int answer;
	public Com() {} // default 생성자
	public Com(int answer) {
		this.answer = answer;
	}
	public int getComputer() {
		answer =(int) ((Math.random() * 100))%3; 
		return answer;
	}

}
