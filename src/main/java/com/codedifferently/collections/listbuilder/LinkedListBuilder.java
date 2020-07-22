package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a) {
        LinkedList<Object> linkedList = new LinkedList<Object>(Arrays.asList(a));
        return linkedList; 
    }

    public List<Object> buildList(Collection<Object> c) {
        LinkedList<Object> linkedList = new LinkedList<Object>(c);
        return linkedList;
    }

    public List<Object> buildList(Object[] a1, Object[] a2) {
        LinkedList<Object> a1List = new LinkedList<Object>(Arrays.asList(a1));
        a1List.addAll(Arrays.asList(a2));
        return a1List;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        LinkedList<Object> c1List = new LinkedList<Object>(c1);
        c1List.addAll(c2);
        return c1List;
    }
    
}