// A+B _4
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (입력받을 값이 없을때까지 출력)

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
		
	}
}
