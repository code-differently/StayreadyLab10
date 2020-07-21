package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        List<Object> array = new ArrayList<Object>();

        for (Object obj: a)
        {
            array.add(obj);
        }

        return array;
    }

    public List buildList(Collection c) {
        List<Object> array = new ArrayList<Object>();

        //to use a for loop with a collection type you need to have
        //the collection type <interface> needs to become an object
        //thus, you use .toArray

        for (Object obj: c.toArray())
        {
            array.add(obj);
        }

        return array;
    }

    public List buildList(Object[] a1, Object[] a2) {
        return null;
    }

    public List buildList(Collection c1, Collection c2) {
        return null;
    }
}
