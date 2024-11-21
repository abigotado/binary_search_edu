package org.abigotado;

import java.util.ArrayList;
import org.abigotado.arrays.AbiArrays;
import org.abigotado.collections.AbiCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test Arrays class methods
        System.out.println("Testing Arrays class:");

        // Test for primitive types
        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println(AbiArrays.binarySearch(byteArray, (byte) 5)); // Output: 2
        System.out.println(AbiArrays.binarySearch(byteArray, 1, 4, (byte) 5)); // Output: 2
        System.out.println(AbiArrays.binarySearch(byteArray, (byte) 2)); // Output: -2

        char[] charArray = {'a', 'c', 'e', 'g'};
        System.out.println(AbiArrays.binarySearch(charArray, 'e')); // Output: 2
        System.out.println(AbiArrays.binarySearch(charArray, 1, 3, 'e')); // Output: 2
        System.out.println(AbiArrays.binarySearch(charArray, 'b')); // Output: -2

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println(AbiArrays.binarySearch(doubleArray, 3.3)); // Output: 2
        System.out.println(AbiArrays.binarySearch(doubleArray, 1, 3, 3.3)); // Output: 2
        System.out.println(AbiArrays.binarySearch(doubleArray, 5.0)); // Output: -5

        float[] floatArray = {1.5f, 2.5f, 3.5f};
        System.out.println(AbiArrays.binarySearch(floatArray, 2.5f)); // Output: 1
        System.out.println(AbiArrays.binarySearch(floatArray, 0, 2, 2.5f)); // Output: 1
        System.out.println(AbiArrays.binarySearch(floatArray, 4.0f)); // Output: -4

        int[] intArray = {10, 20, 30, 40};
        System.out.println(AbiArrays.binarySearch(intArray, 20)); // Output: 1
        System.out.println(AbiArrays.binarySearch(intArray, 1, 3, 30)); // Output: 2
        System.out.println(AbiArrays.binarySearch(intArray, 15)); // Output: -2

        long[] longArray = {100L, 200L, 300L};
        System.out.println(AbiArrays.binarySearch(longArray, 300L)); // Output: 2
        System.out.println(AbiArrays.binarySearch(longArray, 0, 2, 100L)); // Output: 0
        System.out.println(AbiArrays.binarySearch(longArray, 400L)); // Output: -4

        short[] shortArray = {10, 20, 30};
        System.out.println(AbiArrays.binarySearch(shortArray, (short) 20)); // Output: 1
        System.out.println(AbiArrays.binarySearch(shortArray, 0, 2, (short) 30)); // Output: -3
        System.out.println(AbiArrays.binarySearch(shortArray, (short) 25)); // Output: -3

        // Test for objects with comparator
        Integer[] integerArray = {10, 20, 30, 40};
        System.out.println(AbiArrays.binarySearch(integerArray, 20, Comparator.naturalOrder())); // Output: 1
        System.out.println(AbiArrays.binarySearch(integerArray, 0, 3, 30, Comparator.naturalOrder())); // Output: 2
        System.out.println(AbiArrays.binarySearch(integerArray, 25, Comparator.naturalOrder())); // Output: -3

        // Test Collections class methods
        System.out.println("\nTesting Collections class:");

        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 10, 20, 30, 40);
        System.out.println(AbiCollections.binarySearch(integerList, 20)); // Output: 1
        System.out.println(AbiCollections.binarySearch(integerList, 25)); // Output: -3

        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "apple", "banana", "cherry", "date");
        System.out.println(AbiCollections.binarySearch(stringList, "cherry")); // Output: 2
        System.out.println(AbiCollections.binarySearch(stringList, "apricot")); // Output: -2

        List<String> reverseList = new ArrayList<>(stringList);
        reverseList.sort(Comparator.reverseOrder());
        System.out.println(Collections.binarySearch(reverseList, "banana", Comparator.reverseOrder())); // Output: 2
    }
}