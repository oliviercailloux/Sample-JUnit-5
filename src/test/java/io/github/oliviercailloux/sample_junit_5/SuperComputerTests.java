package io.github.oliviercailloux.sample_junit_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SuperComputerTests {

	@Test
	void testComplicatedComputationWithParameter0() {
		SuperComputer superComputer = new SuperComputer();
		int obtained = superComputer.complicatedComputation(0);
		assertEquals(3, obtained);
	}

}
