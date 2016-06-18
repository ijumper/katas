package uk.co.ijump.fizzbuzz;


import static org.junit.Assert.*;
import org.junit.*;

public class FizzBuzzTest {

	@Test
	public void OneTest() {

		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals(fizzBuzz.FizzBuzzForNumber(1),"1");
	}

	@Test
       	public void TwoTest() {

                FizzBuzz fizzBuzz = new FizzBuzz();

                assertEquals(fizzBuzz.FizzBuzzForNumber(2),"2");
        }

	@Test
	public void ThreeTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals(fizzBuzz.FizzBuzzForNumber(3), "fizz");

	}

	@Test
	public void FiveTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
                assertEquals(fizzBuzz.FizzBuzzForNumber(5), "buzz");
	}


	@Test
        public void SixTest() {
                FizzBuzz fizzBuzz = new FizzBuzz();
                assertEquals(fizzBuzz.FizzBuzzForNumber(6), "fizz");
        }

        @Test
        public void NineTest() {
                FizzBuzz fizzBuzz = new FizzBuzz();
                assertEquals(fizzBuzz.FizzBuzzForNumber(9), "fizz");
        }

        @Test
        public void TenTest() {
                FizzBuzz fizzBuzz = new FizzBuzz();
                assertEquals(fizzBuzz.FizzBuzzForNumber(10), "buzz");
        }

	@Test
        public void FifteenTest() {
                FizzBuzz fizzBuzz = new FizzBuzz();
                assertEquals(fizzBuzz.FizzBuzzForNumber(15), "fizzbuzz");
        }

	
}

