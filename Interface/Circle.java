package interface1;

public class Circle {
	
	double r=10;

	@Override
	public void area() {
		
		
		System.out.println("area of circle "+(pi*r*r));
		
		
		
	}

	@Override
	public void perimeter() {
		System.out.println("perimeter of circle "+(2*pi*r));
		
	}

}
