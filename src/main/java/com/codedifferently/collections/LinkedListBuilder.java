package com.codedifferently.collections;

import com.codedifferently.collections.listbuilder.ListBuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {
    @Override
    public List buildList(Object[] a) {
        LinkedList<Object> linkedList = new LinkedList(Arrays.asList(a));
        return linkedList;
    }

    @Override
    public List buildList(Collection c) {
        LinkedList<Object> linkedList = new LinkedList<Object>(c);
        return linkedList;
    }

    @Override
    public List buildList(Object[] a1, Object[] a2) {
        LinkedList<Object> linkedList = new LinkedList(Arrays.asList(a1));
        LinkedList<Object> linkedList2 = new LinkedList(Arrays.asList(a2));
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    @Override
    public List buildList(Collection c1, Collection c2) {
        LinkedList<Object> linkedList = new LinkedList<Object>(c1);
        LinkedList<Object> linkedList2 = new LinkedList<Object>(c2);
        linkedList.addAll(linkedList2);
        return linkedList;
    }
}
