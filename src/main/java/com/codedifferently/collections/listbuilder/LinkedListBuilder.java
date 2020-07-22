package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder{
    public List buildList(Object[] a) {
        List<Object> linkedList = new LinkedList<Object>();
        for (Object item : a){
            linkedList.add(item);
        }
        return linkedList;
    }

    public List buildList(Collection c) {
        List<Object> linkedList = new LinkedList<Object>();
        linkedList.addAll(c);
        return linkedList;
    }

    public List buildList(Object[] a1, Object[] a2) {
        List<Object> linkedList = new LinkedList<Object>();
        for (Object item: a1) {
            linkedList.add(item);
        }
        for (Object i: a2) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public List buildList(Collection c1, Collection c2) {
        List<Object> linkedList = new LinkedList<Object>();
        linkedList.addAll(c1);
        linkedList.addAll(c2);
        return linkedList;
    }
}
