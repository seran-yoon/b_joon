// 합
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum += i; // sum=sum+i sum에 i를 계속 누적
		}
		
		System.out.println(sum);
		
	}
}
