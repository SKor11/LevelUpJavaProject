import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AListTest {

    AList list;

    @Before
    public void setUp(){
      list = new AList();
    }

    @Test
    public void shouldAddElementsAndReturnSizeOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(5);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldCheckThatListEmpty() throws Exception {
        //given
        int expected = 0;

        //when
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldAddElementsAndReturnSizeTwo() throws Exception {
        //given
        int expected = 2;

        //when
        list.add(5);
        list.add(6);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public void shouldAddElementsMoreThanInitialSizeWithoutTroubles() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i<11; i++){
            list.add(i+1);
        }
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test
    public void shouldReturnLastAddedElement(){
        //given
        int expected = 11;

        //when
        for (int i = 0; i<11; i++){
            list.add(i+1);
        }
        int lastAddedIndex = list.size() - 1;
        int actual = list.get(lastAddedIndex);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetZeroElementAndThrowException(){
        //when
        list.get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetElevenElementAndThrowException(){
        //when
        list.get(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetNegativeElementAndThrowException(){
        //when
        list.get(-1);
    }

    @Test
    public void shouldRemoveElementFromEmptyList() throws Exception {
        //given
        int expected = 0;

        //when
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementFromListAndReturnZero() throws Exception {
        //given
        int expected = 0;

        //when
        list.add(1);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLengthToTen() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i<9; i++){
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        int actual = list.getArrayLength();


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public void shouldRemoveSecondElementFromListAndReturnOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldIncreaseArrayLength() throws Exception {
        //given
        int expected = (int) (8 * 1.5);

        //when
        for (int i = 0; i<9; i++){
            list.add(i + 1);
        }

        int actual = list.getArrayLength();


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 9 * 1.5", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLength() throws Exception {
        //given
        int expected = (int) (7 * 1.5);

        //when
        for (int i = 0; i<9; i++){
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        int actual = list.getArrayLength();


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 7 * 1.5", expected, actual);
    }

}