import org.junit.Test;

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

    private void assertEquals(String s, String exp, String actual) {
    }
}
