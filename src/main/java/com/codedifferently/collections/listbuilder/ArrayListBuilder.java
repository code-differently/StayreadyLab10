package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder{


    public List buildList(Object[] a) {
        ArrayList<Object> my_lst = new ArrayList<Object>();
        for (Object objects : a) {
            my_lst.add(objects);
        }
        return my_lst;
    }

    public List buildList(Collection c) {
        ArrayList<Collection> lst = new ArrayList<Collection>();
        for (Object collections : c) {
            lst.add(c);
        }
        return lst;
    }

    public List buildList(Object[] a1, Object[] a2) {
        ArrayList<Object> lst = new ArrayList<Object>();
        for (Object objects : a1){
            lst.add(objects);
        }
        for (Object theObjects : a2){
            lst.add(theObjects);
        }
        return lst;
    }

    public List buildList(Collection c1, Collection c2) {
        ArrayList<Collection> lst = new ArrayList<Collection>();
        lst.addAll(c1);
        lst.addAll(c2);
        return lst;
    }
}
