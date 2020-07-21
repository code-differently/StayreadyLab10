package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder {

    public List buildList(Object[] a) {

        return new LinkedList<>(Arrays.asList(a));
    }

    public List buildList(Collection c) {
        return buildList(c.toArray());
    }

    public List buildList(Object[] a1, Object[] a2) {
        LinkedList<Object> list = new LinkedList<>();

        for (Object obj: a1)
        {
            list.addLast(obj);
        }
        for (Object obj: a2)
        {
            list.addLast(obj);
        }

        return list;
    }

    public List buildList(Collection c1, Collection c2) {
        return buildList(c1.toArray(),c2.toArray());
    }
}
