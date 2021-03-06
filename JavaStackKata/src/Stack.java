import java.util.EmptyStackException;

class Stack {
    private final int MAX = 50;
    private int size;
    private int capacity = 0;
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
        if (capacity < stackArr.length - 1) {
            stackArr[++capacity] = object;
        }
        else {
            throw new StackOverflowError("Stack Overflow");
        }
    }

    int size () {
        return size;
    }

    int currentCapacity () {
        return capacity;
    }

    void pop() {
        if(!isEmpty()) {
            capacity--;
        }
        else {
            throw new EmptyStackException();
        }
    }

    boolean isEmpty() {
        return capacity < 1;
    }

    Object top (){
        if (!isEmpty()) {
            return stackArr[capacity];
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    void clear() {
        capacity = -1;
    }
}
