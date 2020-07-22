package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        LinkedList linkedList = new LinkedList(Arrays.asList(a));
        return linkedList;
    }

    public List buildList(Collection c) {
        LinkedList linkedList = new LinkedList(c);
        return linkedList;
    }

    public List buildList(Object[] a1, Object[] a2) {
        LinkedList linkedList = new LinkedList(Arrays.asList(a1));
        linkedList.add(a2);
        return linkedList;
    }

    public List buildList(Collection c1, Collection c2) {
        LinkedList linkedList = new LinkedList(c1);
        linkedList.add(c2);
        return linkedList;
    }
}
