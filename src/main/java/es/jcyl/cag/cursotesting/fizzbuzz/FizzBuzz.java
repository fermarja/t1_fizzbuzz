package es.jcyl.cag.cursotesting.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private List<Converter> converters = new ArrayList<Converter>();
	
	public FizzBuzz() {
		super();
	}
	
	public String convertToString(int number) {
		for (Converter converter: converters) {
			if (converter.isCoverterFor(number)) {
				return converter.convert(number);
			}
		}
		return "";
	}
	
	public void addConverter(Converter converter) {
		converters.add(converter);
	}
}
