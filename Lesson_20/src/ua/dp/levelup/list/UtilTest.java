package ua.dp.levelup.list;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by java on 07.02.2017.
 */
public class UtilTest {

    @Test
    public void testArraysCopyOf(){
        String[] arr = { "a", "b", "c"};
        String[] arr2 = Arrays.copyOf(arr, arr.length);

        assertTrue(Arrays.equals(arr, arr2));

        System.out.println(Arrays.binarySearch(arr,"b"));
    }

    @Test
    public void testArraysAsList(){
        String[] arr = new String[3];
        List<String> list = new ArrayList<>();
        for (String s : arr) list.add(s);

        ArrayList<String> list2 =(ArrayList<String>) Arrays.asList(arr);
    }

    @Test
    public void testHashSet(){
        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(4);
        intSet.add(3);
        intSet.add(1);
        intSet.add(2);

        System.out.println(intSet.toString());

        Set<String> hash = new HashSet<>();

        hash.add("castle");
        hash.add("bridge");
        hash.add("castle");
        hash.add("moat");

        System.out.println(hash);
    }
}
