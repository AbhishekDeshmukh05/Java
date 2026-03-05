package program.operator;

public class Test {

	public static void main(String[] args) {
		
// Question 1
		
		int a = 10;
		a+=5;a-=3;a*=2;a/=4;
		
		// a+=5 = 15
		// a-=3 = 12
		// a*=2 = 24
		// a/=4 = 6
		
		System.out.println(a);
		
// Question 2
		
		int b=5;
		int c=10;
		int d= 15;
		
		// (5<10) && (10<15)
		// True && True
		// true
		
		System.out.println((b<c)&&(c<d));
		
// Question 3
		
		int a1 = 5;
		int b1 = 10;
		int c1 = 15;
		
		// a1>b1 || b1<c1  = True
		// a<c = False
		
		System.out.println((a1>b1) || (b1<c1));
		System.out.println(!(a<c));
		
//Question 4
		
		int x= 10;
		int y= 20;
		
		//x++ + ++y
		//10 + 21
		System.out.println(x++ + ++y);
		
//Question 5
		
		int a2= 5;
		int b2= 2;
		
		// 5%2 = 1
		
		System.out.println(a%b);
		
//Question 6
		int p = 7;
		int q = 3; 
		
		// 7*3 + 7/3
		// 21 + 2
		// 23
		
		System.out.println(p*q + p/q);
		
//Question 7
		int n = 5;
		
		// ++n + n++
		// 6 + 6
		// 12
		
		System.out.println(++n + n++);
		
// Question 9
		
		int a3= 10;
		int b3 = 5;
		int c2;
		
		c2 = a3+++-b3+a3*b3;
		// c2 =10+25+11*5
		// 5+55
		// 60
		
		System.out.println(c2);
		
// Question 10
		int a4= 4;
		int b4= 2;
		
		// 4<<2
		// 16
		
		System.out.println(a4<<b4);
		
// Question 11
		
		int a5 = 8;
		int b5 = 2;
		
		// 8 >> 2
		// 2
		
		System.out.println(a5>>b5);
		
// Question 12
		
		int a6 = 10;
		// -11
		System.out.println(~a6);
		
// Question 13
		
		int a7 = 5;
		int b7 = 7;
		
		// a7 & b7
		// 5 & 7
		// 5
		
		System.out.println(a7&b7);
		
// Question 14 
		
		int a8 = 5;
		int b8 = 7;
		
		// a8 | b8
		// 5 | 7
		// 7 
		
		System.out.println(a8|b8);
		
// Question 15 
		
		int a9 = 5;
		int b9 = 7;
				
		// a9 ^ b9
		// 5 ^ 7
		// 2 
		
		System.out.println(a9^b9);
		
// Question 16
		
		int a10 = 10;
		System.out.println(a10++ + ++a10 + a10--);
		
		// 10 + 12 +12
		// 34
		
// Question 17
		
		int a11 = 1;
		
		a11+=a11 ++ + ++a11;
		
		// a = 2 + 3
		// a = 5
		
		
		System.out.println(a11);
		
// Question 19
		
		int a12 = 5;
		int b12 = 10;
		
		// it is not equal therefore it is false
		
		System.out.println(a12==b12);
		
//Question 20
		
		int a13 = 3;
		int b13 = 2;
		
		// 3*2 + 3/2
		// 6 + 1
		// 7
		
		System.out.println(a13*b13 + a13/b13);
		
//Question 21
		
		int a14 = 5;
		a14= a14++ + ++a14;
		
		// 5 + 7
		// 12
		
		System.out.println(a14);
		
// Question 22
		
		int a15 = 10;
		int b15 = 5;
		
		// a15>b15 = True
		// a15!=b15 = false then true
		// true  && true = True
		
		System.out.println(a15>b15 && a15!=b15);
		
// Question 23
		
		int x2 = 2;
		int y2 = 3;
		
		x2*=y2+1;
		
		// 2* = 3+1
		//2* = 4
		// 8
		
		System.out.println(x2);
		
// Question 24
		
		int a16 = 5;
		
		a16+=a16-=a16*=a16;
		
		// 5-=5*5
		// 5-= 25
		//5+-20
		//-15
		
		System.out.println(a16);
		
//Question 26
		
		int a17 = 5;
		
		System.out.println(a17++ + a17++ + ++a17);
		
		// 5 + 6 + 8
		// 19
		
//Question 27
		
		int a18 = 2;
		int b18 = 3;
		
		System.out.println(a18+b18 * a18/b18);
		
		// 2+3 * 2/3
		// 2+2
		//4
		
//Question 28
		
		int a19 = 10;
		int b19 = 20;
		
		System.out.println(a19<b19 && b19>a19);
		
		// true && true
		// true
		
//Question 29
		
		int a20 = 6;
		int b20 = 2;
		
		System.out.println((a20/b20)*(a20%b20));
		
		// 3 * 0
		// 0
		
//Question 30
		
		int a21 = 5;
		int b21 = 10;
		int c21 = 15;
		
		System.out.println((a21<b21 && b21>c21)|| !(b21<c21));
		
		// ( true && false ) || !(b21<c21)
		// false || false 
		// false
		
	}

}
