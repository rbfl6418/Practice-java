package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int a = 0; //����
		int b = 1; //ȣ��
		int p = 0; //�����
		
		for(int i = 0; i < T; i++) {
			a = Integer.parseInt(br.readLine());
			System.out.println("a :"+ a);
			b = Integer.parseInt(br.readLine());
			System.out.println("b :"+ b);
			
			//a�� bȣ���� ��� ��� �� ���ϱ�
			for (int j = 0; j < a; j++) {
				
				
			}
		}
		
	}

}
