package ch7;

public class IPhone implements Phone {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void connectToInternet() {
		System.out.println("�������̷� ����!");
	}

	@Override
	public void call(String name) {
		System.out.println(name + "���� ��ȭ�õ�");
	}

}
