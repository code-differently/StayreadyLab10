package com.codedifferently.collections.listbuilder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        return Arrays.asList(a);
    }
    public List buildList(Collection c) {
        ArrayList<Collection> l = new ArrayList<Collection>();
        l.addAll(c);
        return l;
    }
    public List buildList(Object[] a1, Object[] a2) {
        ArrayList l = new ArrayList(Arrays.asList(a1));
        l.addAll(Arrays.asList(a2));
        return l;
    }
    public List buildList(Collection c1, Collection c2) {
        ArrayList<Object> l = new ArrayList<Object>(c1);
        l.addAll(c2);
        return l;
    }
}
