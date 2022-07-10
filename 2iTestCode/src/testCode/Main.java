package testCode;

public class Main {

	public static void main(String[] args) {

		//I have assumed A to be 2 and X to be 12
		//This allows 
		
		int A = 2;
		int X = 12;
		
		IterateOverMultiples objectA = new IterateOverMultiples();
		
		objectA.run(A, X);
		objectA.run((A+1), (2*X));
		objectA.run((A+2), (3*X));
	}
}
