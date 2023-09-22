package mirea2;

public class c_04_CarTest {

	public static void main(String[] args) {
		Car [] cars = new Car[3]; //Student90
		cars[0] = new Car("소나타"); // Scanner
		cars[1] = new Car("아반떼");
		cars[2] = new Car("아우디");
		for(int i = 0; i < cars.length; i++) {
			cars[i].drive();
		}
		//주말과제
		//CRUD 입력, 출력, 수정
		//메뉴(1번:입력, 2:출력, 3:수정, 9:종료) (scanner print)
		//main에서 입력받아서 출력하는걸로 만들기
		//이름 국어 수학 영어 합계 평균
		
		//팀 숙제: 가위바위보 게임(객체 3:comp(랜덤), player(입력), judge(승/패))
		//게임 승패결정>클래스화

	}

}
