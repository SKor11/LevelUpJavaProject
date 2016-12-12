import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by сергей on 12.12.2016.
 */
public class ReversTest {

    @Test
    public void shouldReturnREWQ() {
        //given
        String word = "qwer";
        char [] exp = "rewq";

        //When
        String actual =Main.revers(word);

        //Then
        assertEquals("Wrong actual num. One is actual", exp, actual);
    }

}
