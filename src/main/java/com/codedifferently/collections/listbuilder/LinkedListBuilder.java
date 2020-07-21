package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a)
    {
        return new LinkedList <Object> (Arrays.asList(a));
    }

    public List<Object> buildList(Collection<Object> c)
    {
        return new LinkedList <Object> (Arrays.asList(c));    }

    public List<Object> buildList(Object[] a1, Object[] a2) 
    {   
        LinkedList <Object> result = new LinkedList <Object> ();
        result.addAll(buildList(a1));
        result.addAll(buildList(a2));
        return result;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) 
    {
        List <Object> result = new LinkedList<Object>();
        result.addAll(buildList(c2));
        result.addAll(buildList(c2));
        return result;
    }
    
    
}