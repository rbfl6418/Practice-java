package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //���� �߻� -> ArithmeticException���� ��ü ������
			System.out.println(4); //������� �ʴ´�.
		}catch (ArithmeticException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("true");
				System.out.println("ArithmeticException �߻���!");
			}
			e.printStackTrace(); 
			System.out.println("���� �޽��� :" + e.getMessage());
		}catch (Exception e) { //ArithmeticException�� ������ ��� ���ܰ� ó����
			System.out.println("Exception �߻���!");
		}
		System.out.println(6);
	}

}
