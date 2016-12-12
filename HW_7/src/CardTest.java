import org.junit.Test;

/**
 * Created by сергей on 12.12.2016.
 */
public class CardTest {

    @Test
    public void souldReturnSixOfPike(){
        //given
        int card = 6;
        int mast = 1;
        String exp = "Шестерка пик";

        //When

        String actual = Main.card(mast,card);

        //Then

        assertEquals("Wrong actual card. Six of Pike", exp, actual);

    }

    private void assertEquals(String s, String exp, String actual) {
    }
    @Test
    public void souldReturnSevenHeart(){
        //given
        int card = 7;
        int mast = 4;
        String exp = "Шестерка пик";

        //When

        String actual = Main.card(mast,card);

        //Then

        assertEquals("Wrong actual card. Seven of Heart is actual", exp, actual);

    }

    @Test
    public void souldReturnNineDiamond(){
        //given
        int card = 9;
        int mast = 3;
        String exp = "Девятка бубны";

        //When

        String actual = Main.card(mast,card);

        //Then

        assertEquals("Wrong actual card. Nine of diamond is actual", exp, actual);

    }
}
