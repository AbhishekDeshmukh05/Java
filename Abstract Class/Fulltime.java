package abstractclass;

public class Fulltime {
	
	
	@Override
	public void calculateSalary(double salary, double bouns) {
		System.out.println("full time employe salary "+(salary+bouns));

		System.out.println("salary "+salary);
		System.out.println("bonus "+bouns);
				
	}


}
