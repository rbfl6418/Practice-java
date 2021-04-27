package ch9;

public class StringEx {

	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println(a == b);
		
		a = "567";
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println(a == b);
		
		String str3 = new String("123");
		String str4 = new String("123");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String s = "Hello";
		int index = s.indexOf("l");
		System.out.println(index);
		
		String x = new String("555");
		String z = new String("999");
		
		System.out.println((x == z));
		System.out.println(x.equals(z));
		System.out.println(x.intern());
		System.out.println(z.intern());
		System.out.println(x.intern());
		System.out.println(z.intern());
		System.out.println(x.intern() == z.intern());
		
		
		int[] intArr = new int[3];
		int arrLength = intArr.length;
	}

}
