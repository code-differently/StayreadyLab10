# Collections

## Listbuilder

**The Interface**

Create a ListBuilder interface with the following methods:

1. `List buildList(Object[] a);`
2. `List buildList(Collection c);`
3. `List buildList(Object[] a1, Object[] a2);`
4. `List buildList(Collection c1, Collection c2);`

**The Methods**

1. Accepts an instance of an Object array as a parameter, returns a List instance
2. Accepts an instance of a Collection as a parameter, returns a List instance
3. Accepts two Object[] arrays, combines them and returns a List instance
4. Accepts two Collection objects, combines them and returns a List

**The Classes**

Implement the interface and its method with the following classes:

- `ArrayListBuilder` -- Creates an ArrayList from the given arrays/collections
- `LinkedListBuilder` -- Creates a LinkedList from the given arrays/collections

## Iterator

Create an `Iterator` that produces the Fibonacci series; call it `FibonacciIterator`. The `hasNext()` method should always return true because the Fibonacci series is an infinite set.

## Remember

Write your test!

