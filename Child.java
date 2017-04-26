class Parent{
	protected void method1(){
		System.out.println ("Parent's method1()");
	}
	public void method2() {
		System.out.println ("Parent's method2()");
		method1();
	}
}
 class Child extends Parent {
	public void method1() {
		System.out.println ("Child's method1()");
		
	} 

	public static void main(String args[]) {
		Parent p = new Child();
		p.method2();
	}
}


// Private method in Parent class can not be overridden. 
// it will be accessed in the same class only and no where else 
	

// So the output will be 
		// : Parent's Method2() 
		// : Parent's Method1()
		