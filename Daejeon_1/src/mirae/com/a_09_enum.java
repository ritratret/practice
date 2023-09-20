package mirae.com;

public class a_09_enum {
	public enum Day {
		// 일주일은 7일. 경우의 수. 범주(값을 가질 수 있는 범위)
		Sun, Mon, Tue, Wed, Thu, Fri, Sat // 수치상 0~6까지 자동으로 매핑된다
	}

	public static void main(String[] args) {
		Day day = Day.Mon; // day에는 Day의 범주안에서만 값이 들어갈수있다
		System.out.println("enum변수에 있는 값은 " + day + "\n");
		Day[] DayNow = Day.values(); // 전체 값을 출력
		System.out.println(DayNow); // 배열이라 주소값이 출력된다
		String str = "";
		
		//DayNow에 있는 값이 하나씩 Now에 대입되어 배열로 나온다
		//확장 for문은 순서대로 인덱스가 아닌 객체를 리턴한다.
		//집단속에 있는 객체값이 나오는 구조임 (기존 for문과는 다름)
		for (Day Now : DayNow) { //extended for 문: 확장for문 (index에러 방지를 위해 만듦)
			switch (Now) {
			case Sun: str ="Sunday"; break;
			case Mon: str ="Monday"; break;
			case Tue: str ="Tuesday"; break;
			case Wed: str ="Wednesday"; break;
			case Thu: str ="Thurday"; break;
			case Fri: str ="Friday"; break;
			case Sat: str ="Saturday"; break;
			}
			System.out.println(str);
		}
		

	}

}
