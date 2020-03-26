// 문자열 반복
// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다. QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

import java.util.Scanner;

public class Q2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스 반복횟수
		
		for(int i=0;i<T;i++){
			
			int R = sc.nextInt(); //반복할 횟수 입력
			String S = sc.next(); //문자열 입력
			String[] split = S.split(""); //문자열을 하나씩 쪼개서 배열안에 담기
			
			for(int j=0;j<split.length;j++){
				for (int t = 1; t <= R; t++) {
					System.out.print(split[j]);
				}
			}
			
			System.out.println();
		}
	}

}
