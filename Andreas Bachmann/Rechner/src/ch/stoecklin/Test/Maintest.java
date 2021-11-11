package ch.stoecklin.Test;

import static org.junit.jupiter.api.Assertions.*;
import ch.stoecklin.Main;
import org.junit.jupiter.api.Test;

class Maintest {

	@Test
	public void calc3And5AndAdditon(){
		assertEquals(8,Main.calc(3,5,"+"));
	}

	@Test
	public void calc8And4AndSubtraction(){
		assertEquals(4,Main.calc(8,4,"-"));
	}
	
	@Test
	public void calc12And24AndMultiplication(){
		assertEquals(288,Main.calc(12,24,"*"));
	}
	
	@Test
	public void calc24And12AndDivison(){
		assertEquals(2,Main.calc(24,12,"/"));
	}
	
	@Test
	public void calc11And2AndModulo(){
		assertEquals(1,Main.calc(11,2,"%"));
	}
}
