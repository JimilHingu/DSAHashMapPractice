package trucs;

import trucs.exception.EmptyCollectionException;;

public class TRUArrayStack<T> implements StackADT<T> {
    private final static int Major_Num = 100;
    private T[] stack;
    private int top;

    public TRUArrayStack() {
        this(Major_Num);
    }

    @SuppressWarnings("not Checked yet")
    public TRUArrayStack(int capcity) {
        stack = (T[]) (new Object[capcity]);
        top = 0;
    }

    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }

    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("noting in stack !!");
        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;

    }

    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("nothig in this stack");
        }
        return stack[top - 1];
    }

    @SuppressWarnings("not checked")
    private void expandCapacity() {
        T[] biggerStack = (T[]) (new Object[stack.length * 2]);

        for (int i = 0; i < stack.length; i++) {
            biggerStack[i] = stack[i];
        }
        stack = biggerStack;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

}
