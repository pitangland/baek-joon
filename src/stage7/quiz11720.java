package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz11720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 저장할 필요없이 입력만 받으면 됨.
		br.readLine();
		
		int sum = 0;
		
		for(byte x : br.readLine().getBytes()) {
			// byte로 변환되어 반환되므로 '0'또는 a-48을 해줘야 함.
			sum += x-'0';
		}
		
		System.out.println(sum);
		
		br.close();
		
	}
	
}
