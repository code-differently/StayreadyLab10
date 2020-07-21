package com.codedifferently.collections.listbuilder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedListBuilderTest {
    LinkedListBuilder test;
    Integer[] data = {10, 12, 14, 16, 18, 20};

    @Before
    public void intialize(){

        test = new LinkedListBuilder();
    }
    @Test
    public void buildList() {
        //given
        List<Integer> given = test.buildList(data);

        List<Integer> expected = new LinkedList<>();
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
        Collection<Integer> c = new LinkedList<Integer>();
        List<Integer> expected = new LinkedList<>();
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        c.add(10);
        c.add(12);
        c.add(14);
        c.add(16);
        c.add(18);
        c.add(20);
        Assert.assertEquals(expected, test.buildList(c));

    }

    @Test
    public void testBuildList1() {
        List<Integer> given = test.buildList(data, data);

        List<Integer> expected = new LinkedList<>();
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);

        Assert.assertEquals(given, expected);

    }

    @Test
    public void testBuildList2() {
        Collection<Integer> c = new LinkedList<Integer>();
        Collection<Integer> c2 = new LinkedList<Integer>();
        List<Integer> expected = new LinkedList<>();
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        c.add(10);
        c.add(12);
        c.add(14);
        c2.add(16);
        c2.add(18);
        c2.add(20);
        Assert.assertEquals(expected, test.buildList(c,c2));
    }
}