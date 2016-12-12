import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by сергей on 12.12.2016.
 */
public class CalendarTest {

    @Test
    public void shouldReturnMonday(){
        //given
       int day = 8;
       String exp = "Понедельник";

        //When
        String actual = Main.calendar(day);

        //Then
        assertEquals("Wrong actual day. Monday is actual", exp, actual);
    }


    @Test
    public void shouldReturnSunday(){
        //given
        int day = 14;
        String exp = "Воскресение";

        //When
        String actual = Main.calendar(day);

        //Then
        assertEquals("Wrong actual day. Sunday is actual", exp, actual);
    }


}
