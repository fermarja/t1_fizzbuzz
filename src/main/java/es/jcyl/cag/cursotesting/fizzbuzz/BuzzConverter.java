package es.jcyl.cag.cursotesting.fizzbuzz;

public class BuzzConverter implements Converter {

	public BuzzConverter() {
		super();
	}

	public String convert(int number) {
		return "Buzz";
	}

	public boolean isCoverterFor(int number) {
		return number % 5 == 0;
	}
}

