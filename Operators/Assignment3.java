package program.operator;

public class Assignment3 {

	public static void main(String[] args) {
		int i = 2;
        i++;                // 3
        --i;                // 2
        System.out.println(i++);    // Prints 2 then 3)
        i++;                // 4
        System.out.println(i % 6);  // 4 % 6 = 4
        --i;                // 3
        System.out.println(i += 2); // 3 + 2 = 5
        i++;                // 6
        int b = i + 1;      // 7
        System.out.println(i++);    // Prints 6 then 7)
        --i;                // 6
        i %= 5;             // 6 % 5 = 1
        System.out.println(i++);    // Prints 1 then 2)
        ++i;                // 3
        System.out.println(i + 2);  // 3 + 2 = 5
        System.out.println("______________________________");
        System.out.println(i);      // 3
		 

	}

}
