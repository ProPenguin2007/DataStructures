public class Node {
    int num;
    Node nextNode;
    Node prevNode;


    public Node(int number, Node newNode, Node lastNode) {
        num = number;
        nextNode = newNode;
        prevNode = lastNode;

    }

    public Node(int number, Node newNode) {
        num = number;
        nextNode = newNode;

    }



    public String toString() {
        String output = "";
        output += "Number: " + num + "\n";
        if (nextNode == null) {
            output += "Node: Null";
        }
        else {
            output += nextNode.toString();
        }
        return output;
    }
}
