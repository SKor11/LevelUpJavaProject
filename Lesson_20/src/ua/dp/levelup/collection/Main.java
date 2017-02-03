package ua.dp.levelup.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by java on 03.02.2017.

 */
public class Main {

    public static void main(String[] args) {
//        Collection list1 = new ArrayList<>();
//        Collection list2 = new ArrayList<>();
//
//
//        for (int i = 1; i <= 10; i++){
//            list1.add(i);
//        }
//
//        list1.add(132);
//        list2.add(132);
//
//        for (int i = 1; i <= 25; i++){
//            list2.add(i);
//        }
//
//        Collection list3 = new ArrayList<>(list1);
//        list3.addAll(list2);
//
//        System.out.println(list1.size());
//        System.out.println(list2.size());
//        System.out.println(list3.size());


        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));
        System.out.println(list.get(5));
    }


}
