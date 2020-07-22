package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class ArrayListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a) {
        ArrayList<Object> arrList = new ArrayList<Object>(Arrays.asList(a));
        return arrList;
    }

    public List<Object> buildList(Collection<Object> c) {
        ArrayList<Object> arrList = new ArrayList<Object>(c);
        return arrList;
    }

    public List<Object> buildList(Object[] a1, Object[] a2) {
        ArrayList<Object> a1List = new ArrayList<Object>(Arrays.asList(a1));
        a1List.addAll(Arrays.asList(a2));
        return a1List;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        ArrayList<Object> c1List = new ArrayList<Object>(c1);
        c1List.addAll(c2);
        return c1List;   
    }
    
}