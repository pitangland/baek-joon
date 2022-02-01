package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = br.readLine();
		
		// 0부터 문자열의 길이까지 for문을 돌림.
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			
			// ch-'a'를 해준 이유 - ch의 문자의 위치는 i가 되는 것을 알 수 있음. 
			// arr 배열의 인덱스는 ch 가 갖고있는 문자 인코딩 값 'a' 또는 97을 빼주면 된다. (a = 97)
			if(arr[ch-'a'] == -1) {
//				System.out.println(ch-'a'); // 확인해봄
				arr[ch-'a'] = i;
			}
			
		}
		
		// 배열을 출력 (향상된 for문)
		for (int item : arr) {
			System.out.print(item + " ");
		}
		
		br.close();
		
	}
	
}
