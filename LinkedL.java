class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class LinkedL {
    Node head;

    public void insert(int new_data) {
        Node newNode = new Node(new_data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public boolean search(int key) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == key) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node currNode = head;
        Node prevNode = null;

        while (currNode != null && currNode.data != key) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if (currNode == null) {
            System.out.println("Element not found.");
            return;
        }

        prevNode.next = currNode.next;
    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("List: ");
        list.printList(); // Outputs: 10 20 30 40

        System.out.println("Search 30: " + list.search(30)); // Outputs: true
        System.out.println("Search 50: " + list.search(50)); // Outputs: false

        list.delete(20); // Deletes node with data 20
        System.out.print("List after deletion: ");
        list.printList(); // Outputs: 10 30 40

        list.delete(50); // Tries to delete non-existent element
    }
}
