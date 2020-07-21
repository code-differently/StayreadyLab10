package com.codedifferently.collections.listbuilder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListBuilderTest {

    ArrayListBuilder test = new ArrayListBuilder();
    @Test
    public void buildList() {
        //given
        Integer[] data = {10, 12, 14, 16, 18, 20};
        List<Integer> given = test.buildList(data);

        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);

        Assert.assertEquals(given, expected);
    }

    @Test
    public void testBuildList() {
    }

    @Test
    public void testBuildList1() {
    }

    @Test
    public void testBuildList2() {
    }
}