package string;

public class Non_repeted {
	
	public static void main(String[] args) {
		String str="success";
		
		for (int i = 0; i < str.length(); i++) {
		    char c = str.charAt(i);
		    if (str.indexOf(c) == str.lastIndexOf(c)) {
		        System.out.println(c);
		    }
		}
	}

}
