class Node {
    int data;
    Node next;

    // Constructor to initialize node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedL {
    Node head;

    // Method to print all nodes of the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }

        Node currNode = head;
        // Traverse the list and print each node's data
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Insert a node at the beginning of the list
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        // If list is empty, make newNode the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, set newNode to point to the current head and update head
        newNode.next = head;
        head = newNode;
    }

    // Insert a node at the given position in the list
    public void insertInMiddle(int position, int data) {
        Node newNode = new Node(data);

        // If the position is 1, insert at the beginning
        if (position == 1) {
            insertAtFirst(data);
            return;
        }

        Node tempNode = head;

        // Traverse to the node before the given position
        for (int i = 1; i < position - 1; i++) {
            if (tempNode == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            tempNode = tempNode.next;
        }

        if (tempNode == null) {
            System.out.println("Position out of bounds :)");
            return;
        }

        // Insert the new node by adjusting the links
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    // Insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty, make newNode the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the end of the list and insert the new node
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    // Delete the first node in the list
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is already empty...");
            return;
        }

        // Update head to the next node (deleting the first node)
        head = head.next;
    }

    // Delete the last node in the list
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is already empty...");
            return;
        }

        // If there is only one node, set head to null
        if (head.next == null) {
            head = null;
            return;
        }

        // Traverse to the second last node
        Node secondLastNode = head;
        while (secondLastNode.next.next != null) {
            secondLastNode = secondLastNode.next;
        }

        // Set the second last node's next to null (deleting the last node)
        secondLastNode.next = null;
    }

    // Find and return the middle node of the list
    public Node middleNode() {
        int midNode = 0;

        // First, count the total number of nodes
        Node tempNode = head;
        while (tempNode != null) {
            midNode++;
            tempNode = tempNode.next;
        }

        // Calculate the index of the middle node (2nd middle if even number of nodes)
        midNode = midNode / 2;

        // Reset tempNode to the head and traverse to the middle node
        tempNode = head;
        int count = 0;
        while (tempNode != null) {
            if (count == midNode) {
                return tempNode; // Return the middle node when count reaches midNode
            }
            count++;
            tempNode = tempNode.next;
        }

        return null; // In case the list is empty
    }

    public Node reverseList() {
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = null;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        head = prevNode;
        return head;
    }

    // Delete dupliacate
    public Node deleteDuplicate() {
        Node tempNode = head;

        while (tempNode != null) {
            Node nextNode = tempNode;
            while (nextNode.next != null) {
                if (tempNode.data == nextNode.next.data) {
                    nextNode.next = nextNode.next.next;
                } else {
                    nextNode = nextNode.next;
                }
            }
            tempNode = tempNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();

        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        // Print the list
        list.printList();

        // Find the middle node
        // Node midNode = list.middleNode();

        // Check if midNode is null (for empty list)
        // if (midNode != null) {
        // System.out.println("Middle node data: " + midNode.data);
        // } else {
        // System.out.println("List is empty...");
        // }
        list.deleteDuplicate();
        list.printList();
    }
}
