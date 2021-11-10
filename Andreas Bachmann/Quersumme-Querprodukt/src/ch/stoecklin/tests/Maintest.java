package ch.stoecklin.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ch.stoecklin.Main.main;
import static ch.stoecklin.Digits.main;
class Maintest {

	@Test
	void fnof100equals12() {
		assertEquals(12,fn(100));
	}
	@Test
	void fnof1000000equals309() {
		assertEquals(309,fn(1000000));
	}
	@Test
	void fnof5000000equals742() {
		assertEquals(742,fn(5000000));
	}

}
