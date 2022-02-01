package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 대소문자를 구분하지 않으므로 모두 대문자로 만들어줌. (출력이 대문자이므로)
		String str = br.readLine().toUpperCase();
		int max = 0;
		
		// 반환하는 문자열의 기본값을 ? 로 세팅.
		char result = '?';
		
		// a~z 의 개수대로 배열을 만들어줌.
		int[] arr = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-'A']++;
			
			if (max < arr[str.charAt(i) - 'A']) {
				max = arr[str.charAt(i) - 'A'];
				result = str.charAt(i);
			} else if (max == arr[str.charAt(i) - 'A']) {
				result = '?';
			}
			
		}
		
		System.out.println(result);
		
		br.close();
		
	}
	
}
