package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import com.codedifferently.collections.listbuilder.ListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBuilderTest {
    ListBuilder builder;

    @Before
    public void setUp() {
        builder = new ArrayListBuilder();
    }

    @Test
    public void copyOverElementsAndTurnIntoList() {
        int expectedSize = 2;

        Integer[] arr1 = {2};
        Integer[] arr2 = {3};
        List resultingList = builder.copyOverElementsAndTurnIntoList(arr1, arr2);
        int actualSize = resultingList.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void combineTwoCollectionsFirstPartTest() {
        int expectedSize = 2;
        ArrayList<Integer> collection1 = new ArrayList<Integer>();
        ArrayList<Integer> collection2 = new ArrayList<Integer>();
        collection1.add(7);
        collection2.add(98);

        List resultingList = builder.combineTwoCollectionsFirstPart(collection1, collection2);
        int actualSize = resultingList.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
