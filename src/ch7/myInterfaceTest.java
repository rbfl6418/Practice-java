package ch7;

public class myInterfaceTest {
	public static void main(String[] args) {
		//상위 인터페이스, 하위 인터페이스, 구현 클래스 모두를 참조 타입으로 사용할 수 있다.
		//즉, 다형성을 이용해서 구현체들을 사용하고 다룰 수 있다.
		Internet internet = new IPhone();
		Phone phone = new IPhone();
		Calculatable cal = new IPhone();
				
		IPhone iphone = new IPhone();
	}
}
