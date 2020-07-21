package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder
{

    public List buildList(Object[] a)
    {
        ArrayList arrList = new ArrayList(Arrays.asList(a));

        return arrList;
    }

    public List buildList(Collection c)
    {
        ArrayList arrList = new ArrayList(c);

        return arrList;
    }

    public List buildList(Object[] a1, Object[] a2)
    {
        ArrayList a1List = new ArrayList(Arrays.asList(a1));

        a1List.addAll(Arrays.asList(a2));

        return a1List;
    }

    public List buildList(Collection c1, Collection c2)
    {
        ArrayList c1List = new ArrayList(c1);

        c1List.addAll(c2);

        return c1List;
    }


}
