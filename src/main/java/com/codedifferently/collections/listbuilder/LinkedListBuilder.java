package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder{

    public List<Object> buildList(Object[] a) {
        return new LinkedList<Object>(Arrays.asList(a));
    }

    public List<Object> buildList(Collection<Object> c) {
        return new LinkedList<Object>(c);
    }

    public List<Object> buildList(Object[] a1, Object[] a2) {
        List<Object> list1 = buildList(a1);
        List<Object>list2 = buildList(a2);
        List<Object> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        return list3;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        List<Object> list1 = buildList(c1);
        List<Object> list2 = buildList(c2);
        List<Object> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        return list3;
    }
}
