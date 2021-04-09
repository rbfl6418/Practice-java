package ch7;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
	}
}

class Unit{
	int currentHP;
	int x;
	int y;
}

class Fighter extends Unit implements Fighterable{
	 public void move(int x, int y) { /*�������*/ }; //�������̽����� �����Ϸ��� �ڵ����� public�ٿ�������
	 public void attack(Unit u) { /*�������*/ }; //Ŭ���������� public������� ������ default�� �ȴ�.
}	//public -> default�� ���� ������ ���� �ϴ� ���̹Ƿ� ������ ������ �߻��Ѵ�. 
	//error : Cannot reduce the visibility of the inherited method from Movable

 
interface Fighterable extends Movable, Attackable{}
interface Movable{ void move(int x, int y); }
interface Attackable{ void attack(Unit u); }