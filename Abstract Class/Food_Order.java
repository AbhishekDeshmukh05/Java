package abstractclass;

public class Food_Order {
	
double endbill;
	
	abstract void calculateBill(String name,double price,double tax,double delevire_Charge);
	void printReceipt() {
		
		
		
		System.out.println("print resicept "+endbill);
		
	}


}
