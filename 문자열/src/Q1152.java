// 단어의 개수
// 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine().trim(); //trim() -> 앞뒤 공백 제거
		String[] sArr = S.split(" "); //띄어쓰기 한 만큼 잘라서 배열 안에 넣어주기
		int cnt = sArr.length;
		
		for(int i=0;i<sArr.length;i++){ //중간에 띄어쓰기가 있었는지 확인하기 위함
			if(sArr[i].equals("")){ //sArr배열 안에 비어있는게 있으면  cnt갯수 줄이기(비어있는게 있으면 띄어쓰기가 한개 더 있었던 것)
				cnt--;
			}
		}
		
		System.out.println(cnt);
		
	}
}
