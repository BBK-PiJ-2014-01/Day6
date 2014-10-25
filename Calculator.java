public class Calculator {

	public int add (int a, int b) {
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		return(result);	
	}

	public int substract (int a, int b) {
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		return(result);	
	}

	public int multiply (int a, int b) {
		int result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		return(result);	
	}

	public double divide (int a, int b) {
		double result = (double) a / (double) b;
		System.out.println(a + " / " + b + " = " + result);
		return(result);	
	}

	public int modulus (int a, int b) {
		int result = a % b;
		System.out.println(a + " % " + b + " = " + result);
		return(result);	
	}
}