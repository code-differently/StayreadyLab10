package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListBuilderTest {

    @Test
    public void buildListTest(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        Object[] a = {1, 2, 3, 4};
        //When
        List actual = alb.buildList(a);
        ArrayList<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void buildListTest2(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);
        //When
        List actual = alb.buildList(col);
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void buildListTest3(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        Object[] a1 = {1,2,3,4};
        Object[] a2 = {5,6,7,8};
        //When
        List actual = alb.buildList(a1, a2);
        ArrayList<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTest4(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);
        List col2 = new Vector();
        col2.add(3);
        col2.add(4);
        //When
        List actual = alb.buildList(col, col2);
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        //Then
        Assert.assertEquals(expected,actual);
    }

}
