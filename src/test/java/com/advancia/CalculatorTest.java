package com.advancia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeAll
    public static void setup() {
        // eseguito una volta
        // prima di tutti i metodi di test
		System.out.println("Started");
    }
    
    @BeforeEach
    public void init() {
        // eseguito prima di ogni metodo di test
    	System.out.println("prima di ogni metodo di test");
    	calculator = new Calculator();
    }
    
    @AfterEach
    public void clear() {
        // eseguito dopo ogni metodo di test
    	System.out.println("dopo ogni metodo di test");
    }
    
    @AfterAll
    public static void cleanup() {
        // eseguito una volta
        // dopo di tutti i metodi di test
    	System.out.println("Finished");
    }

	@Test
	public void test() {
		String o = "ciao";
		String b = o;
//		String c = "hello";
		
		assertSame(b, o);
//		assertSame(b, c);
	}
	
	@RepeatedTest(5)
	public void testMultiplo() {
		assertEquals(0, calculator.multiply(0, 5));
		assertEquals(0, calculator.multiply(5, 0));
	}
	
	@Test
	public void testDivision() {
		assertEquals(5, calculator.division(20, 4));
	}
	
	@Test
	public void whenExceptionThrow() {
		Exception e = assertThrows(NumberFormatException.class, () -> {
			calculator.division("kk", 1);
		});
		
		String msgExpected = "For input string";
		String msgActual = e.getMessage();
		
		assertTrue(msgActual.contains(msgExpected));
	}
}
