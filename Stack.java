public class Stack<T> {
    private Node<T> last = null;
    private Node<T> first = null;

    public Stack() {
    }

    public void push(T item) {
        Node<T> newNode = new Node<>();
        newNode.setValue(item);
        newNode.setPrevious(last);
        if (last != null) {
            last.setNext(newNode);
        }
        last = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = last.getValue();
        last = last.getPrevious();
        if (last != null) {
            last.setNext(null);
        }
        return value;
    }

    public T last() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return last.getValue();
    }

    public boolean isEmpty() {
        return last == null;
    }
}