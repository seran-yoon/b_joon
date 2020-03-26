// 최소, 최대 (메소드 sort 버전)
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

import java.util.Arrays;
import java.util.Scanner;

public class Q10818_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" "+arr[N-1]);
		
	}
}
