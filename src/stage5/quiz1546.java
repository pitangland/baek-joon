package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class quiz1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열의 길이
		int N = Integer.parseInt(br.readLine());
		
		// " " 공백으로 나누어줌.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 출력값의 절대오차 또는 상대오차가 10^-2 이므로 double로 캐스팅
		double[] arr = new double[N];
		
		for (int i = 0; i < N; i++ ) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++	) {
			sum += ((arr[i] / arr[N-1]) * 100);
		}
		
		// 최댓값
		System.out.println(sum / N);
		
		br.close();
		
	}
	
}
