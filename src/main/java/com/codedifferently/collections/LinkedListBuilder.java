package com.codedifferently.collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import com.codedifferently.collections.listbuilder.ListBuilder;

public class LinkedListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a) {
        LinkedList<Object> linkedList = new LinkedList<Object>(Arrays.asList(a));

        return linkedList;
    }

    public List<Object> buildList(Collection<Object> c) {

        LinkedList<Object> linkedList = new LinkedList<Object>(c);
        return linkedList;
    }

    public List<Object> buildList(Object[] a1, Object[] a2) {

        // TODO Auto-generated method stub
        LinkedList<Object> linkedList = new LinkedList<Object>(buildList(a1));
        LinkedList<Object> linkedList2 = new LinkedList<Object>(buildList(a2));
        LinkedList<Object> newLinkedList = new LinkedList<Object>();
        newLinkedList.addAll(linkedList);
        newLinkedList.addAll(linkedList2);
        return newLinkedList;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) {

        // TODO Auto-generated method stub
        LinkedList<Object> linkedList = new LinkedList<Object>(c1);
        LinkedList<Object> linkedList2 = new LinkedList<Object>(c2);
        LinkedList<Object> newLinkedList = new LinkedList<Object>();
        newLinkedList.addAll(linkedList);
        newLinkedList.addAll(linkedList2);

        return newLinkedList;
    }
    
}