package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListBuilderTest {

    ArrayListBuilder ab;
    @Before
    public void setUp(){
        this.ab= new ArrayListBuilder();
    }
    @Test
    public void buildListTest(){
        //Given
        List<Object> list= new ArrayList<Object>();
        list.add("May");
        list.add(26);
        list.add(67);
        //When
        Object[] ar={"May", 26, 67};
        Object actual = ab.buildList(ar);
        //Then
        Assert.assertEquals(list,actual);

    }
    @Test
    public void BuildListCollection() {
        //Given
        List<Object> list= new ArrayList<>();
        list.add(1);
        list.add("for");
        list.add(25);
        //When
        Collection<Object> col= new ArrayList<Object>();
        col.add(1);
        col.add("for");
        col.add(25);
        //Then
        Assert.assertEquals(list, col);

    }
    @Test
    public void BuildListTwoArrays(){
        //Given
        List<Object> list = new ArrayList<>();
        list.add("Finding");
        list.add("Nemo");
        list.add(20);
        list.add("Brother");
        list.add("Bears");
        list.add(14);
        //When
        Object[] a1= {"Finding", "Nemo", 20};
        Object[] a2= {"Brother", "Bears", 14};
        Object actual = ab.buildList(a1, a2);
        //Then
        Assert.assertEquals(list, actual);

    }
    @Test
    public void buildListTwoCollections(){
        //Given
        List<Object> list = new ArrayList<>();
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
        Object actual = ab.buildList(col1, col2);
        //Then
        Assert.assertEquals(list,actual);
    }
}
