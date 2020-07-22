package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ListBuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class ArrayListBuilder implements ListBuilder {

    @Override
    public List buildList(Object[] a) {
        ArrayList<Object> list = new ArrayList(Arrays.asList(a));
        return list;
    }

    @Override
    public List buildList(Collection c) {
        ArrayList<Object> list = new ArrayList<Object>(c);
        return list;
    }

    @Override
    public List buildList(Object[] a1, Object[] a2) {
        ArrayList<Object> list = new ArrayList(Arrays.asList(a1));
        ArrayList<Object> list2 = new ArrayList(Arrays.asList(a2));
        list.addAll(list2);
        return list;
    }

    @Override
    public List buildList(Collection c1, Collection c2) {
        ArrayList<Object> list = new ArrayList<Object>(c1);
        ArrayList<Object> list2 = new ArrayList<Object>(c2);
        list.addAll(list2);
        return list;
    }
}
