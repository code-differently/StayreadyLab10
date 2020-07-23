package com.codedifferently.collections.listbuilder;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListBuilder implements ListBuilder {


    public List buildList(Object[] a) {
        List<Object> list= new ArrayList(Arrays.asList(a));
        return list;
    }

    public List buildList(Collection c) {
        List<Object> list = new ArrayList<Object>(c);
        return list;
    }

    public List buildList(Object[] a1, Object[] a2) {
        List<Object> list1= new ArrayList(Arrays.asList(a1));
        List<Object> list2= new ArrayList(Arrays.asList(a2));
        list1.addAll(list2);
        return list1;
    }

    public List buildList(Collection c1, Collection c2) {
        List<Object> list1= new ArrayList(c1);
        List<Object> list2=new ArrayList(c2);
        list1.addAll(list2);
        return list1;
    }
}
