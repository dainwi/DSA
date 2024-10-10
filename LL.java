/**
 * The class LL represents a singly linked list in Java with methods to add
 * nodes at the beginning,
 * end, and middle, remove nodes, search for elements, and update node data.
 */
public class LL {
    // In the Java code provided, `static Node headNode;` declares a static variable
    // `headNode` of type
    // `Node` within the `LL` class. This variable is used to keep track of the head
    // node of the singly
    // linked list.
    static Node headNode;

    /**
     * The Node class represents a node in a linked list with an integer data value
     * and a reference to
     * the next node.
     */
    public static class Node {
        // In the provided Java code snippet, `int data;` and `Node next;` are instance
        // variables of
        // the inner class `Node`.
        int data;
        Node next;

        // The `Node(int data)` constructor in the provided Java code is initializing a
        // new node object
        // with the given `data` value.
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * The function `printList` prints the data of each node in a linked list
     * starting from the head
     * node.
     * 
     * @param headNode The `headNode` parameter in the `printList` method is the
     *                 starting node of a
     *                 linked list. The method traverses the linked list starting
     *                 from this node and prints out the
     *                 data stored in each node. If the `headNode` is `null`, it
     *                 means the linked list is empty
     */
    public void printList(Node headNode) {

        // In the provided Java code snippet, `Node temp = headNode;` is declaring a new
        // variable
        // `temp` of type `Node` and assigning it the value of the `headNode`. This
        // statement is
        // creating a reference to the head node of the linked list so that operations
        // like traversing
        // the list or manipulating nodes can be performed starting from the head node
        // without directly
        // modifying the `headNode` variable itself.
        Node temp = headNode;

        // The code snippet `if (temp == null) { System.out.println("\nList is empty
        // :)"); return; }`
        // is a conditional check within the `printList` method of the `LL` class in
        // Java.
        if (temp == null) {
            System.out.println("\nList is empty :)");
            return;
        }

        System.out.print("\nList data is: ");
        // The code snippet `while (temp != null) { System.out.print(temp.data + " ");
        // temp =
        // temp.next; }` is part of the `printList` method in the provided Java code.
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /**
     * The `addFirst` function adds a new node with the given data at the beginning
     * of a linked list.
     * 
     * @param data The `data` parameter in the `addFirst` method represents the
     *             value that you want to
     *             add to the beginning of the linked list as a new node.
     */
    public void addFirst(int data) {
        // This code snippet is from the `addFirst` method in the `LL` class of a singly
        // linked list
        // implementation in Java. Here's what it does:
        // In the provided code snippet, the segment `Node newNode = new Node(data);`
        // creates a new
        // node object with the data value specified by the `data` parameter.
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        // In the provided Java code snippet within the `addFirst` method of the `LL`
        // class, the lines
        // `newNode.next = headNode;` and `headNode = newNode;` are responsible for
        // adding a new node
        // with the given data at the beginning of a linked list.
        newNode.next = headNode;
        headNode = newNode;
    }

    /**
     * The `addLast` function adds a new node with the given data at the end of a
     * linked list.
     * 
     * @param data The `data` parameter in the `addLast` method represents the
     *             integer value that you
     *             want to add to the end of the linked list. This value will be
     *             stored in a new Node and appended
     *             to the end of the existing linked list.
     */
    public void addLast(int data) {
        // In the provided code snippet:
        // In the provided Java code snippet, `Node newNode = new Node(data);` is
        // creating a new node
        // object with the data value specified by the `data` parameter. This line of
        // code is used in
        // methods like `addFirst`, `addLast`, and `addInMiddle` to instantiate a new
        // node that will be
        // added to the linked list with the given data value. The `Node` class has a
        // constructor that
        // initializes a new node object with the provided data value and a `null`
        // reference to the
        // next node.
        Node newNode = new Node(data);
        // In the provided code snippet, the `if (headNode == null)` condition check
        // followed by
        // `headNode = newNode; return;` is a part of the `addFirst` and `addLast`
        // methods in the `LL`
        // class of a singly linked list implementation in Java.
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        // In the provided Java code snippet, the statement `Node currNode = headNode;`
        // is initializing
        // a new node reference variable `currNode` and assigning it the value of the
        // `headNode`. This
        // line of code is used to create a reference to the head node of the linked
        // list so that
        // operations like traversing the list, searching for elements, or manipulating
        // nodes can be
        // performed starting from the head node without directly modifying the
        // `headNode` variable
        // itself.
        Node currNode = headNode;
        // The code snippet `while (currNode.next != null) { currNode = currNode.next;
        // }` is used in
        // the `addLast` method of the `LL` class in Java.
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        // In the provided Java code snippet, the statement `currNode.next = newNode;`
        // is used in the
        // `addInMiddle` method of the `LL` class. This line of code is responsible for
        // inserting a new
        // node with the given data into the middle of the linked list.
        currNode.next = newNode;
    }

    /**
     * The `addInMiddle` method inserts a new node with the given data at a
     * specified index in a linked
     * list.
     * 
     * @param index The `index` parameter in the `addInMiddle` method represents the
     *              position at which
     *              you want to insert a new node with the given data value in the
     *              linked list. It indicates the
     *              index (starting from 0) where the new node should be added.
     * @param data  The `data` parameter in the `addInMiddle` method represents the
     *              integer value that
     *              you want to insert into the linked list at the specified index.
     */
    public void addInMiddle(int index, int data) {
        Node newNode = new Node(data);

        // In the provided code snippet, the `if (headNode == null)` condition check
        // followed by
        // `headNode = newNode; return;` is part of the `addFirst` and `addLast` methods
        // in the `LL`
        // class of a singly linked list implementation in Java.
        if (headNode == null) {
            headNode = newNode;
            return;
        }

        // In the provided code snippet, the `if (index == 0)` condition check followed
        // by
        // `addFirst(data); return;` is part of the `addInMiddle` method in the `LL`
        // class of a singly
        // linked list implementation in Java.
        if (index == 0) {
            addFirst(data);
            return;
        }

        // In the provided Java code snippet, the lines `Node currNode = headNode;` and
        // `int indexCount
        // = 0;` are part of the `addInMiddle` method in the `LL` class. Here's what
        // they are doing:
        Node currNode = headNode;
        int indexCount = 0;

        // The code snippet `while (indexCount < index - 1 && currNode != null) {
        // currNode =
        // currNode.next; indexCount++; }` is part of the `addInMiddle` method in the
        // provided Java
        // code for a singly linked list implementation.
        while (indexCount < index - 1 && currNode != null) {
            currNode = currNode.next;
            indexCount++;
        }

        // The code snippet `if (currNode == null) { System.out.println("\nIndex out of
        // bounds :)");
        // return; }` is a part of the `addInMiddle` method in the provided Java code
        // for a singly
        // linked list implementation.
        if (currNode == null) {
            System.out.println("\nIndex out of bounds :)");
            return;
        }

        // In the provided Java code snippet, the lines `newNode.next = currNode.next;`
        // and
        // `currNode.next = newNode;` are part of the `addInMiddle` method in the `LL`
        // class. Here's
        // what these lines are doing:
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    /**
     * The `removeFirst` function removes the first node in a linked list if it
     * exists.
     */
    public void removeFirst() {
        // Code is checking if the `headNode` is `null`. If `headNode` is `null`, it
        // prints a
        // message "There is nothing to remove :)" and then returns from the method.
        // This is likely
        // part of a method that removes an element from a data structure, and this
        // check ensures that
        // the removal operation is not performed on an empty data structure.
        if (headNode == null) {
            System.out.println("\nThere is nothing to remove :)");
            return;
        }

        // The above code is moving to the next node in a linked list. It is updating
        // the `headNode`
        // reference to point to the next node in the list.
        headNode = headNode.next;
    }

    /**
     * The `removeLast` function removes the last node from a singly linked list.
     */
    public void removeLast() {
        // The above code is checking if the `headNode` is `null`. If `headNode` is
        // `null`, it prints a
        // message "There is nothing to remove :)" and then returns from the method.
        // This is likely
        // part of a method that removes an element from a data structure, and it is
        // handling the case
        // where there are no elements to remove.
        if (headNode == null) {
            System.out.println("\nThere is nothing to remove :)");
            return;
        }

        // The above code is checking if the next node after the headNode is null. If it
        // is null, it
        // sets the headNode to null, effectively removing the headNode from the linked
        // list.
        if (headNode.next == null) {
            headNode = null;
            return;
        }

        // The above Java code is finding the second to last node in a linked list and
        // setting its next
        // pointer to null, effectively removing the last node from the list.
        Node secondLastNode = headNode;
        Node lastNode = headNode.next;

        // The above code is traversing a linked list to find the last node and the
        // second last node in
        // the list. It iterates through the list until it reaches the last node (where
        // `lastNode.next`
        // is `null`), updating `lastNode` and `secondLastNode` in each iteration.
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        // The above code is setting the `next` reference of the `secondLastNode` to
        // `null`,
        // effectively removing the connection to the next node in a linked list. This
        // can be useful
        // when you want to remove a node from the list or when you want to indicate the
        // end of the
        // list.
        secondLastNode.next = null;
    }

    /**
     * The `searchList` function in Java searches for a specific key in a linked
     * list and prints the
     * index where the key is found or a message if the key is not present.
     * 
     * @param key The `key` parameter in the `searchList` method is the value that
     *            you want to search
     *            for in the linked list. The method iterates through the linked
     *            list starting from the head node
     *            and checks if any node in the list contains the same value as the
     *            `key`. If a node with
     */
    public void searchList(int key) {
        Node currNode = headNode;

        if (headNode == null) {
            System.out.println("\nList is empty :)");
            return;
        }

        // The above Java code is iterating through a linked list starting from the head
        // node
        // (`currNode`) and checking if the `data` value of each node is equal to a
        // given `key`. If a
        // node with the matching `key` is found, it prints a message indicating the
        // index at which the
        // element is present in the list and then returns. The `indexCount` variable is
        // used to keep
        // track of the index of the current node being checked in the list.
        int indexCount = 0;
        while (currNode != null) {
            if (currNode.data == key) {
                System.out.println("\nElement is present in the list at index: " + indexCount);
                return;
            }
            currNode = currNode.next;
            indexCount++;
        }

        System.out.println("\nElement is not present in the list :)");
    }

    /**
     * The `updateNodeData` function updates the data of a node at a specified index
     * in a linked list.
     * 
     * @param index   The `index` parameter in the `updateNodeData` method
     *                represents the position in the
     *                linked list where you want to update the data. It is the index
     *                of the node whose data you want
     *                to change. The method will traverse the linked list and update
     *                the data of the node at the
     *                specified index
     * @param newData The `newData` parameter in the `updateNodeData` method
     *                represents the new value
     *                that you want to update the data of the node at the specified
     *                index with.
     */
    public void updateNodeData(int index, int newData) {
        if (headNode == null) {
            System.out.println("\nList is empty :)");
            return;
        }

        Node currNode = headNode;
        int indexCount = 0;

        while (currNode != null) {
            if (indexCount == index) {
                currNode.data = newData;
                return;
            }
            currNode = currNode.next;
            indexCount++;
        }

        System.out.println("\nIndex out of bounds :)");
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(10);

        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.printList(headNode);

        System.out.println("\n************* After Inserting in Middle *************");
        list.addInMiddle(2, 60);
        list.printList(headNode);

        list.removeFirst();
        list.removeLast();
        list.printList(headNode);

        System.out.println("\n************* After Updating the Node Data *************");
        list.updateNodeData(3, 40);
        list.printList(headNode);

        list.updateNodeData(3, 50);
        list.printList(headNode);

        list.searchList(40);
    }
}
