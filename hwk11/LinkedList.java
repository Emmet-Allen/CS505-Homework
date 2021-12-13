public class LinkedList{
    protected Node head; 
    
    LinkedList(){
        head = null;
    };
    
    LinkedList(Node _head){
        this.head = _head; 
    }

    public void add(Node newNode){
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node trav = head;
            while(trav.next != null){
                trav = trav.next;
            } 
            trav.next = newNode;
        }
    }

    public int  indexOf (String  str) {
        int counter = 0;  
        if(this.head.str.equals(str)){
            return counter;  
        }
        else{
        Node trav = head;
            while(trav != null){
                if(trav.str.equals(str) ){
                    return counter;
                }
                else{
                    counter++;
                    trav = trav.next;
                }
            }

        }
        return -1; 
    }

    public void insertBefore (int index,  Node n){
        int counter = 1;
        if(index == 0){
            if(this.head != null){
                Node temp = this.head;
                this.head = n;
                head.next = temp;
            }
            else{
                this.head = n;
            }
        }
        else{
        Node trav = head;
            while(trav != null){
                trav = trav.next;
                counter++;
                    if(index == counter){
                        Node temp1 = trav;
                        Node temp2 = trav.next;
                        temp1.next = n;
                        n.next = temp2;
                    }
            }
        }
    }

    public void insertAfter(int index,  Node n){
        Node trav = head;
        int counter = 0;
        while(trav != null){
            trav = trav.next;
            counter++;
            if(counter == index){
                Node temp1 = trav;
                Node temp2 = trav.next;
                temp1.next = n;
                n.next = temp2;
            }
        }
    }

    public void removeNodeAt(int index) { 
        Node trav = head;
        int counter = 0;
        if(index == 0){
            this.head = head.next;
        }
        else{
            while(trav != null){
                trav = trav.next;
                counter++;
                if(counter == index - 1){
                    Node temp1 = trav;
                    Node temp2 = trav.next.next;
                    trav.next = null;
                    temp1.next = temp2;
                }
            }
        }
    }


    public void printList(){
        Node trav = head;
        while(trav != null){
            System.out.println(trav.str);
            trav = trav.next; 
        }
    }
}
