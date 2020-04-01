// 그룹단어 체커
// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다. 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

import java.util.Arrays;
import java.util.Scanner;

public class Q1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = N; //입력된 숫자만큼 그룹단어라고 가정
		
		for(int i=0;i<N;i++) {
			String gWord = sc.next();
			
			boolean[] alpabet = new boolean[26]; //알파벳 체크, 등장한 문자는 true로 변경
			
			for(int j=1;j<gWord.length();j++) {
				if(gWord.charAt(j-1) != gWord.charAt(j)) { //현재 문자(j-1)와 다음 문자(j)가 같지 않다면 (현재문자와 이전문자가 같으면 아예 true로 안바꿔줘도 되니까 아무 조치도 안함)
					if(alpabet[gWord.charAt(j)-97] == true) { //현재문자와 비교하는 다음문자가 ture라면 이전에 등장해서 변경을 했다는 것이기 때문에 그룹문자가 아님 (소문자를 숫자로 나타내기 위해 -97을 함)
						cnt--; //그룹단어가 아니기 때문에 빼줌
						break;
					}
					
					alpabet[gWord.charAt(j-1)-97] = true; //현재문자(j-1)를 true로 
				}
			}
		}
		
		System.out.println(cnt);
	}
}
