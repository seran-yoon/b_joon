// 별찍기_21

import java.util.Scanner;

public class Q10996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(j%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			for(int j=0;j<N;j++) {
				if(j%2 == 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
