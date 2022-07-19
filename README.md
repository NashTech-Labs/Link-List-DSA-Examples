## Linked List
### Description

LinkedList is a data structure in which data is stored in a linear manner. It usually contains a data field and a link to the memory location of the next mode.

### Structure

```
class LinkedList<E>{
    E value;
    LinkedList next;
}
```

The `next` variable points to the next node in the data structure and value stores the data. Any number of nodes can be linked in this manner. The structure will be:


### Properties
1. Linked list does not provide indexing like an array. For accessing a node at position `p` , &theta;(p) nodes need to be accessed.
2. Main advantage of linked list is addition and removal of nodes near the end and beginning of lists. It can be done just by updating the link (O(1) time)
3. Unlike an array, its size is not predefined. So any number of nodes can be appended.

### File descriptions:

1. `CircularLinkedList.java` : A circular linked list where next pointer of last node points to first nide of linked list.
2. `SinglyLinkedList.java` : The classic case of single links.

###  To Run Application from Terminal

>  mvn clean
> >mvn compile
> >>mvn run