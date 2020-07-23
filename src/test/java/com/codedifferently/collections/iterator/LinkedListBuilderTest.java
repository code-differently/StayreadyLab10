package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilderTest {
    LinkedListBuilder linkBuilder;
    @Before
    public void setUp(){
        this.linkBuilder= new LinkedListBuilder();
    }
    @Test
    public void buildListTest(){
        LinkedList<Object> linkedL= new LinkedList<>();
        List<Object> list1= new  LinkedList();
        list1.add(1);
        list1.add("three");
        list1.add(false);
        //When
        Object[] arr = {1, "three", false};
        Object actual= linkBuilder.buildList(arr);

        Assert.assertEquals(list1,actual);


    }
    @Test
    public void buildListCollectionTest(){
        LinkedList<Object> linkedL= new LinkedList<>();
        List<Object> list1= new  LinkedList();
        list1.add(1);
        list1.add("three");
        list1.add(false);
        //When
        linkedL.add(1);
        linkedL.add("three");
        linkedL.add(false);
        Object actual= linkBuilder.buildList(linkedL);

        Assert.assertEquals(list1,actual);


    }
    @Test
    public void BuildListTwoArrays(){
        //Given
        List<Object> list = new LinkedList<>();
        list.add("Finding");
        list.add("Nemo");
        list.add(20);
        list.add("Brother");
        list.add("Bears");
        list.add(14);
        //When
        Object[] a1= {"Finding", "Nemo", 20};
        Object[] a2= {"Brother", "Bears", 14};
        Object actual = linkBuilder.buildList(a1,a2);
        //Then
        Assert.assertEquals(list, actual);

    }
    @Test
    public void buildListTwoCollections(){
        //Given
        List<Object> list = new LinkedList<>();
        list.add("Brother");
        list.add("Bears");
        list.add(14);
        list.add("Finding");
        list.add("Nemo");
        list.add(20);
        //Wheen
        Collection<Object> col1 = new ArrayList<>();
        Collection<Object> col2 = new ArrayList<>();

        col1.add("Brother");
        col1.add("Bears");
        col1.add(14);
        col2.add("Finding");
        col2.add("Nemo");
        col2.add(20);
        Object actual = linkBuilder.buildList(col1, col2);
        //Then
        Assert.assertEquals(list,actual);
    }

}
