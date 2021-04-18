package programmers;

public class No1 {

	public static void main(String[] args) {
		
	}
	//두 정수의 합
	public long solution(int a, int b) {
		long answer = 0;
		
		//작은 수 
		int min = (a < b) ? a : b;
		//반복할 횟수
		int num = (a < b) ? (b-a)+1 : (a-b)+1;
		
		if(a == b) {
			answer = a;
		}else {
			for (int i = 0; i < num; i++) {
				answer += min;
				min++;
			}
		}
		return answer;
	}
}
