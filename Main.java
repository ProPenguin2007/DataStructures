public class Main {
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.append(1);
        // list.append(2);
        // list.append(3);
        // Node node = list.append(4);
        // //list.append(0);

        // //list.remove(3);
        // list.append(6);
        // list.append(7);
        // list.append(23);
        // list.append(345);

        // //Node testNode = list.getNode(8);
        // //testNode.prevNode = anotherNode;

        // list.print();
        // //list.removeNode(testNode);
        // list.insertNode(0,null);
        // list.removeNode(list.getNode(5));
        // //list.removeNode(list.getNode(8));
        // list.print();
        //System.out.println(list.getNode(2));

        // Stack list = new Stack();
        // list.push(1);
        // list.push(2);
        // list.push(3);
        // list.push(4);
        // list.push(11);
        // for (int i = 0; i < 10;i++) {
        //     System.out.println(list.list[i]);
        // }
        // System.out.println(list.get(4));

        Queue q = new Queue(10);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(6);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(10);
        q.dequeue();

        //q.enqueue(0);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(0);

        q.print();
        
        //System.out.println(exponents(4,3));

        //System.out.println(multiplyStack(4, 3));
    }

    public static int exponents(int num, int exponent) {
        int newNum;
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return num;
        }
        else {
            newNum = multiply(exponents(num, exponent - 1), num);
            return newNum;
        }
        //System.out.println(num);
    }


    public static int multiply(int num,int num2) {
        int newNum;
        if (num == 0 || num2 == 0) {
            return 0;
        }
        if (num == 1) {
            return num2;
        }
        if (num2 == 1) {
            return num;
        }
        else {
            newNum = multiply(num, num2 - 1) + num;
            return newNum;

        }
    }

    public static int multiplyStack(int value1,int value2) {
        Stack stack = new Stack(100);
        int newNum;
        int returnValue = 0;
        stack.push(value1);
        stack.push(value2);
        while (stack.listLength > 0) { 
            int num = stack.pop();
            int num2 = stack.pop();
            if (num == 0 || num2 == 0) {
                returnValue = 0;
                continue;
            }
            if (num == 1) {
                returnValue = num2;
                continue;
            }
            if (num2 == 1) {
                returnValue = num;
                continue;
            }
            else {
                newNum = multiply(num, num2 - 1) + num;
                returnValue = newNum;
                continue;
            }
        }
        return returnValue;
    }

}