package com.codedifferently.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;

import org.junit.Assert;
import org.junit.Before;
public class ArrayListBuilderTest 
{
    ArrayListBuilder aBuilder;
    @Before
    public void intialize()
    {
         aBuilder = new ArrayListBuilder();
    }

    @Test
    public void buildListArray()
    {
        String [] example = {"is","this","working"};

        List expected  = Arrays.asList(example);

        ArrayList actual = aBuilder.buildList(example);

        assertEquals(expected, actual);
    }

    @Test
    public void buildListCollections()
    {
        ArrayList expected = new ArrayList();
        expected.add("This");
        expected.add("is");
        expected.add("handy");

        

        ArrayList actual = aBuilder.buildList(expected);

        assertEquals(expected, actual);
    }

    @Test
    public void buildListArray2()
    {
        String [] example = {"is","this","working"};
        Integer [] example2 = {5,6,8};

        ArrayList expected = new ArrayList();
        Collections.addAll(expected, example);
        Collections.addAll(expected, example2);
        

        ArrayList actual = aBuilder.buildList(example,example2);

        assertEquals(expected, actual);
    }

    @Test
    public void buildListCollections2()
    {
        ArrayList example = new ArrayList();
        example.add("This");
        example.add("is");
        example.add("handy");

        ArrayList addOn = new ArrayList();
        addOn.add(4);
        addOn.add(12);
        addOn.add(20);

        ArrayList expected = new ArrayList();
        expected.addAll(example);
        expected.addAll(addOn);

        

        ArrayList actual = aBuilder.buildList(example,addOn);

        assertEquals(expected, actual);
    }
}