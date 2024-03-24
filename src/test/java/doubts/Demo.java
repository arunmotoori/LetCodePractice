package doubts;

public class Demo {

	public static void main(String[] args) {
		
		
		int a = 5;
		System.out.println(a);
		Integer b = Integer.valueOf(a);  // Boxing
		System.out.println(b);
		
		int c = b.intValue(); // Unboxing
		System.out.println(c);
		
		
		int x = 9;
		System.out.println(x);
		Integer y = x;  // Auto-Boxing
		System.out.println(y);
		int z = y; // Auto-unboxing
		System.out.println(z);
		
		

	}

}
