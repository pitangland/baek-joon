package stage6;

public class quiz4673 {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i);
			
			if(n <= 10000) {
				check[n] = true;
			}
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}
		
	}
	
	public static int d(int num) {
		
		int sum = num;
		
		// num/10이라는 연산을 하며 n이 0이 아닐때까지 반복문을 돌림.
		while(num != 0) {
			// 일의 자리 수를 더해주고 
			sum = sum + (num%10);
			// 더한 값을 빼주고 다음 자리수 값을 얻기 위함.
			num = num/10;
		}
		
		return sum;
	}
	
	
}
