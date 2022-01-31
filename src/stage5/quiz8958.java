package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 저장
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String[] ox = new String[N]; 
		
		for (int i = 0; i < N; i++) {
			ox[i] = br.readLine();
		}
		
		// 한줄의 루프를 돌 때,
		for (int i = 0; i < N; i++) {
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적
			
			// 그 안에 있는 ox의 점수 계산
			for (int j = 0; j < ox[i].length(); j++) {
				// o가 연속인지 아닌지
				if(ox[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			// sum 의 값을 추가, 하나의 케이스당 한줄 바꿈 추가
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
}
