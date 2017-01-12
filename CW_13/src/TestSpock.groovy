import static org.junit.Assert.assertArrayEquals

/**
 * Created by java on 20.12.2016.
 */
class TestSpock extends spock.lang.Specification {


    def "BubbleSort test"() {
        int[] actual = [8, 5, 3, 6, 1, 0];
        int[] expected = [0, 1, 3, 5, 6, 8];

        when:
        Main.bubbleSort(actual)

        then:
        assertArrayEquals(expected, actual)

    }

    def "BubbleSort test 2"(){
        int [] actual = [0, 1, 3, 5, 6, 8];
        int [] expected = [0, 1, 3, 5, 6, 8];

        when:
        Main.bubbleSort(actual)

        then:
        assertArrayEquals( expected, actual)
    }

    def "BubbleSort test one element"(){
        int [] actual = [1];
        int [] expected = [1];

        when:
        Main.bubbleSort(actual)

        then:
        assertArrayEquals( expected, actual)
    }

    def "BubbleSort test null"(){
        int [] actual = [];
        int [] expected = [];

        when:
        Main.bubbleSort(actual)

        then:
        assertArrayEquals( expected, actual)
    }

    def "BubbleSort test minus"(){
        int [] actual = [0,4,-2];
        int [] expected = [-2,0,4];

        when:
        Main.bubbleSort(actual)

        then:
        assertArrayEquals( expected, actual)
    }

}
