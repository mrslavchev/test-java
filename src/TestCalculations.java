import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCalculations {
	@Test
	public void TestSum(){
		Assert.assertEquals(Calculations.Sum(2, 2), 4);
	}
	
	@Test
	public void TestSubtraction(){
		Assert.assertEquals(Calculations.Subtraction(2, 2), 4);
	}
	
	@Test
	public void TestMultiplication(){
		Assert.assertEquals(Calculations.Multiplication(2, 5), 4);
	}
	
	@Test
	public void TestDivision(){
		Assert.assertEquals(Calculations.Division(30, 2), 4);
		System.out.println("dajdbahjdbad");
		System.out.println("pe60");
	}
	
	@Test
	public void TestMultiplication2(){
		Assert.assertEquals(Calculations.Multiplication(5, 5), 4);
	}
}
