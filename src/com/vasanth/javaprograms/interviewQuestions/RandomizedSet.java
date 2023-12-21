package com.vasanth.javaprograms.interviewQuestions;

/*design a class in java that has an 
insert operation with no duplicate values,
remove a value,
get a random number from the already inserted with equal probality
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomizedSet {

    private Set<Integer> values;

    public RandomizedSet() {
        // Constructor initializes the HashSet
        values = new HashSet<>();
    }

    public boolean insert(int value) {
        // Insert operation to add a value to the set
        return values.add(value);
    }

    public boolean remove(int value) {
        // Remove operation to delete a value from the set
        return values.remove(value);
    }

    public int getRandom() {
        // Get a random value from the set using Math.random()
        int size = values.size();
        int randomIndex = (int) (Math.random() * size);

        // Iterate through the set to find the value at the random index
        Iterator<Integer> iterator = values.iterator();
        for (int i = 0; i < randomIndex; i++) {
            iterator.next();
        }

        return iterator.next();
    }

    public static void main(String[] args) {
        // Example usage
        RandomizedSet randomizedSet = new RandomizedSet();

        // Insert unique values
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);
        randomizedSet.insert(4);
        randomizedSet.insert(5);
        randomizedSet.insert(6);
        randomizedSet.insert(7);
        randomizedSet.insert(8);


        // Remove a value
        randomizedSet.remove(2);

        // Get a random value
        int randomValue = randomizedSet.getRandom();
        System.out.println("Random Value: " + randomValue);
    }
}
