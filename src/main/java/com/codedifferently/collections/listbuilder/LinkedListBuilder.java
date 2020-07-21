package com.codedifferently.collections.listbuilder;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;

public class LinkedListBuilder implements ListBuilder {

    public LinkedList<Object> buildList(Object[] a) {
        return new LinkedList<>(Arrays.asList(a));
    }

    public LinkedList<Object> buildList(Collection<Object> c) {
        return new LinkedList<>(c);
    }

    public LinkedList<Object> buildList(Object[] a1, Object[] a2) {
        LinkedList<Object> ret = new LinkedList<>(Arrays.asList(a1));
        ret.addAll(Arrays.asList(a2));
        return ret;
    }

    public LinkedList<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        c1.addAll(c2);
        return new LinkedList<>(c1);
    }

}
