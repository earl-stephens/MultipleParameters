package application;

public class App {

	public static void main(String[] args) {
		
		final int toSquare = 9;
		
		Calculator calc = new Calculator();
		
		int squared = calc.square(toSquare);
		System.out.printf("%d squared is %d\n", toSquare, squared);
		
		int added = calc.add(7, 5);
		System.out.println("7 + 5 = " + added);
		
		int difference = calc.subtract(8, 3);
		System.out.println("8 - 3 = " + difference);

		int quotient = calc.divide(27, 9);
		System.out.println("27 / 9 = " + quotient);
		
		int product = calc.multiply(6, 7);
		System.out.println("6 * 7 = " + product);
	}

}
