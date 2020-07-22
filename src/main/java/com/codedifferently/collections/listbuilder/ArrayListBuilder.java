package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a) {
        List <Object> list = Arrays.asList(a);
        return list;
    }

    public List<Object> buildList(Collection<Object> c) {
        List<Object> list = new ArrayList<Object>(c);
        return list;
    }

    public List<Object> buildList(Object[] a1, Object[] a2) {
        List<Object> aList1 = Arrays.asList(a1);
        List<Object> aList2 = Arrays.asList(a2);
        List<Object> combinedList = new ArrayList<Object>();

        combinedList.addAll(aList1);
        combinedList.addAll(aList2);

        return combinedList;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        
        List<Object> aObject1 = new ArrayList<Object>(c1);
        aObject1.add(buildList(c2));
        return aObject1;
    }
}