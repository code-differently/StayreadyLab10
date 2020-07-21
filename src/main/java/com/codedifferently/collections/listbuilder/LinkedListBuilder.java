package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {

    public List buildList(Object[] a) {

        return new LinkedList<>(Arrays.asList(a));
    }

    public List buildList(Collection c) {
        return buildList(c.toArray());
    }

    public List buildList(Object[] a1, Object[] a2) {
        return null;
    }

    public List buildList(Collection c1, Collection c2) {
        return buildList(c1.toArray(),c2.toArray());
    }
}
