package ch7;

public class Instanceof {
	
	public static void main(String[] args) {
		Car c = new FireEngine(); //new Car �Ǵ� null �̸� FireEngine���� ����ȯ �Ұ�
		FireEngine fe = new FireEngine();
		
		if(c instanceof FireEngine) {
			fe = (FireEngine)c;
			fe.doWork(c);
		}else {
			System.out.println("FireEngine���� ����ȯ�� �� �����ϴ�.");
		}
	}
	
}
