package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListBuilderTest{

    ArrayListBuilder arrayListBuild;


    @Before
    public void initialize(){
        arrayListBuild = new ArrayListBuilder();
    }

    @Test
    public void buildListTest1(){
        //Given 
        Object[] testArray = {"Long", "John", "Silver"};

        //When
        int expected = testArray.length;
        int actual = arrayListBuild.buildList(testArray).size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest2(){

        Collection<Object> names = new HashSet<Object>();

        names.add("JoJo");
        names.add("Star");
        int actual = arrayListBuild.buildList(names).size();
        int expected = names.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest3(){

        Object[] testArray1 = {"Maybe", "its", "Mayballine"};
        Object[] testArray2 = {"Hello", "Hi", "Bonjour"};

        int actual =  arrayListBuild.buildList(testArray1, testArray2).size();
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest4(){

        Collection<Object> set1 = new HashSet<Object>();
        Collection<Object> set2 = new HashSet<Object>();

        set1.add("Junit");
        set1.add("Test");
        set2.add("Work");

        int actual = arrayListBuild.buildList(set1, set2).size();
        int expected = set1.size() + set2.size();

        Assert.assertEquals(expected, actual);
    }
}