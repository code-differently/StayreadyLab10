package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.List;

public interface ListBuilder {

    public List<Object> buildList(Object[] a);
    
    public List<Object> buildList(Collection<Object> c);

    public List<Object> buildList(Object[] a1, Object[] a2);  

    public List<Object> buildList(Collection<Object> c1, Collection<Object> c2);
}
