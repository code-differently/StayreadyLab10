package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.List;


import com.codedifferently.collections.listbuilder.ArrayListBuilder;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListBuilderTest {
    
    @Test
    public void buildListArray(){
        //Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        //When 
        Integer[] i = {11, 12, 13, 14, 15};
        //Then 
        Assert.assertEquals(i.length, arrayListBuilder.buildList(i).size());
    }

    @Test
    public void buildListTwoArrays(){
        //Given 
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        //When 
        Integer[] i = {1, 2, 3, 4, 5};
        Integer[] ii = {6, 7, 8, 9, 10};
        //Then 
        Assert.assertEquals(i.length + ii.length, arrayListBuilder.buildList(i, ii).size());
    }

    @Test
    public void buildListCollection(){
        //Given 
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        List<Object> arrList = new ArrayList<Object>();
        //When
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        //Then 
        Assert.assertEquals(arrList.size(), arrayListBuilder.buildList(arrList).size());
        

    }

    @Test
    public void buildListTwoCollections(){
         //Given 
         ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
         List<Object> arrList = new ArrayList<Object>();
         List<Object> arrList1 = new ArrayList<Object>();
         //When
         arrList.add(3);
         arrList.add(4);
         arrList.add(5);

         arrList1.add(6);
         arrList1.add(7);
         arrList1.add(8);
         //Then 
         Assert.assertEquals(arrList.size() + arrList1.size(), arrayListBuilder.buildList(arrList, arrList1).size());
         
    }
}