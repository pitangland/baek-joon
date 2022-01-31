package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		// for문을 통해 값을 받아 배열을 저장한다.
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 최댓값
		int max = 0;
		// 배열의 index
		int index = 0;
		
		int count = 0;
		
		// 향상된 for문
		for (int value : arr) {
			count++;
			if (value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		br.close();
		
	}
	
}
