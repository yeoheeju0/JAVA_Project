package java_hw;

public class hw04 {

	public static void main(String[] args) {
		// 1. 문자열 뒤집기
		// -입력되는 문자열 뒤집어서 출력
		// ex) input : abc, output :cha

		String str = "abc";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		// 2.문자열 개수 세기
		// 아스키 코드 이용
		// 입력되는 문자열에서 알파벡과 숫자의 갯수를 구하기
		// ex)input : 1a2v4b, output : 숫자3개, 영어3개

		int num = 0;
		char cha = 0;
		String subject = "1a2v4b";

		for (int i = 0; i < str.length(); i++) {
			char cha1 = str.charAt(i);
			int cha2 = str.charAt(i);

			if ('a' <= cha && cha >= 'z') {
				cha++;
			} else if ('0' <= cha2 && cha2 <= '9') {
				num++;
			}
			System.out.println("숫자 : " + num + "영어 : " + cha);

		}
	}
}
