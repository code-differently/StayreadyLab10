package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder{

    @Override
    public List buildList(Object[] a) {
        return new LinkedList<>(Arrays.asList(a));
    }

    @Override
    public List buildList(Collection c) {
        return new LinkedList<Object>(Arrays.asList(c));
    }

    @Override
    public List buildList(Object[] a1, Object[] a2) {
        List<Object> list = new LinkedList<Object>();
        list.addAll(buildList(a1));
        list.addAll(buildList(a2));
        return list;
    }

    @Override
    public List buildList(Collection c1, Collection c2) {
        List<Object> list = new LinkedList<Object>();
        list.addAll(buildList(c1));
        list.addAll(buildList(c2));
        return list;
    }
}
