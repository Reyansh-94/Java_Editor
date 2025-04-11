package LinkedList;

public class DoublyLinkedList {
//Node class represents each node in doubly linked list
class Node {	
	int data;
	Node next;
	Node prev;
	
	//Constructed to create a new node
	public Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
//head node of the list 
private Node head;

//Constructed to initialize an empty linkedlist 
public void DoublylinkList() {
	head = null;
}

//insert a new node at the begining of the doublylinkedlist

public void insertAtBegin(int data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
	}else {
		newNode.next = head;
		head.prev = newNode;
		head = newNode; // create new next node to next node connect with it
		
	}
}

//insert node at the end of the doublylinkedlist

public void insertAtEnd(int data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
		return;
	}
		Node temp = head;
	   while(temp.next != null) {
		   temp = temp.next;
	   }
       temp.next = newNode;
       newNode.prev = temp;
}
// Delete a node by value
public void deleteNode(int data) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    Node temp = head;
    // Traverse the list to find the node with the given data
    while (temp != null && temp.data != data) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Node with data " + data + " not found.");
        return;
    }

    if (temp == head) {
        head = head.next; // Move head if node to delete is the first node
        if (head != null) {
            head.prev = null; // Set the previous pointer of the new head to null
        }
    } else if (temp.next == null) {
        temp.prev.next = null; // If it's the last node, set the previous node's next to null
    } else {
        temp.prev.next = temp.next; // Link previous node to the next node
        temp.next.prev = temp.prev; // Link next node to the previous node
    }

    temp = null; // Free the memory (optional in Java, as garbage collection handles this)
}

// Traverse the list from head to tail
public void traverseForward() {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    Node temp = head;
    System.out.println("Traversing forward:");
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}

// Traverse the list from tail to head
public void traverseBackward() {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    Node temp = head;
    // Move to the last node
    while (temp.next != null) {
        temp = temp.next;
    }

    System.out.println("Traversing backward:");
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.prev;
    }
    System.out.println();
}

public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();

    // Inserting nodes
    list.insertAtBegin(10);  // List: 10
    list.insertAtEnd(20);        // List: 10 <-> 20
    list.insertAtEnd(30);        // List: 10 <-> 20 <-> 30
    list.insertAtBegin(5);   // List: 5 <-> 10 <-> 20 <-> 30

    // Traversing forward and backward
    list.traverseForward();      // Output: 5 10 20 30
    list.traverseBackward();     // Output: 30 20 10 5

    // Deleting a node by value
    list.deleteNode(20);         // List: 5 <-> 10 <-> 30
    list.traverseForward();      // Output: 5 10 30

    // Trying to delete a node that doesn't exist
    list.deleteNode(40);         // Output: Node with data 40 not found.

    // Traversing after deletion
    list.traverseForward();      // Output: 5 10 30
}
}


