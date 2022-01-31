package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class quiz4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		int[] arr;
		
		StringTokenizer st;
		
		// C 만큼 for문 돌리기
		for (int i = 0; i < C; i++) {
			// 한줄을 " "공백으로 문자열 분리
			st = new StringTokenizer(br.readLine(), " ");
			
			// for 문 안에서 선언해줘야 for문이 반복될 때마다 새로 사용할 수 있다.
			int student = Integer.parseInt(st.nextToken());
			
			// student 수 만큼의 배열 만들기
			arr = new int[student];
			
			double sum = 0; // 누적 합
			
			for (int j = 0; j < student; j++ ) {
				
				int result = Integer.parseInt(st.nextToken());	// 학생의 성적
				arr[j] = result;
				sum += result;
				
			}
			
			double avg = (sum / student);	// 평균
			double count = 0;				// 평균이 넘는 학생 수
			
			for (int j = 0; j < student; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			// 소수점 셋째자리까지 출력하기 위해 %.3f 를 사용, %을 출력하려면 %%로 써줘야 한다.
			System.out.printf("%.3f%%\n", (count/student) * 100);
		}
		
		
		br.close();
		
	}
	
}
