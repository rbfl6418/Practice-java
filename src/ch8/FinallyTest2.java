package ch8;

public class FinallyTest2 {

	public static void main(String[] args) {
		method1();
		System.out.println("main 메서드 실행됨!");
	}

	static void method1() {
		try {
			System.out.println("method1이 호출됨!");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1의 finally블럭이 실행됨!");
		}
		
	}
}
