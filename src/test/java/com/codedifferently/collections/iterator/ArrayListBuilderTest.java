package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListBuilderTest {

    ArrayListBuilder alb;

    @Before
    public void setup(){
        alb = new ArrayListBuilder();

    }

    @Test
    public void buildListV1Test(){
        // Given
        Object[] testArr1= {1,2,3};
        // When
        List<Object> expected = Arrays.asList(testArr1);
        List<Object> actual = alb.buildList(testArr1);

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
        List<Object> actual = alb.buildList(testList1);

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
        List<Object> actual = alb.buildList(testArr1, testArr2);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListV4Test(){
        // Given
        Object[] testArr1= {1,2,3};
        Object[] testArr2 = {4,5,6};
        Object[] combined = {1, 2, 3, 4, 5, 6};
        List<Object> testList1 = new ArrayList<>(Arrays.asList(testArr1));
        List<Object> testList2 = new ArrayList<>(Arrays.asList(testArr2));
        List<Object> expected = new ArrayList<>(Arrays.asList(combined));

        // When
        List<Object> actual = alb.buildList(testList1, testList2);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
