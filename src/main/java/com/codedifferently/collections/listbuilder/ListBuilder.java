package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.List;

public interface ListBuilder {

  public List buildList(Object[] a); 

  public List buildList(Collection c); 

  public List buildList(Object[] a, Object[] ab); 

  public List buildList(Collection c, Collection c2); 


}
