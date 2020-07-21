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

        //return new ArrayList<>(Arrays.asList(a));
    }

    public List buildList(Collection c) {
        List<Object> array = new ArrayList<Object>();

        //to use a for loop with a collection type you need to have
        //the collection type <interface> needs to become an object
        //thus, you use .toArray

        /*for (Object obj: c.toArray())
        {
            array.add(obj);
        }

<<<<<<< HEAD
        return array;

=======
        return array;*/

        //another way is to cast the collection type var into an
        //object and use the other already implemented method

        return buildList(c.toArray());
>>>>>>> 1c4cc5854255bd648fde31799b8c841ee93d709d
    }

    public List buildList(Object[] a1, Object[] a2) {
        List<Object> array = new ArrayList<Object>();

        for (Object obj: a1)
        {
            array.add(obj);
        }
        for (Object obj: a2)
        {
            array.add(obj);
        }

        return array;
    }

    public List buildList(Collection c1, Collection c2) {
        return buildList(c1.toArray(), c2.toArray());
    }
}
