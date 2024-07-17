package chapter1.practice;

import java.util.Scanner;

public class Practice4 {

//		예시: 안녕하세요 John 입니다.
//		예시: 안녕하세요 JOHN 입니다.
	
	public static void main(String[] args) {
		// 모두 대문자로 만들기
		// 사용자로 부터 문자열 statement를 입력받고
		// 입력 받은 문자열을 영어라면 모두 대문자로 변경하여 
		// 문자배열에 저장한 후 출력

	Scanner scanner = new Scanner(System.in);	
	
	// 사용자로 부터 문자열 입력 받음
	System.out.println("문자열을 입력하세요: ");
	String statement = scanner.nextLine();
	
	// 입력 받은 문자열을 문자 배열로 변환하기
	char[] charArray = statement.toCharArray();
	for (int index = 0; index < charArray.length; index++) {
		char charater = charArray[index];
		boolean lowerEnglish = charater >= 97 && charater <= 122;
		if (!lowerEnglish) continue;
		
		charArray[index] = (char)(charater - 32);
	}
	
	System.out.println(charArray);
	
	
	
	
	
	

//	// 문자 배열을 순회하면서 영어 문자를 대문자로 변경
//	for (int index = 0; index < charArray.length; index++) {
//		if (charArray[index] >= 'a' && charArray[index] <= 'z') {
//			// 소문자를 대문자로 변환
//			charArray[index] = (char) (charArray[index] - ('a' - 'A'));
//		}
//	}
//	
//	// 변경된 문자 배열 출력
//	System.out.println("대문자로 변환된 문자열: ");
//	for (char c : charArray) {
//		System.out.print(c);
//	}
//	
//	scanner.close();

	
	}

}
