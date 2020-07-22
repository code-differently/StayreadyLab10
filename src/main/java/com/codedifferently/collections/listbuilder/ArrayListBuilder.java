package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder{
    public List buildList(Object[] a) {
        return Arrays.asList(a);
    }

    public List buildList(Collection c) {
        return new ArrayList<>(c);
    }

    public List buildList(Object[] a1, Object[] a2) {
        List list1 = buildList(a1);
        List list2 = buildList(a2);
        List joinList = new ArrayList<>();
        joinList.addAll(list1);
        joinList.addAll(list2);
        return joinList;
    }

    public List buildList(Collection c1, Collection c2) {
        List list1 = buildList(c1);
        List list2 = buildList(c2);
        List joinList = new ArrayList<>();
        joinList.addAll(list1);
        joinList.addAll(list2);
        return joinList;
    }
}
