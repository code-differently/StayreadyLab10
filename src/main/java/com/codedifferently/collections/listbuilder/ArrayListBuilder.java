package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {

    public List buildList(Object[] a) {
        List<Object> newList = Arrays.asList(a);
        return newList;
    }

    public List buildList(Collection c) {
        ArrayList<Collection> newList = new ArrayList<>(c);
        return newList;
    }

    public List buildList(Object[] a1, Object[] a2) {
        return null;
    }

    public List buildList(Collection c1, Collection c2) {
        return null;
    }

}
