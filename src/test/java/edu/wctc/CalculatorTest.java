package edu.wctc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator c;

    @Before
    public void setup() {
        c = new Calculator("TI-84");
    }

    @Test
    public void testAdd(){
        double sum = c.add(4,2);
        assertEquals("Sum failed",6, sum, 0);
    }

    @Test
    public void testSubtract(){
        double diff = c.subtract(5,2);
        assertEquals("diff failed",3,diff, 0);
    }

}