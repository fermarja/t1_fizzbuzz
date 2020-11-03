package es.jcyl.cag.cursotesting.fizzbuzz;

public class Main {

	public static void main(String[] args) {
		FizzBuzz conversor = createFizzBuzz();
		for (int i = 1; i <= 100; i++) {
			System.out.println(conversor.convertToString(i));
		}
	}

	private static FizzBuzz createFizzBuzz() {
		FizzBuzz conversor = new FizzBuzz();
		conversor.addConverter(new FizzBuzzConverter());
		conversor.addConverter(new FizzConverter());
		conversor.addConverter(new BuzzConverter());
		conversor.addConverter(new DefaultConverter());
		return conversor;
	}
}
