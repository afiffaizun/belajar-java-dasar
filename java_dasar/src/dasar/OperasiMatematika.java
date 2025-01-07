package dasar;

public class OperasiMatematika {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		System.out.println( a % b );
		
		//Increment dan Decrement
		System.out.println(a++);
		System.out.println(a--);
		
		//Penugasan
		int x = 5;
		x += 4; // x = x + 4;
		System.out.println(x);
		
		int y = 5;
		y -= 1; // y = y - 1;
		System.out.println(y);
	}

}
