package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz1316 {

	// check() 함수에서도 사용해야 하므로 밖에 선언.
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {


		int N = Integer.parseInt(br.readLine());

		int result = 0;
		
		// check 함수가 true일 경우 개수를 +1 해줌.
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				result++;
			}
		}

		System.out.println(result);

		br.close();

	}

	// check 함수
	public static boolean check() throws IOException {
		
		
		boolean[] check = new boolean[26];
		
		int prev = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// 문자를 숫자로 저장
			
			// 이전과 지금의 문자가 같지 않다면,
			if (prev != now) {
				
				// 문자가 처음 나오는 경우에는 false 이므로 false 일 경우,
				if (check[now - 'a'] == false) {
					check[now-'a'] = true;
					prev = now;
				} else {	// 문자가 나온 적이 있는 경우 즉, true일 경우, 함수 종료
					return false;
				}
				
			}
			
		}

		return true;
	}

}





















