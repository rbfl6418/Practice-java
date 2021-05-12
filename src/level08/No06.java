package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int a = 0; //층수
		int b = 1; //호수
		int p = 0; //사람수
		
		for(int i = 0; i < T; i++) {
			a = Integer.parseInt(br.readLine());
			System.out.println("a :"+ a);
			b = Integer.parseInt(br.readLine());
			System.out.println("b :"+ b);
			
			//a층 b호수에 사는 사람 수 구하기
			for (int j = 0; j < a; j++) {
				
				
			}
		}
		
	}

}
