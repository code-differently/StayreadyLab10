package com.codedifferently;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.codedifferently.collections.listbuilder.ListBuilder;

public class ArrayListBuilder implements ListBuilder {

    

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
        list1.add(buildList(a2));
        
        return list1;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {
        
        List<Object> list = new ArrayList<Object>(c1);
        List<Object> list2 = new ArrayList<Object>(c2);
        list.add(list2);
        return list;
    }

    

    
}