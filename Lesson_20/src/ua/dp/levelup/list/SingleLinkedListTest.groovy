//package ua.dp.levelup.list
//
//import spock.lang.Specification
//
///**
// * Created by java on 24.01.2017.
// */
//class SingleLinkedListTest extends Specification {
//
//
//    def "add first node to empty list"() {
//        SingleLinkedList list = new SingleLinkedList();
//
//        when: 'add node element'
//        list.addFirst(new Node(1))
//
//        then: 'check size'
//        list.size() == 1
//        list.getFirst().isPresent()
//        list.getFirst().get().value == 1
//
////
////        when: 'add one more node element'
////        list.addNode(new Node(5))
////
////        then:'check size'
////        list.size == 2
////        list.root.next != null
//
//        def "add first node to list with 1 element"() {
//            SingleLinkedList list1 = new SingleLinkedList();
//
//
//            list1.addFirst(new Node(1))
//
//            when: 'add one more node element'
//            list.addFirst(new Node(5))
//
//            then: 'check size'
//            list.size == 2
//            list.getFirst().isPresent()
//            list.getFirst().get().value == 5
//
//        }
//    }
//}