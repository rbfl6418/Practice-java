package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //예외 발생 -> ArithmeticException예외 객체 생성됨
			System.out.println(4); //실행되지 않는다.
		}catch (ArithmeticException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("true");
				System.out.println("ArithmeticException 발생함!");
			}
			e.printStackTrace(); 
			System.out.println("예외 메시지 :" + e.getMessage());
		}catch (Exception e) { //ArithmeticException을 제외한 모든 예외가 처리됨
			System.out.println("Exception 발생함!");
		}
		System.out.println(6);
	}

}
