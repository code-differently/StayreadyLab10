package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {
    
    public List<Object> buildList(Object[] a){
         
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(a));
        return list;
    }
    
    public List<Object> buildList(Collection<Object> c){

        ArrayList<Object> list = new ArrayList<Object>(c);
        return list;
    }

    public List<Object> buildList(Object[] a1, Object[] a2){

        ArrayList<Object> list1 = new ArrayList<Object>(buildList(a1));
        ArrayList<Object> list2 = new ArrayList<Object>(buildList(a2));
        ArrayList<Object> combined = new ArrayList<Object>();

        combined.addAll(list1);
        combined.addAll(list2);
        
        return combined;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2){
        
        ArrayList<Object> list1 = new ArrayList<Object>(c1);
        ArrayList<Object> list2 = new ArrayList<Object>(c2);
        list1.add(list2);

        return list1;
    }
}