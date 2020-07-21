package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder{

    public List buildList(Object[] a) {
        return new LinkedList<Object>(Arrays.asList(a));
    }


    public List buildList(Collection c) {
        return new LinkedList<Object>(Arrays.asList(c));
    }


    public List buildList(Object[] a1, Object[] a2) {
        List<Object> combined=new LinkedList<Object>();
        combined.addAll(buildList(a1));
        combined.addAll(buildList(a2));
        return combined;
    }


    public List buildList(Collection c1, Collection c2) {
        List<Object> combined=new LinkedList<Object>();
        combined.addAll(buildList(c1));
        combined.addAll(buildList(c2));
        return combined;
    }
}
