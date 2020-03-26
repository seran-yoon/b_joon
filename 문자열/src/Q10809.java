// 알파벳 찾기
// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(char i='a';i<='z';i++){
			System.out.print(str.indexOf(i)+" ");
		}
		
	}

}
