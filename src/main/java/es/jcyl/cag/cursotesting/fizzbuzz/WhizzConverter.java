package es.jcyl.cag.cursotesting.fizzbuzz;

public class WhizzConverter implements Converter {

	public WhizzConverter() {
		super();
	}

	public String convert(int number) {
		return "Whizz";
	}

	public boolean isCoverterFor(int number) {
		return number % 7 == 0;
	}
	
	
}
