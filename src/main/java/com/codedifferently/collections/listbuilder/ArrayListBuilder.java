package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {

    public List buildList(Object[] a) {
        List listVersion = Arrays.asList(a);
        ArrayList<Object> arrayListVersion = new ArrayList<Object>(listVersion);
        return arrayListVersion;
    }

    public List buildList(Collection c) {
        ArrayList<Collection> collectionList = new ArrayList<Collection>(c);
        return collectionList;
    }

    public List buildList(Object[] a1, Object[] a2) {
        List combinedList = copyOverElementsAndTurnIntoList(a1, a2);
        ArrayList<Object> combinedArrayList = new ArrayList<Object>(combinedList);
        return combinedArrayList;
    }

    public List buildList(Collection c1, Collection c2) {
        List list = combineTwoCollectionsFirstPart(c1, c2);

        ArrayList <Collection> combinedArrayList = new ArrayList<Collection>(list);
        return combinedArrayList;
    }

}
