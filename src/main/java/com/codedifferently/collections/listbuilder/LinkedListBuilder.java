package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder {
    public static void main( String [] args){


    }


    public List buildList(Object[] a) {

        List list = Arrays.asList(a);

        return list;
    }

    public List buildList(Collection c) {

        List list = new LinkedList();
        list.addAll(c);

        return list;
    }

    public List buildList(Object[] a1, Object[] a2) {


        List list = new LinkedList();
        list.addAll(buildList(a1));
        list.addAll(buildList(a2));

        return list;
    }

    public List buildList(Collection c1, Collection c2) {

        List list = new LinkedList();
        list.addAll(buildList(c1));
        list.addAll(buildList(c2));

        return list;
    }
}
