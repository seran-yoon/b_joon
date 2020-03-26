// 단어공부
// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

import java.util.Scanner;

public class Q1157 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next().toUpperCase(); //입력받은 문자열을 모두 대문자로 바꿔주기(소문자대문자상관없이 체크해야하고, 출력시 대문자로 출력해주어야하기 때문)
	
		int[] cnt = new int[26]; //알파벳 갯수대로 배열 길이 생성
		int max = 0;
		char result = '?';
		
		for(int i=0; i<S.length();i++){
			//문자열의 길이만큼 반복문을 돌려서, charAt(i)에 해당하는 알파벳에 '0'을 빼주어 아스키코드에서 숫자로 변경,그 수와 일치하는 cnt배열의 i인덱스 값에 1씩 증가해줌
			cnt[S.charAt(i)-65]++; //charAt(인수) -> 인수번째의 문자를 읽어냄 (인수는 0부터 시작) 
			
			if(max<cnt[S.charAt(i)-65]){
				max = cnt[S.charAt(i)-65]; //max값에 해당 알파벳의 횟수(++한)를 넣어줌
				result = S.charAt(i); //result값에 해당 알파벳을 넣어줌
			} else if(max == cnt[S.charAt(i)-65]){
				result = '?';
			}
			
		}
		
		System.out.println(result);
		
	}
}
