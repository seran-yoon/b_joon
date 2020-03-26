// 숫자의 개수
// 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오. 예를 들어 A = 150, B = 266, C = 427 이라면  A × B × C = 150 × 266 × 427 = 17037300 이 되고,  계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = A*B*C;
		int cnt = 0;
		int count[] = new int[10];
		
		while(result!=0){
			result = result/10;
			cnt++;
		}
		int arr[] = new int[cnt];
		//배열의 자리수 할당하기 위한 과정 
		
		result = A*B*C;
		
		for(int i=0;i<arr.length;i++){
			arr[i] = result%10; //A*B*C를 계산한 수에서 1의자리를 추출해서 arr[i] 배열 안에 넣기
			result = result/10; //result /= 10 으로 써줄 수 있음 //1의 자리를 뺀 나머지 숫자를 다시 result에 넣어준다
			
			count[arr[i]]++; //i값을 입력받으면 arr[i]의 인덱스에가서 값을 확인하고 그 값이 r이면 count[r] 1씩 증가
							//예) i=8 -> arr[8]인덱스에 가서 값 확인 -> arr[8]=1이면 count[1]에 값이 1 증가
		}
		
		for(int j=0;j<count.length;j++){
			System.out.println(count[j]);
		}

	}
}