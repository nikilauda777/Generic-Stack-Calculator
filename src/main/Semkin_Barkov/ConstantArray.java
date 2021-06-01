package Semkin_Barkov;

import assignment3_int.GenericStack;


public class ConstantArray<E> implements GenericStack<E> {

    private Object[] storage;



    public ConstantArray(){

        storage = new Object[0];
    }


    @Override
    public E pop() {                                     //returns the top item of this array and removes it

        if (storage.length == 0)
            return null;
         else {

            E output = (E) storage[0];                 // first element
            Object[] recover = new Object[storage.length - 1];    //neues Array mit weniger Speicherplatz
            System.arraycopy(storage, 1, recover, 0, recover.length);   // copy of array without first value

            return output;
        }

    }


    @Override
    public E peek() {                        //returns the top item of this array without removing it
            if ( storage.length == 0){
                return null;
            }
        return (E) storage[0];
    }


    @Override
    public void push(E element) {

        if(storage.length == 0){
            storage = new Object[1];      // new one Object
            storage[0] = element;

        }
        else {

            Object[] recover = new Object[storage.length + 1];
            System.arraycopy(storage, 0, recover, 0, storage.length);  // copy in recover
            recover[recover.length - 1] = element;                                  // the last element

            storage = recover;

        }

    }

    @Override
    public E lastElement() {

        if (storage.length == 0)
            return null;
        else {

            E output = (E) storage[storage.length - 1];                 //last element zurückgeben
            Object[] recover = new Object[storage.length - 1];          // länge verringern
            System.arraycopy(storage, 0, recover, 0, recover.length);   // neue Array kopieren

            storage = recover;

            return output;

        }

    }

    @Override
    public boolean isEmpty() {                      //returns true if this array contains no items
        return storage.length == 0;
    }

}
