package ch7;

public class IPhone implements Phone {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void connectToInternet() {
		System.out.println("와이파이로 연결!");
	}

	@Override
	public void call(String name) {
		System.out.println(name + "에게 통화시도");
	}

}
