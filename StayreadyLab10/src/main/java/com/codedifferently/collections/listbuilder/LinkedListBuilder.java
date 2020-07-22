package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a) {
        List<Object> list = new LinkedList<Object>();
        for(Object word : a){
            list.add(word);
        }
        return list;
    }

    public List buildList(Collection c) {
        List<Object> list = new LinkedList<Object>();
        for(Object word : c){
            list.add(word);
        }
        return list;
    }

    public List<Object> buildList(Object[] a1, Object[] a2) {
        List<Object> list = new LinkedList<Object>();
        for(Object word : a1){
            list.add(word);
        }
        for(Object word : a2){
            list.add(word);
        }
        return list;
    }

    public List buildList(Collection c1, Collection c2) {
        List<Object> list = new LinkedList<Object>();
        for(Object word : c1){
            list.add(word);
        }
        for(Object word : c2){
            list.add(word);
        }
        return list;
    }
    
}