package es.jcyl.cag.cursotesting.fizzbuzz;

public class FizzConverter implements Converter {

	public FizzConverter() {
		super();
	}
	public String convert(int number) {
		return "Fizz";
	}

	public boolean isCoverterFor(int number) {
		return number % 3 == 0;
	}
}
