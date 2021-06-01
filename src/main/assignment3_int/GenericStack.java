package assignment3_int;

/** Interface for a generic stack */
public interface GenericStack<E> {
   public E pop();
   public E peek();
   public void push(E element);
   public E lastElement ();
   public boolean isEmpty();

}