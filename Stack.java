public class Stack {
    
    int listLength = 0;
    int size = 10;
    int[] list = new int[size];

    public Stack(int Size) {
        size = Size;
        list = new int[size];
    }

    
    public void push(int num) {
        if (listLength < list.length) {
            list[listLength] = num;
            listLength++;
        }
        
    }

    public int pop() {
        int poppedNum = list[listLength - 1];
        listLength--;
        return poppedNum;
    }

    // input from back 
    //ex) pos 0 -> back of list(end)
    public int get(int reversePos) {
        return list[listLength-reversePos - 1];
    }
}
