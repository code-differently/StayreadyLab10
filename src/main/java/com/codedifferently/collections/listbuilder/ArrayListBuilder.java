package com.codedifferently.collections.listbuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder 
{   
    //List <Object> arrList = new ArrayList<Object>();

    public List<Object> buildList(Object[] a)
    {
        return Arrays.asList(a);
    }

    public List<Object> buildList(Collection<Object> c)
    {
        return new ArrayList<Object>(c);
    }

    public List<Object> buildList(Object[] a1, Object[] a2) 
    {   
        ArrayList <Object> result = new ArrayList <Object> ();;
        result.addAll(buildList(a1));
        result.addAll(buildList(a2));
        return result;
    }

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2) 
    {
        ArrayList <Object> result = new ArrayList <Object> ();
        result.addAll(buildList(c1));
        result.addAll(buildList(c2));
        return result;
    }
    
}