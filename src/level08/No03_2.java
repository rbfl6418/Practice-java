package level08;

import java.util.Scanner;

public class No03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int line = 0; 
		int cnt = 0; //�ش� �ٱ����� ��� ĭ�� ����
		while(cnt < X) {
			line++;
			cnt =  line * (line+1) /2; //���������� ��
		}
		
		if(line % 2 == 1) {//Ȧ����° ���̶��
			int top = 1 + (cnt - X);
			int bottom = line - (cnt - X);
			System.out.println(top + "/" + bottom);
		}else {//¦����° ���̸�
			int top = line - (cnt - X);
			int bottom = 1 + (cnt - X);
			System.out.println(top + "/" + bottom);
		}
	}

}
