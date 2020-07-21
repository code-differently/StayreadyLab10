package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListBuilder implements ListBuilder {

    public ArrayList<Object> buildList(Object[] a) {
        return new ArrayList<>(Arrays.asList(a));
    }

    public ArrayList<Object> buildList(Collection<Object> c) { return new ArrayList<>(c); }

    public ArrayList<Object> buildList(Object[] a1, Object[] a2) {
        ArrayList<Object> ret = new ArrayList<>(Arrays.asList(a1));
        ret.addAll(Arrays.asList(a2));
        return ret;
    }

    public ArrayList<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        c1.addAll(c2);
        return new ArrayList<>(c1);
    }

}