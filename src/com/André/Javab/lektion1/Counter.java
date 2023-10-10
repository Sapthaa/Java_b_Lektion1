package com.André.Javab.lektion1;

public class Counter {
    static int value = 0;

    static public void count(){
        System.out.println("Before value: " + value);
        value++;
        System.out.println("After value: " + value);

    }

    /* TODO - About static
     * static methods must have static variables
     * regular methods can have static variables
     * -
     * What does static method do?
     * - Added new feature
     * - No necessary instantiation for method calling
     *
     * What does static variable do?
     *  - Unchanged memory position
     *  - Only 1 memory position allocated
     *  - 1 reference only
     *
     */



}
