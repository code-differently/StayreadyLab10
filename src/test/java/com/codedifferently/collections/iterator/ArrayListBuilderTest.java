package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListBuilderTest {

    @Test
    public void buildListWithObjectTest(){
        // Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        // When
        Integer[] myArr = {100, 1000, 10000, 100000};
        // Then
        Assert.assertEquals(myArr.length, arrayListBuilder.buildList(myArr).size());
    }

    @Test
    public void buildListWithCollectionsTest(){
        // Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        // When
        String [] characters = {"All for One", "Kacchan", "Todoroki", "Rigby"};
        // Then
        Assert.assertEquals(characters.length, arrayListBuilder.buildList(characters).size());
    }

    @Test
    public void buildListWithTwoObArrays(){
        // Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        // When
        Integer [] nums = {405, 99, 404, 403};
        String [] characters = {"Gon", "Killua", "Kurapika", "Leorio"};
        long expected = 8;
        // Then
        Assert.assertEquals(expected, arrayListBuilder.buildList(nums, characters).size());
    }

    @Test
    public void buildListWithCollections(){
        // Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();
        // When
        Integer [] pokemonEvs = {555, 530, 600};
        String [] pokemon = {"Arcanine", "Blastoise", "Celebi"};
        long expected = 6;
        // Given
        Assert.assertEquals(expected, arrayListBuilder.buildList(pokemon, pokemonEvs).size());
    }
}
