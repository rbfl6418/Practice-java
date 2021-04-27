package ch9;

final class Card{
	String kind;
	int num;
	
	Card(){
		this("SPADE",1);
	}
	
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":" + num;
	}
}

public class ClassEx1 {

	public static void main(String[] args) {
		Card c = new Card("HEART",3);
		try {
			Card c2 = Card.class.newInstance();
			System.out.println(c);
			System.out.println(c2);
			System.out.println(c.getClass());
			System.out.println(c2.getClass());
			
			//c2를 Class객체로 만들기 -> 클래스 정보를 얻기 위해서
			Class cObj = c2.getClass();
			System.out.println(cObj);
			System.out.println("cObj.getName() :"+cObj.getName());
			System.out.println("cObj.toGenericString() :"+cObj.toGenericString());
			System.out.println(cObj.toString());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
