import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by сергей on 12.12.2016.
 */
public class NumToStrTest{

    @Test
    public void shouldReturnOne() {
        //given
        int num = 1;
        String exp = "one";

        //When
        String actual = Main.numToStr(num);

        //Then
        assertEquals("Wrong actual num. One is actual", exp, actual);
    }
    @Test
    public void shouldReturnTwo() {
        //given
        int num = 2;
        String exp = "two";

        //When
        String actual = Main.numToStr(num);

        //Then
        assertEquals("Wrong actual num. two is actual", exp, actual);
    }
    @Test
    public void shouldReturnFive() {
        //given
        int num = 5;
        String exp = "five";

        //When
        String actual = Main.numToStr(num);

        //Then
        assertEquals("Wrong actual num. five is actual", exp, actual);
    }
    @Test
    public void shouldReturnNoMatch() {
        //given
        int num = 11;
        String exp = "No match";

        //When
        String actual = Main.numToStr(num);

        //Then
        assertEquals("Wrong actual num. No match is actual", exp, actual);
    }
}
