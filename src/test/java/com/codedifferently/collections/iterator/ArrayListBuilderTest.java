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
        ArrayListBuilder tester = new ArrayListBuilder();
        Object[] test = {1, 2, 3, 4};
        //When
        List actual = tester.buildList(test);
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
        ArrayListBuilder tester = new ArrayListBuilder();
        List test = new Vector();
        test.add(1);
        test.add(2);
        //When
        List actual = tester.buildList(test);
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void buildListTest3(){
        //Given
        ArrayListBuilder tester = new ArrayListBuilder();
        Object[] test1 = {1,2,3,4};
        Object[] test2 = {5,6,7,8};
        //When
        List actual = tester.buildList(test1, test2);
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
        ArrayListBuilder tester = new ArrayListBuilder();
        List test1 = new Vector();
        test1.add(1);
        test1.add(2);
        List test2 = new Vector();
        test2.add(3);
        test2.add(4);
        //When
        List actual = tester.buildList(test1, test2);
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        //Then
        Assert.assertEquals(expected,actual);
    }

}
