package programmers;

public class No1 {

	public static void main(String[] args) {
		
	}
	//�� ������ ��
	public long solution(int a, int b) {
		long answer = 0;
		
		//���� �� 
		int min = (a < b) ? a : b;
		//�ݺ��� Ƚ��
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
