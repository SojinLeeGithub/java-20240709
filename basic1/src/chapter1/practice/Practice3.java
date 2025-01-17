package chapter1.practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		// 문자열 자르기
		// 사용자로 부터 문자열을 입력 받고
		// 입력받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서 
		// 자른 문자 배열을 출력

		// string 기능 substring을 사용하지 않고 char[]을 이용해서 작성
		
		String statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";
  
		
        // 입력받기
        Scanner scanner = new Scanner(System.in);

        // 시작 인덱스 입력 받기
        System.out.println("시작 인덱스를 입력하세요: ");
        int startIndex = scanner.nextInt();

        // 종료 인덱스 입력 받기
        System.out.println("종료 인덱스를 입력하세요: ");
        int endIndex = scanner.nextInt();
        
       
        // 문자 배열 생성 및 복사
        char[] statementChars = statement.toCharArray();
        char[] resultChars = new char[endIndex - startIndex];
        for (int index = startIndex; index < endIndex; index++) {
        	resultChars[index - startIndex] = statement.charAt(index);
        }
        
        // 자른 문자 배열 출력
        System.out.println("자른 문자 배열: ");
            for (char c : resultChars) {
                System.out.print(c);
            }
        }
}