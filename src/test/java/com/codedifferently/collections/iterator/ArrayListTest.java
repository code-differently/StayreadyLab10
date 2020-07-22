package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTest {

    ArrayListBuilder anArrayBuilder;
    @Before
    public void setup() {
        this.anArrayBuilder = new ArrayListBuilder();
    }

    @Test
    public void buildListArray(){
        // Given
        ArrayList<Object> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("Hi");

        // When
        Object[] objectArray = {1,2,3,4,"Hi"};

        // Then
        Assert.assertEquals(list,anArrayBuilder.buildList(objectArray));
    }

    @Test
    public void buildListCollectionTest(){
        // Given
        ArrayList<Object> list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        // When
        Collection<Object> collection = new ArrayList();
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);

        // Then
        Assert.assertEquals(list,anArrayBuilder.buildList(collection));
    }


    @Test
    public void buildListCombineArrayTest(){
        // Given
        ArrayList<Object> list = new ArrayList();
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add("Multiply");

        ArrayList<Object> list2 = new ArrayList();
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        list2.add("Divide");

        list.addAll(list2);

        // When
        ArrayListBuilder anArrayList = new ArrayListBuilder();
        Object[] objectArray = {9,10,11,12, "Multiply"};
        Object[] objectArray2 = {13,14,15,16,"Divide"};

        // Then
        Assert.assertEquals(list, anArrayList.buildList(objectArray,objectArray2));
    }

    @Test
    public void buildListCombineCollection() {
        // Given
        // Given
        ArrayList<Object> list = new ArrayList();
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add("Multiply");

        ArrayList<Object> list2 = new ArrayList();
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        list2.add("Divide");

        list.addAll(list2);

        // When
        Collection <Object> collection = new ArrayList();
        collection.add(9);
        collection.add(10);
        collection.add(11);
        collection.add(12);
        collection.add("Multiply");

        Collection <Object> collection2 = new ArrayList();
        collection2.add(13);
        collection2.add(14);
        collection2.add(15);
        collection2.add(16);
        collection2.add("Divide");

        // Then
        Assert.assertEquals(list, anArrayBuilder.buildList(collection,collection2));
    }
}
