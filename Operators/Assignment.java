package program.operator;

public class Assignment {

	public static void main(String[] args) {
		int i = 10;
        i++;                // 11
        --i;                // 10
        System.out.println(i++);    // Prints 10 then 11
        i++;                // 12
        System.out.println(i % 5);  // 12 % 5 = 2
        --i;                // 11
        System.out.println(i += 10);// 11 + 10 = 21
        i++;                // 22
        int b = i + 8;      // 30
        System.out.println(i++);    // Prints 22 then 23
        --i;                // 22
        i %= 7;             // 22 % 7 = 1
        System.out.println(i++);    // Prints 1 then 2
        ++i;                // 3
        System.out.println(i + 20); // 3 + 20 = 23
        System.out.println("______________________________");
        System.out.println(i);     // 3

	}

}
