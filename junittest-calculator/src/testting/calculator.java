package testting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class calculator {

	@Test
	public void test() {
		junittesting test=new junittesting();
		int output = test.square(5);
		assertEquals(25,output);
	}
	
	@Test
	public void test_StringCalculator_ForZero_shouldReturnZero()
	{
		junittesting test=new junittesting();
		assertEquals(test.cal(""),0);
	}
	
	@Test
	public void test_StringCalculator_GivenSingleValue_shouldReturnValue()
	{
		junittesting test=new junittesting();
		assertEquals(test.cal("1"),1);
	}
	
	@Test
	public void test_StringCalculator_GiventwoValue_shouldReturn_sumValue()
	{
		junittesting test=new junittesting();
		assertEquals(test.Add(0.1,0.1),0.2);	
	}
	
	@Test
	public void test_StringCalculator_GiventwoValue_shouldReturn_mulValue()
	{
		junittesting test=new junittesting();
		assertEquals(test.multiplication(-2,-2),4);	
		assertEquals(test.multiplication(4,-2),-8);	
	}
	
	
	
	
	
	
	
}
