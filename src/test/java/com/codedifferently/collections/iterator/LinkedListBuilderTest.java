package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Test;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LinkedListBuilderTest {
    LinkedListBuilder lb = new LinkedListBuilder();
    Object[] arr1 = {};
    Object[] arr2 = {};
    Collection<Collection> col1 = Collections.emptyList();
    Collection<Collection> col2 = Collections.emptyList();

    @Test
    public void buildListTest() {
        Assert.assertTrue(lb.buildList(arr1) instanceof List);
    }

    @Test
    public void buildListTest2() {
        Assert.assertTrue(lb.buildList(col1) instanceof List);
    }

    @Test
    public void buildListTest3() {
        Assert.assertTrue(lb.buildList(arr1, arr2) instanceof List);
    }

    @Test
    public void buildListTest4() {
        Assert.assertTrue(lb.buildList(col1, col2) instanceof List);
    }
}
