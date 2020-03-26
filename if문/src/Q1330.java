// 두 수 비교하기
// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		} 
		else if(a<b) {
			System.out.println("<");
		} 
		else if(a==b) {
			System.out.println("==");
		}

	}
}