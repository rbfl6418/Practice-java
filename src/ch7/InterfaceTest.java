package ch7;

public class InterfaceTest {
	public static void main(String[] args) {
		MyClass_01 mc01 = new MyClass_01();
		MyClass_02 mc02 = new MyClass_02();
		
		MyInterface[] mi = { mc01, mc02 };
		
		for (MyInterface myInterface : mi) {
			myInterface.mustBeInvoked();
		}
	}
}

interface MyInterface { 
//The public type MyInterface must be defined in its own file
	void mustBeInvoked();
}

class MyClass_01 implements MyInterface{

	@Override
	public void mustBeInvoked() {
		System.out.println("MyClass_01");
	}

	
}

class MyClass_02 implements MyInterface{
	@Override
	public void mustBeInvoked() {
		System.out.println("MyClass_02");
	}
	
}
