package doubts;

public class DemoTwo {

	public static void main(String[] args) {
		
		int a = 5;
		
		sampleOne(Integer.valueOf(a)); // Boxing
		sampleOne(a); // Auto-Boxing
	}
	
	public static void sampleOne(Integer b) {
		
		System.out.println(b);
		
	}

}
