package es.jcyl.cag.cursotesting.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	public FizzBuzzTest () {
		super();
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testCero() {
		convert(0);
	}
	
	@Test
	public void testUno() {
		Assert.assertEquals("1", convert(1));
	}
	@Test
	public void testDos() {
		Assert.assertEquals("2", convert(2));
	}
	
	@Test
	public void testTres() {
		Assert.assertEquals("Fizz", convert(3));
	}
	
	@Test
	public void tresCinco() {
		Assert.assertEquals("Buzz", convert(5));
	}
	
	@Test 
	public void testQuince() {
		Assert.assertEquals("FizzBuzz?", convert(15));
	}
	
	
	@Test
	public void testModificacionFizzSiTiene3() {
		Assert.assertEquals("Fizz", convert(13));
	}
	
	@Test
	public void testModifcacionBuzzSiTiene5() {
		Assert.assertEquals("Buzz", convert(52));
	}
	
	@Test
	public void testModificacionWhizzMultiplos7() {
		Assert.assertEquals("Whizz", convert(7));
	}
	
	
	private String convert(int value) {
		FizzBuzz conversor = new FizzBuzz();
		conversor.addConverter(new WhizzConverter());
		conversor.addConverter(new FizzBuzzConverter());
		conversor.addConverter(new FizzConverter());
		conversor.addConverter(new BuzzConverter());
		conversor.addConverter(new DefaultConverter());
		return conversor.convertToString(value);
	}
}
