// 최소, 최대
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = -1000000;
		int min = 1000000;

		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
			
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min+" "+max);
		
	}
}
