package com.automation.bootcamp_submission;


	import java.util.Arrays;

	class Person implements Comparable<Person> {
	    String name;
	    int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public int compareTo(Person other) {
	        // Compare persons based on their age
	        return Integer.compare(this.age, other.age);
	    }

	    @Override
	    public String toString() {
	        return "Person{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }
	}

	public class QuickSortExample {
	    // Quicksort algorithm for sorting an array of comparable objects
	    public static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
	        if (low < high) {
	            // Partition the array and get the pivot index
	            int pivotIndex = partition(array, low, high);

	            // Recursively sort the subarrays
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }

	    // Helper method to partition the array and return the pivot index
	    private static <T extends Comparable<T>> int partition(T[] array, int low, int high) {
	        T pivot = array[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (array[j].compareTo(pivot) <= 0) {
	                i++;
	                swap(array, i, j);
	            }
	        }

	        swap(array, i + 1, high);
	        return i + 1;
	    }

	    // Helper method to swap elements in an array
	    private static <T> void swap(T[] array, int i, int j) {
	        T temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    public static void main(String[] args) {
	        // Creating an array of Person objects
	        Person[] people = {
	                new Person("Alice", 25),
	                new Person("Bob", 30),
	                new Person("Charlie", 22),
	                new Person("David", 28)
	        };

	        // Displaying the array before sorting
	        System.out.println("Array before sorting:");
	        System.out.println(Arrays.toString(people));

	        // Sorting the array using quicksort
	        quickSort(people, 0, people.length - 1);

	        // Displaying the array after sorting
	        System.out.println("\nArray after sorting:");
	        System.out.println(Arrays.toString(people));
	    }
	}
