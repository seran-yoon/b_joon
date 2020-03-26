// OX퀴즈
// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다. "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다. OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		char arr[] = new char[80];
		int sum = 0, cnt = 0;
		
		sc.nextLine(); //int 다음에 String을 입력받으려면 다음 줄에 새로 입력받는것이 문자열이라는 걸 알려주기 위해 sc.nextLine();을 입력하여 한 줄을 입력해줌(엔터키 기능)
		
		for(int i=0;i<num;i++) {
			String ox = sc.nextLine();
			arr = ox.toCharArray();
						
			for(int j=0;j<arr.length;j++) {
				if(arr[j]=='O') {
					cnt++;
				} else if(arr[j]=='X') {
					cnt=0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
			
			cnt = 0;
			sum = 0;
		}
		
		
	}
}
