###### Linked list is a linear structure where it has linked Nodes, each node has data and reference to next Node.
###### Linked List can be singly or doubly, in singly it has reference to next Node only, in doubly it has reference to previous and next Node.
###### Head is first node of the linked list which will be passed around to pass the linked list.
###### Get - Linked list has to be traversed one by one if we need nth node we can go from head till nth Node. It can not be accessed as array via index.
###### Insert - If we want to insert new node in the middle of the list, 
          then navigate to that node after which we want new node and make prev node point to new node and make new node's next point to prev node's next.
        - if we want new node to be at the end of the list, then navigate till end by checking next == null, then make that last node point to this new node
        - if we want new node to be head (first node) then, make new node point to head and update head reference to this new node.
###### Delete - If we want to delete node in the middle of the list, 
          then navigate to that node and make prev node point to delete's next node.
        - if we want new node to be at the end of the list, then navigate till end by checking next == null, then make next reference of prev node as null
        - if we want to delete head node then, make head's next as new head.
1. Delete nth node from last in linked list - Fast and slow pointer, user senteniel node run fast same n and the jump fast and slow till fast reaches end
2. Reverse single linked list - prev, curr, next pointers and reverse pointers to reverse linked list.
3. Singly linked list is palindrome or not - run list to find node count n. push n/2 into arraylist, skip middle if odd number, then compare list in reverse and remaining list. 
Use fast slow to find middle then next to it is start of second half.. compare with first half till second reaches to null.

        

