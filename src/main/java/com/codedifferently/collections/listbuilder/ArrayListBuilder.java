package com.codedifferently.collections.listbuilder;

import com.codedifferently.collections.listbuilder.ListBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        ArrayList arrayList = new ArrayList(Arrays.asList(a));
        return arrayList;
    }

    public List buildList(Collection c) {
        ArrayList arrayList = new ArrayList(c);
        return arrayList;
    }

    public List buildList(Object[] a1, Object[] a2) {
        ArrayList arrayList = new ArrayList((Arrays.asList(a1)));
        arrayList.addAll(Arrays.asList(a2));
        return arrayList;
    }

    public List buildList(Collection c1, Collection c2) {
        ArrayList arrayList = new ArrayList(c1);
        arrayList.addAll(c2);
        return arrayList;
    }
}
