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
	 public void move(int x, int y) { /*내용생략*/ }; //인터페이스에선 컴파일러가 자동으로 public붙여주지만
	 public void attack(Unit u) { /*내용생략*/ }; //클래스에서는 public명시하지 않으면 default가 된다.
}	//public -> default로 좁은 범위로 제한 하는 것이므로 컴파일 에러가 발생한다. 
	//error : Cannot reduce the visibility of the inherited method from Movable

 
interface Fighterable extends Movable, Attackable{}
interface Movable{ void move(int x, int y); }
interface Attackable{ void attack(Unit u); }