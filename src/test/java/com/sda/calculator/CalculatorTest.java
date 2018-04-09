package com.sda.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
         this.calculator = new Calculator();
    }

    @Test

    public void testAdd(){
        //given
        //Calculator calculator = new Calculator();

        //when
        int sum = calculator.sum(3,5);

        //then
        Assert.assertEquals("Result is not 8",8, sum);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 5);

        Assert.assertEquals(5, result);
    }
        @Test

                public void testMultiply(){
            Calculator calculator = new Calculator();

            int result = calculator.multiply(10,5);
            Assert.assertEquals(50,result);
        }
        public void testDivide() {
            Calculator calculator = new Calculator();
        Assert.assertEquals(2,calculator.divide(10,5));
        Assert.assertEquals(1,calculator.divide(8,5));
        Assert.assertEquals(0,calculator.divide(4,5));
        }
    }
