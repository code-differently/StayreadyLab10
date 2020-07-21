package com.codedifferently.collections;

import java.util.LinkedList;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
public class LinkedListBuilderTest 
{
    LinkedListBuilder lBuilder;
    @Before
    public void initialize()
    {
        lBuilder = new LinkedListBuilder();
    }

    @Test
    public void buildListArray()
    {
        String [] example = {"is","this","working"};

        List expected  = Arrays.asList(example);

       
        LinkedList actual = lBuilder.buildList(example);

        assertTrue("Is true", expected.equals(actual));
    }

    @Test
    public void buildListCollections()
    {

        LinkedList expected = new LinkedList();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        LinkedList actual = lBuilder.buildList(expected);

        assertTrue("Is true", expected.equals(actual));
    }

    @Test
    public void buildListArray2()
    {
        String [] example = {"is","this","working"};
        Integer [] example2 = {7,7,7};

        LinkedList expected = new LinkedList();
        Collections.addAll(expected, example);
        Collections.addAll(expected, example2);
        
        LinkedList actual = lBuilder.buildList(example,example2);

        assertTrue("Is true", expected.equals(actual));
    }

    @Test
    public void buildListCollections2()
    {

        LinkedList example1 = new LinkedList();
        example1.add(1);
        example1.add(2);
        example1.add(3);

        LinkedList example2 = new LinkedList();
        example2.add(4);
        example2.add(5);
        example2.add(6);
        

        LinkedList expected = new LinkedList();
        expected.addAll(example1);
        expected.addAll(example2);

        LinkedList actual = lBuilder.buildList(example1,example2);

        assertTrue("Is true", expected.equals(actual));
    }
}