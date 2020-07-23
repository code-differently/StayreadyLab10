package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder{
    public List buildList(Object[] a) {
       List<Object> list1= new LinkedList(Arrays.asList(a));
        return list1;
    }

    public List buildList(Collection c) {
        List<Object> list = new LinkedList(c);

        return list;
    }

    public List buildList(Object[] a1, Object[] a2) {
        List<Object> list1= new LinkedList(Arrays.asList(a1));
        List<Object> list2= new LinkedList(Arrays.asList(a2));
        list1.addAll(list2);
        return list1;
    }

    public List buildList(Collection c1, Collection c2) {
        List<Object> list1= new LinkedList<Object>(c1);
        List<Object> list2 = new LinkedList<Object>(c2);
        list1.addAll(list2);
        return list1;
    }
}
