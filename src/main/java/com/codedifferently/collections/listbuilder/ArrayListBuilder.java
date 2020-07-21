package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder{

    @Override
    public List buildList(Object[] a) {
        return Arrays.asList(a);

    }

    @Override
    public List buildList(Collection c) {
        return new ArrayList<>(c);
    }

    @Override
    public List buildList(Object[] a1, Object[] a2) {
        List<Object> list = new ArrayList<Object>();
        list.addAll(buildList(a1));
        list.addAll(buildList(a2));
        return list;
    }

    @Override
    public List buildList(Collection c1, Collection c2) {
        List<Object> c = new ArrayList<Object>();
        c.addAll(buildList(c1));
        c.addAll(buildList(c2));
        return c;
    }
}
