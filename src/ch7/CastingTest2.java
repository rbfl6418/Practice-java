package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		System.out.println(car instanceof FireEngine); //false
		fe = (FireEngine)car; //������ - OK, ���� ��(��Ÿ��) ���� �߻�  
		fe.drive();
		car2 = fe;                                       
		car2.drive();
	}

}

