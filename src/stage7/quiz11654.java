package stage7;

import java.util.Scanner;

public class quiz11654 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// int 에 저장하므로 아스키 코드값으로 저장함.
		int X = scan.next().charAt(0);
		
		System.out.println(X);
		
		scan.close();
	}
	
}
