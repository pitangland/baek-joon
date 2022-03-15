package programers;

import java.util.Scanner;

public class whbox {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		scan.close();
		
	}

	public int solution(int[][] sizes) {
		int answer = 0;

		// 명함의 가로길이와 세로길이
		// 모든 명함을 수납할 수 있는 가장 작은 지갑, 지갑의 크기 return
		// [가로, 세로]

		// 힌트
		// 두 값을 비교해 큰값을 모두 가로로, 작은값을 모두 세로로
		// 놓아둔다면 가장 작은 지갑이 만들어질 것임.

		for (int i = 0; i < sizes.length; i++) {
			for (int j = 0; j < sizes.length; j++) {
				System.out.println(sizes[i][j]);
			}
		}

		return answer;
	}

}
