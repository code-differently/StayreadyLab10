package com.codedifferently.collections.iterator;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.junit.Assert;

import com.codedifferently.ArrayListBuilder;
public class albTest {
    
    @Test
    public void buildListTest1()
    { 
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        Object [] arr= {3,4,5};
        //When 
        List <Object> list = arrayListBuilder.buildList(arr);
        Integer expected = arr.length; 
        Integer actual = list.size();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTest2()
    {
        //Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        Object [] arr= {3,4,5};
        Object [] arr1 = {6,7,8};
        //When
        List<Object> list = arrayListBuilder.buildList(arr, arr1);
        Integer expected = arr.length + arr1.length;
        Integer actual = list.size();
        //Then 
        Assert.assertEquals(expected, actual);

    }

    @Test 
    public void buildListTest3()
    {
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        Collection<Object> collections = new HashSet<Object>();
        collections.add("Ari Lennox");
        collections.add("Baby Rose");
        //When
        List <Object> list = arrayListBuilder.buildList(collections);
        Integer actual = list.size();
        Integer expected = collections.size();
        //Then
        Assert.assertEquals(expected, actual); 
    }

    @Test
    public void buildListTest4()
    {
        //Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        Collection<Object> collection = new HashSet<Object>();
        collection.add("Ari Lennox");
        collection.add("Baby Rose");
        Collection<Object> songs = new HashSet<Object>();
        songs.add("Pedigree");
        songs.add("Over");
        //When
        List <Object> list = arrayListBuilder.buildList(collection, songs);
        Integer actual = list.size();
        Integer expected = collection.size() + songs.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}