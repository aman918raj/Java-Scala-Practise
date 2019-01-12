import java.util.*;

public class JavaCollection {

    public static void main(String[] args){

        linkedList();
        arrayList();
        hashSet();
        linkedHashSet();
    }
    public static void linkedList(){

        /*
        LinkedList maintains the order.
        We can replace any element by set function.
        We can remove any element by index using remove function.
        We can have duplicates.
         */
        List ll = new LinkedList();

        ll.add("Hi");
        ll.add("How");
        ll.add("you");
        ll.add(2,"are");
        ll.set(3,"they");
        ll.add("Hi");
        ll.add("Hello");
        ll.remove(5);
        System.out.println("LinkedList: " + ll);

    }

    /*
    Difference between arraylist and linkedlist
    1) ArrayList internally uses dynamic array to store the elements.
    LinkedList internally uses doubly linked list to store the elements.
    2) Manipulation with ArrayList is slow because it internally uses array. If any element is removed from the array, all the bits are shifted in memory.
   Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
    3) ArrayList class can act as a list only because it implements List only.
      LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
    4) ArrayList is better for storing and accessing data.
    LinkedList is better for manipulating data.
    5) ArrayList maintains indexes and element data while
    LinkedList maintains element data and two pointers for neighbor nodes hence the memory consumption is high in LinkedList comparatively.
    6) They both maintain the elements insertion order which means while displaying ArrayList and LinkedList elements the
    result set would be having the same order in which the elements got inserted into the List.
     */
    /*
    When to use LinkedList and when to use ArrayList?
    1) As explained above the insert and remove operations give good performance (O(1)) in LinkedList compared to ArrayList(O(n)).
     Hence if there is a requirement of frequent addition and deletion in application then LinkedList is a best choice.

    2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) so
    If there are less add and remove operations and more search operations requirement, ArrayList would be your best bet.
     */

    public static void arrayList(){

        List al = new ArrayList();

        al.add("Hi");
        al.add("How");
        al.add("you");
        al.add(2,"are");
        al.set(3,"they");
        al.add("Hi");
        al.add("Hello");
        al.remove(5);
        System.out.println("ArrayList: " + al);

    }
    /*
    Set:
    Basically, Set is a type of collection that does not allow duplicate elements. That means an element can only exist
    once in a Set. It models the set abstraction in mathematics.
    The following characteristics differentiate a Set collection from others in the Java Collections framework:
    Duplicate elements are not allowed.
    Elements are not stored in order. That means you cannot expect elements sorted in any order
    when iterating over elements of a Set.
    HashSet: is the best-performing implementation and is a widely-used Set implementation.
    It represents the core characteristics of sets: no duplication and unordered.
    LinkedHashSet: This implementation orders its elements based on insertion order.
    So consider using a LinkedHashSet when you want to store unique elements in order.
    TreeSet: This implementation orders its elements based on their values, either by their natural ordering,
    or by a Comparator provided at creation time.
    Note that the default, initial capacity of a HashSet and LinkedHashSet is 16, so if you are sure that your
    Set contains more than 16 elements, it’s better to specify a capacity in the constructor. For example:
    Set<String> bigNames = new HashSet<>(1000);
     */

    public static void hashSet(){
        Set hs = new HashSet();
        hs.add("Hi");
        hs.add("How");
        hs.add("are");
        hs.add("they");
        hs.add("Hi");
        hs.add("Hello");
        hs.remove("Hello");
        System.out.println("HashSet: " + hs);
    }

    public static void linkedHashSet(){
        Set hs = new LinkedHashSet();
        hs.add("Hi");
        hs.add("How");
        hs.add("are");
        hs.add("they");
        hs.add("Hi");
        hs.add("Hello");
        hs.remove("Hello");
        System.out.println("LinkedHashSet: " + hs);
    }
}
