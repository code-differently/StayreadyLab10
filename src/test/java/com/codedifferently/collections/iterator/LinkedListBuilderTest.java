package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilderTest {

    LinkedListBuilder llb;

    @Before
    public void setup(){
        llb = new LinkedListBuilder();

    }

    @Test
    public void buildListV1Test(){
        // Given
        Object[] testArr1= {1,2,3};

        // When
        List<Object> expected = new LinkedList<>(Arrays.asList(testArr1));
        List<Object> actual = llb.buildList(testArr1);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListV2Test(){
        // Given
        Object[] testArr1= {1,2,3};
        List<Object> testList1 = new ArrayList<>(Arrays.asList(testArr1));
        List<Object> expected = new ArrayList<>(Arrays.asList(testArr1));

        // When
        List<Object> actual = llb.buildList(testList1);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListV3Test(){
        // Given
        Object[] testArr1= {1,2,3};
        Object[] testArr2 = {4,5,6};
        Object[] combined = {1, 2, 3, 4, 5, 6};

        // When
        List<Object> expected = Arrays.asList(combined);
        List<Object> actual = llb.buildList(testArr1, testArr2);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListV4Test(){
        // Given
        Object[] testArr1= {1,2,3};
        Object[] testArr2 = {4,5,6};
        Object[] combined = {1, 2, 3, 4, 5, 6};
        List<Object> testList1 = new LinkedList<>(Arrays.asList(testArr1));
        List<Object> testList2 = new LinkedList<>(Arrays.asList(testArr2));
        List<Object> expected = new LinkedList<>(Arrays.asList(combined));

        // When
        List<Object> actual = llb.buildList(testList1, testList2);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
