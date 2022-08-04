public class LinkedList {
    Node head;
    Node tail;
    int listLength = 0;


    public LinkedList()  {
        
    }

    public Node append(int addNum) {
        Node newNode = new Node(addNum,null); 
        if (listLength == 0) {
            head = newNode;
            tail = newNode;
        }
        else if(listLength == 1) {
            //tail = new Node(tail.num,newNode);
            tail.nextNode = newNode;
            tail.prevNode = head;
            tail = tail.nextNode;
        }
        else {
            tail.nextNode = newNode;
            newNode.prevNode = tail;
            tail = tail.nextNode;
        }
        
        listLength++;
        return tail;
    }

    public void remove(int pos) {
        Node newNode = head; 
        if (pos == 0) {
            head = newNode.nextNode;
        }
        else {
            for (int i = 0; i < pos - 1; i++) {
                newNode = newNode.nextNode;
            }
            Node replaceNode = newNode.nextNode;
            replaceNode = replaceNode.nextNode;
            if (replaceNode == null) {
                tail = newNode;
                newNode.nextNode = replaceNode;
            }
            else {
                
                newNode.nextNode = replaceNode;
            }
        }

    }

    public int get(int pos) {
        Node newNode = head; 
        for (int i = 0; i < pos; i++) {
            newNode = newNode.nextNode;
        }
        return newNode.num;
    }

    public Node getNode(int pos) {
        Node newNode = head; 
        for (int i = 0; i < pos - 1; i++) {
            newNode = newNode.nextNode;
        }
        return newNode.nextNode;
    }

    public void removeNode(Node delNode) {
        Node replaceNode = delNode.nextNode;
        Node prevNode = delNode.prevNode;
        if (prevNode == null) {
            head = delNode;
        }
        else if (replaceNode == null) {
            prevNode.nextNode = replaceNode;
            tail = prevNode;
        }
        else {
            prevNode.nextNode = replaceNode;
        }
    } 

    public void insert(int num, int pos) {
        Node nodeBehind = head; 
        Node nodeAfter;
        if (pos == 0) {
            head = new Node(num, head);
        }
        // else if(pos == listLength - 1) {
        //     nodeBehind = tail.prevNode;
        //     nodeAfter = tail;
        //     nodeBehind.nextNode = new Node(num, tail);
        // }
        else if(pos == listLength) {
            nodeBehind = tail;
            nodeBehind.nextNode = new Node(num, null,nodeBehind);
            tail = nodeBehind.nextNode;
        }
        else {
            for (int i = 0; i < pos - 1; i++) {
                nodeBehind = nodeBehind.nextNode;
            }
            nodeAfter = nodeBehind.nextNode;
            Node newNode = new Node(num, nodeAfter, nodeBehind);
            nodeBehind.nextNode = newNode;
        }
    }

    public void insertNode(int num, Node previousNode) {
        
        if (previousNode == null) {
            //Node nodeBefore = head;
            head = new Node(num,head);
            Node nodeAfter = head.nextNode;
            nodeAfter.prevNode = head;
        }
        else if (previousNode == tail) {
            Node newNode = new Node(num, null,previousNode);
            tail.nextNode = newNode;
            tail = newNode;
        }
        else {
            Node newNode = new Node(num, previousNode.nextNode,previousNode);
            previousNode.nextNode = newNode;
            Node nodeAfter = newNode.nextNode;
            nodeAfter.prevNode = newNode;
        }
    }

    public void print() {
        System.out.println(head.toString());
        //System.out.println(tail.toString());
    }
}
