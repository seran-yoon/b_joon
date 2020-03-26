// 세 수
// 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

import java.util.Scanner;

public class Q10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A>B) {
			if(B>C) {
				System.out.println(B);
			}
			else { //B<C
				if(A>C) {
					System.out.println(C);
				}
				else { //A<C
					System.out.println(A);
				}
			}
		}
		else //A<B
		{
			if(A>C) {
				System.out.println(A);
			}
			else { //A<C
				if(B>C) {
					System.out.println(C);
				}
				else { //B<C
					System.out.println(B);
				}
			}
		}
		
	}
}
