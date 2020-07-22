package com.codedifferently.collections.listbuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder {

    public List buildList(Object[] a) {
        List listVersion = Arrays.asList(a);
        LinkedList<Object> linkedListVersion = new LinkedList<Object>(listVersion);
        return linkedListVersion;
    }

    public List buildList(Collection c) {
        LinkedList<Collection> collectionList = new LinkedList<Collection>(c);
        return collectionList;
    }

    public List buildList(Object[] a1, Object[] a2) {
        List combinedList = copyOverElementsAndTurnIntoList(a1, a2);
        LinkedList<Object> combinedLinkedList = new LinkedList<Object>(combinedList);
        return combinedLinkedList;
    }

    public List buildList(Collection c1, Collection c2) {
        List list = combineTwoCollectionsFirstPart(c1, c2);

        LinkedList <Collection> combinedLinkedList = new LinkedList<Collection>(list);
        return combinedLinkedList;
    }

}
