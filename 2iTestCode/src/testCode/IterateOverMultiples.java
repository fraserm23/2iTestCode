package testCode;

public class IterateOverMultiples {

	public IterateOverMultiples() {}

	public void run(int A, int X) {
		
		int multiplesOfA = A;
		
		for(int i = 0; i < X; i++) {
			if (multiplesOfA == X) {
				System.out.println("X has been met. A is " +A +" and X is " +X);
				break;
			}
			
			multiplesOfA += +A;
		}
	}
}
