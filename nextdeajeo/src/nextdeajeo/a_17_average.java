package nextdeajeo;

public class a_17_average {

	public static void main(String[] args) {
		int [][] sungjuk = {{90,90,90,0},{89,89,89,0},{90,99,99,0}}; // 2차원 배열. 3가지 숫자 합한 값과 평균
		//0자리에 합계
		//평균
		double [] avr = new double[3]; // 3개니까 3으로 나눔
		
		
		for (int i = 0; i < sungjuk.length; i++) { // length로 갯수 알수있어서 4번까지 할 수 있음
			int sum = 0; // 사용하기 전에 초기화해주는 방향으로
			for (int j = 0; j < sungjuk.length-1; j++) { // 3번째 수 까지 구하기때문에 length-1을 해준다
				sum += sungjuk[j][i];
				
			}
			sungjuk[i][3] = sum; //i번째(0 1 2)의 3번째(0)에 있는것만 선택
			avr[i] = Math.round(sum/3 * 100) / 100; //숫자를 전부 더한값을 과목수(3)만큼 나누고 소숫점을 앞으로 옮김.그리고 나눔
			//97.123 => 9712.3 => 97.12
		}
		String[] name = {"대한","민국","만세"}; // 이름출력
		System.out.println("이름 국어 영어 수학 합계 평균"); // 안내 메시지
		for (int i = 0; i <sungjuk.length; i++) {
			System.out.print(name[i] + " ");
			for (int j = 0; j<sungjuk[0].length; j++) {
				System.out.print(sungjuk [i][j] + " ");
			}
			System.out.print(avr[i]);
			System.out.println();
		}

	}

}
