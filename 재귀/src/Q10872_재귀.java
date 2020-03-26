// 팩토리얼 (재귀함수 버전)
// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10872_재귀 {

	public static int factorial(int N) {
		
		if(N == 0) {
			return 1;
		}else {
			return N*factorial(N-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 0;
		
		while (true) {
			N = sc.nextInt(); 
			if(N>=0 && N <=12) { //0<=N<=12
				break;
			}
		}

		System.out.println(factorial(N));
	}
}
