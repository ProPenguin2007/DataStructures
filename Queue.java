public class Queue {
    //int listStart;
    //int listLength = 0;
    int size = 10;
    //int[] list = new int[size];

    int start = 0;
    int[] head = new int[100];
    int headSize = 0;

    public Queue(int Size) {
        size = Size;
        head = new int[size];
    }

    public void enqueue(int num) {
        head[headSize % size] = num;
        headSize++;
        
    }

    public int dequeue() {
        int returnNum = head[start % size];
        start++;
        headSize--;
        
        return returnNum;
    }

    public void print() {
        if (headSize < size) {
            for (int i = 0; i < headSize; i++) {
                System.out.println(head[headSize - i - 1]);
            }
        }
        else {
            for (int i = 0; i < size; i++) {
                System.out.println(head[size - i - 1]);
            }
        }
        
    }
}
