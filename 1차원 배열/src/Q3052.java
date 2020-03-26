// 나머지
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.  수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[42]; //인덱스가 0~41까지인 배열을 만듬 ->42를 나눠줄것이기 때문!
		int cnt = 0;
		
		for(int i=0;i<10;i++){
			int num = sc.nextInt(); //숫자 10개를 차례대로 입력받음
			arr[num%42]++; //숫자를 받자마자 바로 42나누기 후 나머지를 나머지값과 같은 수의 arr인덱스에서 1증가
						   //num=42 -> 42%42=1 -> arr[1]의 배열 값에 1 증가
		}
		
		for(int i=0;i<arr.length;i++){ //arr배열의 길이만큼 for문을 돌려서 arr[i]값이 1이상인 경우 카운트 세기
			if(arr[i]>0){
				cnt++; //나머지 수가 같은 경우에는 같은 인덱스에 증가가되기 때문에 배열값이 0이 아닌경우만 구하면 값을 받은 배열중, 중복 수도 알아서 정리됨
			}
		}
		
		System.out.println(cnt);
		
	}
}
