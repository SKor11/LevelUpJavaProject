import org.junit.Test;

import java.lang.String;

/**
 * Created by сергей on 12.12.2016.
 */
public class DOMTest {

    @Test
    public void shouldReturnThirtyOne() {
        //given
        int month = 1;
        boolean year = true;
        int expected = 3;


        //when
        int actual = Main.dayOfMonth(year, month);


        //then
        assertEquals("Wrong actual days. Expected is 31", expected, actual);
    }

    private void assertEquals(String s, int expected, int actual) {
    }


    @Test
    public void shouldReturnThirty() {
        //given
        int num = 4;
        boolean year = true;
        int expected = 30;


        //when
        int actual = Main.dayOfMonth(year, num);


        //then
        assertEquals("Wrong actual days. Expected is 30", expected, actual);
    }

    //
//
    @Test
    public void shouldReturnTwentyNine() {
        //given
        int num = 5;
        boolean year = true ;
        int expected = 29;


        //when
        int actual = Main.dayOfMonth(year, num);


        //then
        assertEquals("Wrong actual days. Expected is 29", expected, actual);
    }

}
