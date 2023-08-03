//node structure
class Node1 {
    int data;
    Node1 next;
};

class LinkedList4 {
    static Node1 head;

    LinkedList4(){
        head = null;
    }

    //Add new element at the end of the list
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

    static void deleteDuplicates() {
        if(head == null || head.next == null)
            return ;
        Node1 curr = head;

        while( curr != null && curr.next != null){

            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return;
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
        LinkedList4 MyList = new LinkedList4();

        //Add three elements at the end of the list.
        MyList.push_back(3);
        MyList.push_back(3);
        MyList.push_back(5);
        MyList.push_back(6);
        MyList.push_back(6);
        MyList.push_back(7);
        MyList.PrintList();

        deleteDuplicates();

        MyList.PrintList();

    }
}