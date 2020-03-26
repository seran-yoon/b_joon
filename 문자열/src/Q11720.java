// 숫자의 합
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //테스트케이스 입력
		String sN = sc.next();
		
		long sum = 0;
		
		for(int i=0;i<N;i++){
			sum += (sN.charAt(i)-'0'); //아스키코드 빼주기
		}
		
		System.out.println(sum);
	}

}
