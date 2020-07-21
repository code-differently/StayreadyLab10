package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder 
{
    public LinkedListBuilder()
    {

    }

    public LinkedList buildList(Object[] a) 
    {
        LinkedList ll = new LinkedList();
        Collections.addAll(ll, a);
        return ll;
    }

    public LinkedList buildList(Collection c) 
    {
        LinkedList ll  = new LinkedList(c);

        return ll;
    }

    public LinkedList buildList(Object[] a1, Object[] a2) 
    {
        LinkedList ll  = new LinkedList();
        Collections.addAll(ll, a1);
        Collections.addAll(ll, a2);
        return ll;
    }

    public LinkedList buildList(Collection c1, Collection c2) 
    {
        LinkedList ll  = new LinkedList(c1);
        ll.addAll(c2);
        return ll;
    }
    
}