package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder {
    public List<Object> buildList(Object[] a) {
        List<Object> list = Arrays.asList(a);
        return list;
    }
    public List<Object> buildList(Collection<Object> c) {

        List<Object> list = new ArrayList<Object>(c);
        return list;
    }
    public List<Object> buildList(Object[] a1, Object[] a2) {
        List<Object> list1 = buildList(a1);
        List<Object> list2 = buildList(a2);
        List<Object> joinList = new ArrayList<Object>();
        joinList.addAll(list1);
        joinList.addAll(list2);


        return joinList;
    }
    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {

        List<Object> list = new ArrayList<Object>(c1);
        List<Object> list2 = new ArrayList<Object>(c2);
        List<Object> joinList = new ArrayList<Object>();

        joinList.addAll(list);
        joinList.addAll(list2);

        return joinList;
    }
}
