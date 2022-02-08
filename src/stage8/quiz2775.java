package stage8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz2775 {

	public static int[][] APT = new int [15][15];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 아파트 행렬 만들어준 메서드 실행
		apartment();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			sb.append(APT[K][N]).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
	// 아파트 행렬 만들어주기
	public static void apartment() {
		
		for (int i = 0; i < 15; i++) {
			// i층 1호는 1
			APT[i][1] = 1;
			// 0층의 i호는 i
			APT[0][i] = i;
		}
		
		// 1층부터 14층까지
		for (int i = 1; i < 15; i++) {
			// 2호부터 14호까지
			for (int j = 2; j < 15; j++) {
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
		
	}
	
}
