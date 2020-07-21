package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Collection;
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
        return null;
    }

    public List buildList(Object[] a1, Object[] a2) {
        return null;
    }

    public List buildList(Collection c1, Collection c2) {
        return null;
    }
}
