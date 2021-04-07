package ch7;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe;
		System.out.println(car instanceof FireEngine); //true
		//car.water(); -> ������ ����  
		fe2 = (FireEngine)car; // �굵 �θ� -> �ڽ����� ����ȯ�ε� �� �Ǵ� ��?
		fe2.water();
		fe2.drive();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
	
	void doWork(Car c) {
		if(c instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;
			fe.water();
		}else if(c instanceof Ambulance) {
			Ambulance a = (Ambulance)c;
			a.siren();
		}
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("woo-woo");
	}
}