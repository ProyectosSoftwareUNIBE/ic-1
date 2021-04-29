import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction fraction;
	
	@Before
	public void before(){
		
		this.fraction = new Fraction(8,2);
	}

	@Test
	public void getSumaNumeros() {
		
		assertEquals(10, this.fraction.getSumaNumeros());
		
	}


}
