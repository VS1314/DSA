package com.vasanth.javaprograms.interviewQuestions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*design a class in java that has an 
	insert operation with no duplicate values,
	remove a value,
	get a random number from the already inserted with equal probality
*/
public class RandomizedArrayList {

    private ArrayList<Integer> values;
    private HashMap<Integer, Integer> valueToIndex;
    private Random random;

    public RandomizedArrayList() {
        // Constructor initializes the data structures
        values = new ArrayList<>();
        valueToIndex = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int value) {
        // Insert operation to add a value to the set
        if (valueToIndex.containsKey(value)) {
            return false; // Duplicate value, insertion failed
        }

        values.add(value);
        valueToIndex.put(value, values.size() - 1);
        return true;
    }

    public boolean remove(int value) {
        // Remove operation to delete a value from the set
        if (!valueToIndex.containsKey(value)) {
            return false; // Value not found, removal failed
        }

        int indexToRemove = valueToIndex.get(value);
        int lastValue = values.get(values.size() - 1);

        // Swap the value to remove with the last value
        values.set(indexToRemove, lastValue);
        valueToIndex.put(lastValue, indexToRemove);

        // Remove the last value and its index
        values.remove(values.size() - 1);
        valueToIndex.remove(value);

        return true;
    }

    public int getRandom() {
        // Get a random value from the set
        int randomIndex = random.nextInt(values.size());
        return values.get(randomIndex);
    }

    public static void main(String[] args) {
        // Example usage
    	RandomizedArrayList randomizedSet = new RandomizedArrayList();
        
        // Insert unique values
        randomizedSet.insert(1);
        randomizedSet.insert(5);
        randomizedSet.insert(4);
        randomizedSet.insert(6);

        randomizedSet.insert(2);
        randomizedSet.insert(3);

        // Remove a value
        randomizedSet.remove(2);

        // Get a random value
        int randomValue = randomizedSet.getRandom();
        System.out.println("Random Value: " + randomValue);
    }
}
