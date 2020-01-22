package com.article.assesment;

import java.util.HashSet;
import java.util.TreeSet;

public class Start {


    public static void main(String[] args) {

        /*
         *  Date 21 jan 2020
         * source : https://howtodoinjava.com/interview-questions/useful-java-collection-interview-questions/
         *
        *  Can a null element added to the treeset  or hashset
        *  Hashset internally uses hashmap. There is no null check in add () method . And hashmap allows one null key so the hasset.
        *
        * In case of treeset , it uses navigablemap for storing the elements. Navigablemap is subtype of sortedmap which does not
        * allow null keys. so essentially  tree set also does not support null keys.
        * */


        HashSet hashSet= new HashSet();
        hashSet.add(null);

        TreeSet treeSet= new TreeSet();
        treeSet.add(null);  // NPE  Treeset does not allow null values.


        /*
        * Why we use Map interface? What are main classes implementing Map interface?
        *
        * Map interface is a special type of collection which is used to store key-value pairs.
        * It does not extend Collection interface for this reason. This interface provides methods to add, remove,
        *  search or iterate over various views of Map.
        *
        * Main classes implementing Map interface are: HashMap, Hashtable, EnumMap, IdentityHashMap, LinkedHashMap and Properties.
        *  */



        /*
        * Difference between IdentityHashMap, WeakHashMap and EnumMap in Java
        * (Ref : https://www.java67.com/2016/09/difference-between-identityhashmap-weakhashmap-enummap-in-java.html)
        *   1)The fundamental difference between IdentityHashMap and other Map implementations e.g. HashMap, Hashtable, WeakHashMap or
        *   EnumMap it uses equality operator (==) to search and get the value back.
        *
        *  Since == operator only return true if the reference variables point to the same object, it's not possible to get the value with a different object even if it appear equal in all field.
        *  You must hold the reference of the key object outside the IdentityHashMap to get the value back.
        *
        * Another consequence of using == operator instead of equals() method is that there would be less collision compared to other Map implementations e.g. HsahMap
        *
        * 2)  The fundamental difference between WeakHashMap and other Map classes like HashMap, IdentityHashMap and EnumMap is that its keys are WeakReferences,
        *  which means both key and value becomes eligible to garbage collection if a key is no longer referenced from elsewhere in the program.
        * This property makes WeakHashMap a good candidate for using as Cache in memory constraint environment because Map itself will take care of removing unused Mapping. On the other hand, this can cause unusual behavior
        * if later removed key is passed from the different part of a program.
        *
        * 3)The third one, EnumMap is a special Map implementations for Enum keys, this is also the fundamental difference between EnumMap and another general purpose Map class e.g. HashMap or Hashtable. Unlike others EnumMap only allows Enum constants to be used as keys.
        *  If you try to store keys other than Enum than compiler will throw an error
        *
        *                               Data structure                    Sorting                       Iterator        Nulls
        *   Hashmap                     Hash table                          No                          Fail fast       Yes
        *   LinkedHashMap               Hash table + linked list          Insertion or access order       Fail fast       Yes
        *   IdentityHashMap             Array                               No                          Fail fast       Yes
        *   WeakHashMap                 Hash table                          No                          Fail fast       Yes
        *   Enummap                     Array                               Natural order               Weakly consistent No
        *   TreeMap                     Red black tree                      Sorted                      Fail fast        Yes
        *    ConcurrentHashMap          Hash tables                         No                        Weakly consistent  No
        *  ConcurrentSkipListMap        Skip List                           Sorted                      Fail fast         No
        *
        *
        *  */
    }
}
