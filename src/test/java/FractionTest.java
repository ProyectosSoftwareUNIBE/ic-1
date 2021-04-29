import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction fraction;
	
	@Before
	public void before(){
		
		this.fraction = new Fraction(10,20);
	}

	@Test
	public void getSumaNumeros() {
		
		assertEquals(30, this.fraction.getSumaNumeros());
		
	}
	@Test
	
	public void getRestaNumeros() {
		
		assertEquals(-10, this.fraction.getRestaNumeros());
		
	}
	@Test
	
	public void getInversoNumeros() {
		
		assertEquals(2, this.fraction.getInversoNumeros() );
	}


}
