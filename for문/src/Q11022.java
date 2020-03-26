// A+B _8
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
		}

	}
}
