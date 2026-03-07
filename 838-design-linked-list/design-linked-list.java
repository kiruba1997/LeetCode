class MyLinkedList {

    class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;

        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);

        if(head == null){
            head = tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        if(tail == null){
            head = tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;

        if(index == 0){
            addAtHead(val);
            return;
        }

        if(index == size){
            addAtTail(val);
            return;
        }

        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val);

        node.prev = temp.prev;
        node.next = temp;

        temp.prev.next = node;
        temp.prev = node;

        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0){
            head = head.next;
            if(head != null) head.prev = null;
            else tail = null;
        }
        else if(index == size-1){
            tail = tail.prev;
            tail.next = null;
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        size--;
    }
}