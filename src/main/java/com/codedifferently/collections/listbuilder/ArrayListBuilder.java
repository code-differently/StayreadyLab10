package com.codedifferently.collections.listbuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListBuilder implements ListBuilder 
{

    public ArrayListBuilder()
    {

    }
    public ArrayList buildList(Object[] a) 
    {
        ArrayList returnList  = new ArrayList();
        Collections.addAll(returnList, a);
        return returnList;
    }

    public ArrayList buildList(Collection c) 
    {
        ArrayList returnList  = new ArrayList(c);

        return returnList;
    }

    public ArrayList buildList(Object[] a1, Object[] a2) 
    {
        ArrayList returnList  = new ArrayList();
        Collections.addAll(returnList, a1);
        Collections.addAll(returnList, a2);
        return returnList;
    }

    public ArrayList buildList(Collection c1, Collection c2) 
    {
        ArrayList returnList  = new ArrayList(c1);
        returnList.addAll(c2);
        return returnList;
    }
}