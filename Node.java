public class Node<T> {
    private Node<T> next = null;
    private Node<T> previous = null;
    T value;

   public void setValue(T value){
    this.value = value;
   }

   public void setNext(Node<T> next){
    this.next = next;
   }

   public void setPrevious(Node<T> previous){
    this.previous = previous;
   }

   public Node<T> getNext(){
    return this.next;
   }

   public Node<T> getPrevious(){
    return this.previous;
   }

   public T getValue() {
       return this.value;
   }
}