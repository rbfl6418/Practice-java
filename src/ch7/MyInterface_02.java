package ch7;

public interface MyInterface_02 {
	default void default_method() {
		System.out.println("default method");
		private_method(); //private 메서드 사용가능
		static_method(); //static 메서드 사용가능
	}
	
	private void private_method() {
		System.out.println("private method");
		static_method();
		private_static_method();
	}
	
	static void static_method() {
		System.out.println("static method");
		private_static_method(); //private static 메서드 사용가능
		//default_method();  
		//private_method();  
		//다른 일반 메서드 사용 불가능
		//Cannot make a static reference to the non-static method default_method() from the type MyInterface_02
	}
	
	private static void private_static_method() {
		System.out.println("private static method");
		//default_method();
		//private_method();
	}
	
}
