// 한수
// 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
// 1~9 : 비교할 대상이 없어서 등차수열, 10~99 : 비교할 대상이 하나밖에 없기 때문에 등차수열 => 등차수열은 최소 3자리수 이상부터 확인 가능(1~99까지는 모두 등차수열)

import java.util.Scanner;

public class Q1065 {
	
	public static int cnt = 0;
	
	public static int find(int N) {
		
		for(int i=1;i<=N;i++) {
			if(i>=1 && i<=99) { //1~99까지는 무조건 등차수열(3자리수 이상일때부터 자리수 비교 가능하기 때문)
				cnt++;
			}else { //3자리수부터 계산 시작
				int x = i/100; //100의 자리수
				int y = i/10%10; //10의 자리수
				int z = i%10; //1의 자리수
				
				if(x-y == y-z) { //자리수의 차이가 일정해야 등차수열
					cnt++;
				}
			}
		}
		
		return cnt;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //1<=한수<=N
		
		find(N);
		
		System.out.println(cnt);
		
	}
}
