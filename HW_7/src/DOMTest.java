import org.junit.Test;

import java.lang.String;

/**
 * Created by сергей on 12.12.2016.
 */
public class DOMTest {

    @Test
    public void shouldReturnThirtyOne() {
        //given
        int num = 1;
        String year = "Высокосный";
        String expected = " 1";


        //when
        String actual = Main.dayOfMonth(year, num);


        //then
        assertEquals("Wrong actual days. Expected is 31", expected, actual);
    }

    private void assertEquals(String s, String expected, String actual) {
    }


    @Test
    public void shouldReturnThirty() {
        //given
        int num = 4;
        String year = "Высокосный";
        String expected = "30";


        //when
        String actual = Main.dayOfMonth(year, num);


        //then
        assertEquals("Wrong actual days. Expected is 30", expected, actual);
    }

    //
//
    @Test
    public void shouldReturnTwentyNine() {
        //given
        int num = 2;
        String year = "Высокосный";
        String expected = "29";


        //when
        String actual = Main.dayOfMonth(year, num);


        //then
        assertEquals("Wrong actual days. Expected is 29", expected, actual);
    }

}
