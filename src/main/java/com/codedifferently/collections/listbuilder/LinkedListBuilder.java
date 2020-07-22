package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a) {
        LinkedList <Object> list = new LinkedList<Object>(Arrays.asList(a));
        return list;
    }

    public List<Object> buildList(Collection<Object> c) {
        LinkedList<Object> list = new LinkedList<Object>(c);
        return list;
    }

    public List<Object> buildList(Object[] a1, Object[] a2) {
        LinkedList<Object> aList1 = new LinkedList<Object>(buildList(a1));
        LinkedList<Object> aList2 = new LinkedList<Object>(buildList(a2));
        List<Object> combinedList = new LinkedList<Object>();

        combinedList.addAll(aList1);
        combinedList.addAll(aList2);

        return combinedList;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        LinkedList<Object> list1 = new LinkedList<Object>(c1);
        LinkedList<Object> list2 = new LinkedList<Object>(c2);
        list1.add(list2);

        return list1;
    }
}