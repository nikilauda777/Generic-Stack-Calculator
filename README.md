# RPN 20.09.2020


----------------------------------------
 Stack-based RPN Calculator
----------------------------------------

```
/** Interface for a generic stack */
public interface GenericStack<E> {
   public E pop();
   public E peek();
   public void push(E element);
   public boolean isEmpty();
}
``` 

The calculator shall work with both types of stacks (and any other implementation of the stack interface) 
without any modification (see "dependency injection").


The program takes as input an expression in RPN and outputs the calculated result. 
The program shall support the 4 basic arithmetical operations `+ - * /`. 

```
Example:
input: {"1.5", "2", "+", "3", "4", "-", "*"}
output: -3.5
```


