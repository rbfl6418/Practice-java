package ch8;

public class FinallyTest2 {

	public static void main(String[] args) {
		method1();
		System.out.println("main �޼��� �����!");
	}

	static void method1() {
		try {
			System.out.println("method1�� ȣ���!");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1�� finally���� �����!");
		}
		
	}
}
