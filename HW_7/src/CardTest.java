import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by сергей on 12.12.2016.
 */
public class CardTest {

    @Test
    public void shouldReturnSixOfPike(){
        //given
        int card = 6;
        int mast = 1;
        String exp = "Шестерка пик";

        //When

        String actual = Main.card(mast,card).toString();

        //Then

        assertEquals("Wrong actual card. Six of Pike", exp, actual);

    }


    @Test
    public void shouldReturnSevenHeart(){
        //given
        int card = 7;
        int mast = 4;
        String exp = "Семерка червы";

        //When

        String actual = Main.card(mast,card);

        //Then

        assertEquals("Wrong actual card. Seven of Heart is actual", exp, actual);

    }

    @Test
    public void shouldReturnNineDiamond(){
        //given
        int card = 9;
        int mast = 3;
        String exp = "Девятка бубны";

        //When

        String actual = Main.card(mast,card);

        //Then

        assertEquals("Wrong actual card. Nine of diamond is actual", exp, actual);

    }
    @Test
    public void souldReturnNoMatch(){
        //given
        int card = 6;
        int mast = 7;
        String exp = "Нет такой масти";

        //When

        String actual = Main.card(mast,card).toString();

        //Then

        assertEquals("Wrong actual card. No Match", exp, actual);

    }
}
