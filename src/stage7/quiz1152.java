package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class quiz1152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// " "의 단위로 한 줄의 문자열을 나누어줌.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// count
		System.out.println(st.countTokens());
		
		br.close();
		
	}
	
}
