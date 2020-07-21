package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        LinkedList<Object> ll = new LinkedList(Arrays.asList(a));
        return ll;
    }

    public List buildList(Collection c) {
        LinkedList<Collection> ll = new LinkedList(Arrays.asList(c));
        return ll;
    }

    public List buildList(Object[] a1, Object[] a2) {
        LinkedList<Object> ll = new LinkedList(Arrays.asList(a1));
        Collections.addAll(ll, a2);
        return ll;
    }

    public List buildList(Collection c1, Collection c2) {
        LinkedList<Collection> ll = new LinkedList(Arrays.asList(c1));
        ll.add(c2);
        return ll;
    }
}
