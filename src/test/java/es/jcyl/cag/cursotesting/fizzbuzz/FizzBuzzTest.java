package es.jcyl.cag.cursotesting.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

	public FizzBuzzTest () {
		super();
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testCeroNoPermitido() {
		convert(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativosNoPermitidos() {
		convert(-1);
	}
	
	
	  
	@Test
	@Parameters({"1", "2", "8"})
	public void testNumerosNoMultiposDe3_5_7(int number) {
		Assert.assertEquals(Integer.toString(number), convert(number));
	}

	
	@Test
	@Parameters({"3", "6", "9"})
	public void testMultiposDe3Fizz(int number) {
		Assert.assertEquals("Fizz", convert(number));
	}
	
	@Test
	@Parameters({"5", "10", "20"})
	public void testMultiplosDe5Buzz(int number) {
		Assert.assertEquals("Buzz", convert(number));
	}
	
	@Test 
	@Parameters({"15", "30", "45"})
	public void testMultiplosDe3y5FizzBuz(int number) {
		Assert.assertEquals("FizzBuzz?", convert(number));
	}
	
	
	@Test
	@Parameters({"13", "23", "31"})
	public void testContiene3Fizz(int number) {
		Assert.assertEquals("Fizz", convert(number));
	}
	
	@Test
	@Parameters({"52", "58"})
	public void testContinene5Buzz(int number) {
		Assert.assertEquals("Buzz", convert(number));
	}
	
	@Test
	@Parameters({"7", "14"})
	public void testWitzzParaMultiplosDe7(int number) {
		Assert.assertEquals("Whizz", convert(number));
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
