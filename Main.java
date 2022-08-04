public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        Node node = list.append(4);
        //list.append(0);

        //list.remove(3);
        list.append(6);
        list.append(7);
        list.append(23);
        list.append(345);

        //Node testNode = list.getNode(8);
        //testNode.prevNode = anotherNode;

        list.print();
        //list.removeNode(testNode);
        list.insertNode(0,null);
        list.removeNode(list.getNode(5));
        //list.removeNode(list.getNode(8));
        list.print();
        //System.out.println(list.getNode(2));
    }
}