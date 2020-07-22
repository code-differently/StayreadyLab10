package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.List;

public interface ListBuilder {

    List <Object> buildList(Object[] a);

    List <Object> buildList(Collection<Object> c);

    List <Object> buildList(Object[] a1, Object[] a2);

    List <Object> buildList(Collection<Object> c1, Collection<Object> c2);

}
