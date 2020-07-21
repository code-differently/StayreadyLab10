package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.List;

public interface ListBuilder {

    List buildList(Object[] a);
    List buildList(Collection c);
    List buildList(Object[] a1, Object[] a2);
    List buildList(Collection c1, Collection c2);

}
