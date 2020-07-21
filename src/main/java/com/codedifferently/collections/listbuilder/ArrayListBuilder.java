package com.codedifferently.collections.listbuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements  ListBuilder{

    public List buildList(Object[] a) {
        return Arrays.asList(a);
    }

    public List buildList(Collection c) {
        return new ArrayList<>(c);
    }

    public List buildList(Object[] a1, Object[] a2) {
        ArrayList<Object> combined=new ArrayList<Object>();
        combined.addAll(buildList(a1));
        combined.addAll(buildList(a2));
        return combined;
    }

    public List buildList(Collection c1, Collection c2) {
        ArrayList<Object> combined=new ArrayList<Object>();
        combined.addAll(buildList(c1));
        combined.addAll(buildList(c2));
        return combined;
    }
}
