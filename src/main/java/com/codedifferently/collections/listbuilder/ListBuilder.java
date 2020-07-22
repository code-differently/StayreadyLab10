package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.List;

public interface ListBuilder {

    public List buildList(Object[] a);

    public List buildList(Collection c);

    public List buildList(Object[] a1, Object[] a2);

    public List buildList(Collection c1, Collection c2);

}
