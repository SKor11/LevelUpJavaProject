package ua.dp.levelup.doybly_linked_list;

/**
 * Created by java on 31.01.2017.
 */
public class Node<V>{
    private Node<V> next = null;
    private Node<V>  prev = null;

    public Node(Node next) {
        this.next = next;
    }

    private  V value = null;

    public Node<V> getNext() {
        return next;
    }

    public void setNext(Node<V> next) {
        this.next = next;
        if (null != next) next.setPrev(this);
    }

    public Node<V> getPrev() {
        return prev;
    }

    public void setPrev(Node<V> prev) {
        this.prev = prev;
        if (null != prev) prev.setNext(this);
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}