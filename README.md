# Difference-Arrays-ArrayLists
This repository dives into the difference between an array and an array list. 

An array collects a sequence of values of the same type. When you create an array, it has a fixed size. 
This means that if you create an array that holds only 3 values, you will not be able to add more values to it.
Arrays can hold different data types like strings, ints, etc., but you must remember to declare the type when you create the array.
   
    This looks like:  String [] names = new String[7]; 
    /**Where String states the type of values that can be stored in the array*/

Since arrays have a set size, they can be computed faster than ArrayLists, as ArrayLists have to process requests for adding or removing values and resizing the array if it happens to run out of space.
Lastly, individual elements in an array are accessed by an integer index i, using the notation array[i].
In comparison, an ArrayList can be edited, so you can add or remove values from it. Because of this behavior, ArrayLists can be described as dynamic. 
An ArrayList can also store any object type, like strings, integers, etc., but you must remember to specify the type of object. 

    This can look like: ArrayList<String> names = new ArrayList,.();
    /**Where String states the type of values that can be stored in the array but the list can grow or shrink in size.*/

To find out the size of an ArrayList, developers can use the expression array.length() to find the number of elements in an ArrayList. 
	
    This can look like: if (7 <= i && I < numbers.length) { numbers[i] = number; }
