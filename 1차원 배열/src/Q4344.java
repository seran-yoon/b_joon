// 평균은 넘겠지
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그 들에게 슬픈 진실을 알려줘야 한다.

import java.util.Scanner;

public class Q4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스 입력받음
		
		for(int i=0;i<T;i++){
			
			int N = sc.nextInt(); //학생 수 입력받음
			
			int[] score = new int[N]; //입력받은 학생 수 만큼의 길이를 가진 배열 생성
			int sum = 0, cnt = 0;
			double avg = 0, rate = 0;
			
			for(int j=0;j<score.length;j++){
				score[j] = sc.nextInt(); //그 배열안에 학생들의 점수 입력받아 넣기
				sum += score[j]; //점수끼리 합해서 모두 더한 값 sum에 저장
			}
			
			avg = (double)(sum/N);
			
			for(int j=0;j<score.length;j++){ //평균 넘는 학생 수 새주기
				if(score[j]>avg){
					cnt++;
				}
			}
			
			rate = ((double)cnt/N)*100; //비율 구하기
			
			System.out.printf("%.3f", rate);
			System.out.println("%");
		}
	}
}
