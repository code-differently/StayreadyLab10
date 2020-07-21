package com.codedifferently.collections.listbuilder;

import java.util.*;

public class ArrayListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        ArrayList<Object> arrList = new ArrayList<Object>(Arrays.asList(a));
        return arrList;
    }

    public List buildList(Collection c) {
        ArrayList<Collection> arrList = new ArrayList<Collection>(c);
        return arrList;
    }

    public List buildList(Object[] a1, Object[] a2) {
        ArrayList<Object> arrList = new ArrayList<Object>(Arrays.asList(a1));
        Collections.addAll(arrList, a2);
        return arrList;
    }

    public List buildList(Collection c1, Collection c2) {
        ArrayList<Collection> arrList = new ArrayList<Collection>(c1);
        Collections.addAll(arrList, c2);
        return arrList;
    }
}
