package stage6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(function(Integer.parseInt(br.readLine())));
		
		br.close();
		
	}
	
	public static int function (int x) {
		
		// 한수의 개수
		int cnt = 0;
		
		if (x < 100) {
			return x;
		} else {
			cnt = 99;
			
			// 예외처리
			if (x == 1000) {
				x = 999;
			}
			
			for (int i = 100; i <= x; i++) {
				int hun = i / 100;			// 백
				int ten = (i/10) % 10;		// 십
				int one = i % 10;			// 일
				
				// 등차수열인지 아닌지 판단하는 조건문 
				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
			
		}
	
		return cnt;
	}
	
}
