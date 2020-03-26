// 숫자의 개수
// 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오. 예를 들어 A = 150, B = 266, C = 427 이라면  A × B × C = 150 × 266 × 427 = 17037300 이 되고,  계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
// 정석으로 해야하는 방법!

import java.util.Scanner;

public class Q2577_standard {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int result = A * B * C;
		int count[] = new int[10]; // 0~9까지의 갯수를 알기 위한 배열

		while (result > 0) {
			count[result % 10]++; // result값을 나누기 10한 나머지의 값과 같은 수의 count배열의 인덱스에서 1증가
			result /= 10; // 뒤의 1의 자리부터 하나씩 빼주기 위해 result 나누기 10을 한 결과값을 result에 넣고 다시 반복 돌림
		}

		for (int i = 0; i < count.length; i++) { // 0~9까지의 숫자가 각각 몇번 카운트 되었는지 출력
			System.out.println(count[i]);
		}
	}
	
}