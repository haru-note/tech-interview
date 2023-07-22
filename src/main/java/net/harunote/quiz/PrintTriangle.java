package net.harunote.quiz;

/**
 * @Author : CodeVillains
 * printTriangle 메소드는 양의 정수 num을 매개변수로 입력받습니다.
 * 다음을 참고해 *(별)로 높이가 num인 삼각형을 문자열로 리턴하는 printTriangle 메소드를 완성하세요
 * printTriangle이 return하는 String은 개행문자('\n')로 끝나야 합니다.
 */

public class PrintTriangle {
	public String printTriangle(int num){
		StringBuffer sb = new StringBuffer();

		String result = "";
		for (int i = 0; i < num; i++) {
			result += "*";
			sb.append(result).append("\n");
		}
		return sb.toString();
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}