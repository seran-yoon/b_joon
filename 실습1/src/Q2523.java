// 별찍기_13

import java.util.Scanner;

public class Q2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<N;i++) {
			for(int j=N-i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
	}
}
