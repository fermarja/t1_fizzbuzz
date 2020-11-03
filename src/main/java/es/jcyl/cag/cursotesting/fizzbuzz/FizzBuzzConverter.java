package es.jcyl.cag.cursotesting.fizzbuzz;

public class FizzBuzzConverter implements Converter {

	public FizzBuzzConverter() {
		super();
	}

	public String convert(int number) {
		return "FizzBuzz?";
	}

	public boolean isCoverterFor(int number) {
		return number % 15 == 0;
	}
}
