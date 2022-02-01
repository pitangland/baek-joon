package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class quiz2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			// 예제 3 ABC 를 구분해 str 에 저장해줌.
			String[] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
			
			// str[1] 의 문자열을 byte별로 나누어 향상된 for문을 돌림.
			for (byte item : str[1].getBytes()) {
				for (int j = 0; j < R; j++) {
					sb.append((char)item);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
		br.close();
		
	}
	
}
