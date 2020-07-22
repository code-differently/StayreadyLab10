package com.codedifferently.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.codedifferently.collections.listbuilder.ListBuilder;

public class ArrayListBuilder implements ListBuilder{

    public ArrayList<Object> buildList(Object[] a) {
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(a));
        return list;
    }

    public ArrayList<Object> buildList(Collection<Object> c) {
        ArrayList<Object> list = new ArrayList<Object>(c);
        return list;
    }

    public ArrayList<Object> buildList(Object[] a1, Object[] a2) {
        ArrayList<Object> list1 = new ArrayList<Object>(Arrays.asList(a1));
        //List<Object> list2 = Arrays.asList(a2);
        list1.addAll(Arrays.asList(a2));
        //list1.add(a2);
        return list1;
    }

    public ArrayList<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        ArrayList<Object> list1 = new ArrayList<Object>(c1);
        list1.addAll(c2);
        return list1;

    }
    
}