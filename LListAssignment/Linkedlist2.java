class Node {
    int data;
    Node1 next;
};
public class Linkedlist2 {
    Node1 head;

    Linkedlist2() {
        head = null;
    }

    void push_back(int newElement) {
        Node1 newNode = new Node1();
        newNode.data = newElement;
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node1 temp = new Node1();
            temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    //Inserts a new element at the given position
    void push_at(int newElement, int position) {
        Node1 newNode = new Node1();
        newNode.data = newElement;
        newNode.next = null;

        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            Node1 temp = new Node1();
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }

            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
            }
        }
    }

    //display the content of the list
    void PrintList() {
        Node1 temp = new Node1();
        temp = this.head;
        if(temp != null) {
            System.out.print("The list contains: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }

    public static void main(String[] args) {
        Linkedlist2 MyList = new Linkedlist2();

        //Add three elements at the end of the list.
        MyList.push_back(3);
        MyList.push_back(6);
        MyList.push_back(5);
        MyList.PrintList();

        //Insert an element at position 2
        MyList.push_at(8, 2);
        MyList.PrintList();

        //Insert an element at position 3
        MyList.push_at(9, 3);
        MyList.PrintList();
    }
}