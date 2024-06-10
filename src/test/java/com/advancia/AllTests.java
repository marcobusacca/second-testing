package com.advancia;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, ProvaTest.class})
public class AllTests {

}
