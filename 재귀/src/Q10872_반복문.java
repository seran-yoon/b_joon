// 팩토리얼 (반복문 버전)
// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10872_반복문 {
	
	public static int factorial(int N) {
		
		int result = 1;
		
		for(int i=2;i<=N;i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		
		while(true) {
			N = sc.nextInt();
			if(N>=0 && N<=12) { //0<=N<=12
				break;
			}
		}
		
		int result = factorial(N);
		
		System.out.println(result);
		
	}
}
