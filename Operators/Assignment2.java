package program.operator;

public class Assignment2 {

	public static void main(String[] args) {
		int i = 5;
        i++;                // i is 6
        --i;                // i is 5
        System.out.println(i++);    // Prints 5 then 6
        i++;                // i is 7
        System.out.println(i % 3);  // 7 % 3 = 1
        --i;                // i is 6
        System.out.println(i += 4); // i = 6 + 4 = 10
        i++;                // i is 11
        int b = i + 5;      // b = 16
        System.out.println(i++);    // Prints 11 then 12
        --i;                // i is 11
        i %= 3;             // 11 % 3 = 2
        System.out.println(i++);    // Prints 2 then 3
        ++i;                // i is 4
        System.out.println(i + 10); // 4 + 10 = 14
        System.out.println("______________________________");
        System.out.println(i);      //  4

	}

}
