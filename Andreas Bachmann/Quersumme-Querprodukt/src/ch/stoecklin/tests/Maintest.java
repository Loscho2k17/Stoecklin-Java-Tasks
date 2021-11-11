package ch.stoecklin.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static ch.stoecklin.Main.*;
class Maintest {

	@Test
	void fnof100equals12() {
		assertEquals(12,count(100));
	}
	@Test
	void fnof1000000equals309() {
		assertEquals(309,count(1000000));
	}
	@Test
	void fnof5000000equals742() {
		assertEquals(742,count(5000000));
	}

}
