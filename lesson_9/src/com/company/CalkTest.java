package com.company;

import org.junit.Test;

/**
 * Created by java on 09.12.2016.
 */
public class CalkTest {
    @Test
    public void shouldSumIntegersWithoutExceptions(){

        //given
        int a = 5, b = 7 ;
        int expected = 12;

        //when
        int actual = Calc.sum(a,b);

        //then
        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {
    }

}
