public static  Node insert(Node head,int data) {
        Node newNode = new Node(data);
        if(head==null){
            return newNode;
        }
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = newNode;
        return head;
    }
