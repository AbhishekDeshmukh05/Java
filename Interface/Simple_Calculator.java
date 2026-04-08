package interface1;

public class Simple_Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("addition of two number "+(a+b));		
	}

	@Override
	public void subtract(int a, int b) {
		System.out.println("subtraction  of two number "+(a-b));
		
	}

	@Override
	public void multiply(int a, int b) {
		 System.out.println("multipaction of two number "+(a*b));
		
	}

	@Override
	public void divide(int a, int b) {
		System.out.println("division of two number "+(a/b));
		
	}
	
}
