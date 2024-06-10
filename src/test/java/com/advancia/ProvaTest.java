package com.advancia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProvaTest {
	
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
	void test() {
		int num1 = 5;
		int num2 = 5;
		assertTrue(num1 == num2);
	}

}
