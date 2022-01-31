package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class quiz3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// HashSet은 중복된 값을 저장하지 않으므로 마지막에 HashSet의 size를 출력하면됨.
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(hs.size());
		
		br.close();
		
	}
	
}
