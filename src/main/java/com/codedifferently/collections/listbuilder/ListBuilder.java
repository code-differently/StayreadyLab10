package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public interface ListBuilder {
    List buildList(Object[] a);
    List buildList(Collection c);
    List buildList(Object[] a1, Object[] a2);
    List buildList(Collection c1, Collection c2);

    default List copyOverElementsAndTurnIntoList(Object[] a1, Object[] a2) {
        Object[] combinedArr = new Object[a1.length + a2.length];
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

    default List combineTwoCollectionsFirstPart(Collection c1, Collection c2) {
        List<Collection> list = buildList(c1);
        list.addAll(c2);

        return list;
    }
}
