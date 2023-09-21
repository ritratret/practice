package nextdeajeo;

public class a_16_string_sort {

	public static void main(String[] args) {
		//문자열 비교
		String str11 = "Hello";
		String str21 = "Hello";
		String str31 = "World";
		System.out.println("strl.compareTo(str2 ? "
				+ str11.compareTo(str21));
		System.out.println("strl.compareTo(str3 ? "
				+ str11.compareTo(str31)); // 뒤에가 크면 마이너스
		System.out.println("strl.compareTo(str3 ? "
				+ str31.compareTo(str11)); // 앞이 크면 플러스
		
		//일일이 비교할 수 있도록 프로그래밍 bubble sort
		String[] strarray = {"대한", "민국", "만세", "한국", "대전"};
		for (int i = 0; i <strarray.length; i++) {
			boolean changed = false;
			for (int j = 0; j < strarray.length-i -1;j++) {
				if(strarray[j].compareTo(strarray[j+1]) > 0) {
					String temp = strarray[j];
					strarray[j] = strarray[j+1];
					strarray[j+1] = temp;
					changed = true;
				}
			}
			if (!changed) break;
			}
		for (int i = 0; i <strarray.length; i ++) {
			System.out.print(strarray);
		}

	}

}
