package level08;

import java.util.Scanner;

public class No03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int line = 0; 
		int cnt = 0; //해당 줄까지의 모든 칸의 개수
		while(cnt < X) {
			line++;
			cnt =  line * (line+1) /2; //등차수열의 합
		}
		
		if(line % 2 == 1) {//홀수번째 줄이라면
			int top = 1 + (cnt - X);
			int bottom = line - (cnt - X);
			System.out.println(top + "/" + bottom);
		}else {//짝수번째 줄이면
			int top = line - (cnt - X);
			int bottom = 1 + (cnt - X);
			System.out.println(top + "/" + bottom);
		}
	}

}
