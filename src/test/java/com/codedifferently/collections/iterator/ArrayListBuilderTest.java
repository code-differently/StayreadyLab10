package com.codedifferently.collections.iterator;

import java.util.Collection;
import java.util.HashSet;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListBuilderTest {
    ArrayListBuilder ab;

    @Before
    public void initialize(){
        ab = new ArrayListBuilder();
    }

    @Test
    public void buildListTest1(){
        
        Object[] arr = {"The", "Brown", "Fox"};
        int actual = ab.buildList(arr).size();
        int expected = arr.length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildTest2(){
        
        Collection<Object> names = new HashSet<Object>();
        names.add("Ari");
        names.add("Zeke");

        int actual = ab.buildList(names).size();
        int expected = names.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildTest3(){
        Object[] arr1 = {"The", "Brown", "Fox"};
        Object[] arr2 = {"Green", "Slow", "Turtle"};

        int actual = ab.buildList(arr1, arr2).size();
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildTest4(){
        Collection<Object> names1 = new HashSet<Object>();
        Collection<Object> names2 = new HashSet<Object>();

        names1.add("Ari");
        names1.add("Zeke");
        names2.add("Eliana");

        int actual = ab.buildList(names1, names2).size();
        int expected = names1.size() + names2.size();

        Assert.assertEquals(expected, actual);
    }
}