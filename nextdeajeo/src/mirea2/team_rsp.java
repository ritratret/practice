package mirea2;

public class team_rsp { // 함수를 다 받는 클래스

	public static void main(String[] args) {
		Com comp = new Com();
		User user = new User();
		Judge judge = new Judge();
		
		while(true) {
			int sel = user.getUser();
			int com = comp.getComputer();
			
			if (sel == -1) {
				System.out.println("게임이 종료되었습니다");
				judge.print();
				break;
			}
			judge.gamedicision(com,sel);
		}

	}

}
