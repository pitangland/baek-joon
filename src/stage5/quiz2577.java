package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz2577 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 0~9자리의 숫자를 배열로 저장한 것
		int[] arr = new int[10];
		
		// A*B*C 의 값
		int sum = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		while (sum != 0) {
			arr[sum%10]++;
			sum /= 10;
		}
		
		// 향상된 for문
		for (int result : arr) {
			System.out.println(result);
		}
		
		br.close();
		
	}
	
}
