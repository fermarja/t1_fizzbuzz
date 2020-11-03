package es.jcyl.cag.cursotesting.fizzbuzz;

public class DefaultConverter implements Converter{

	public DefaultConverter() {
		super();
	}

	public String convert(int number) {
		return Integer.toString(number);
	}

	public boolean isCoverterFor(int number) {
		return true;
	}
	
}
