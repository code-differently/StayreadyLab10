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
        Object[] combinedArr = new Object[a1.length + a2.length];
        List combinedList = copyOverElementsAndTurnIntoList(combinedArr, a1, a2);
        ArrayList<Object> combinedArrayList = new ArrayList<Object>(combinedList);
        return combinedArrayList;
    }

    private List copyOverElementsAndTurnIntoList(Object[] combinedArr, Object[] a1, Object[] a2) {
        int overallIndex = 0;
        for(Object a1Element: a1) {
            combinedArr[overallIndex] = a1Element;
            overallIndex++;
        }
        for(Object a2Element: a2) {
            combinedArr[overallIndex] = a2Element;
            overallIndex++;
        }
        List combinedList = Arrays.asList(combinedArr);
        return combinedList;
    }

    public List buildList(Collection c1, Collection c2) {
        List<Collection> nonArrList = buildList(c1);
        nonArrList.addAll(c2);

        ArrayList <Collection> combinedArrayList = new ArrayList<Collection>(nonArrList);
        return combinedArrayList;
    }

}
