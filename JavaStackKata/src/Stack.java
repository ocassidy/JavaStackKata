import java.util.EmptyStackException;

class Stack {
    private final int MAX = 50;
    private int size;
    private int[] data = new int[MAX]; // Maximum size of Stack
    private int count = 0;
    private Object[] stackArr;

    Stack () {
        this.size = MAX;
        this.stackArr = new Object[MAX];
    }

    Stack (int size) {
        this.size = size;
        this.stackArr = new Object[size];
    }

    void push(Object object) {
        if (count < data.length - 1) {
            stackArr[++count] = object;
        }
        else {
            throw new StackOverflowError("Stack Overflow");
        }
    }

    int size () {
        return count;
    }

    void pop() {
        if(!isEmpty()) {
            count--;
        }
        else {
            throw new EmptyStackException();
        }
    }

    boolean isEmpty() {
        return count < 1;
    }

    Object top (){
        if (!isEmpty()) {
            Object top = stackArr[count];
            return top;
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    void clear() {
        count = -1;
    }
}
