package stage8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 방의 개수
		int count = 1; 
		// 범위
		int range = 2;
		
		if (N == 1) {
			System.out.println(1);
		} else {
			while (range <= N) {
				range = range + (6*count);
				count++;
			}
			System.out.println(count);
		}
		
		br.close();
		
	}
	
}
