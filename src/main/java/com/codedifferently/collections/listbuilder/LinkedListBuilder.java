package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        List<Object> linkList = new LinkedList<Object>(Arrays.asList(a));
        return linkList;
    }
    public List buildList(Collection c) {
        List<Collection> linkList = new LinkedList<Collection>();
        linkList.addAll(c);
        return linkList;
    }
    public List buildList(Object[] a1, Object[] a2) {
        List<Object> linkList = new LinkedList<Object>();
        linkList.addAll(Arrays.asList(a1));
        linkList.addAll(Arrays.asList(a2));
        return linkList;
    }
    public List buildList(Collection c1, Collection c2) {
        List<Collection> linkList = new LinkedList<Collection>();
        linkList.addAll(c1);
        linkList.addAll(c2);
        return linkList;
    }
}