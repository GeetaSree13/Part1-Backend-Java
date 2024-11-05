import java.util.Arrays;
import java.util.Scanner;

public class MyList {
    private int[] data;
    private int size;

    public MyList() {
        data = new int[100];
        size = 0;
    }

    // Adds a new value to the list
    public void add(int value) {
        if (size == data.length) {
            resize(data.length * 2); // Double the size if full similar to arrayList
        }
        data[size++] = value;
    }

    // Deletes an element based on its index
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = 0; 
    }

    // Deletes an element based on its value
    public void deleteByValue(int value) {
        int index = indexOf(value);
        if (index == -1) {
            System.out.println("Value not found in the list");
        }
        else {
            deleteByIndex(index);
        }
    }

    // Retrieves the value at a specific index
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
        }
        return data[index];
    }

    // Finds the index of a specific value
    private int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Resizing array to a new capacity
    private void resize(int newCapacity) {
        data = Arrays.copyOf(data, newCapacity);
    }

    // Printing elements in an array
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(60);
        myList.printList();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to delete");
        int index=sc.nextInt();
        myList.deleteByIndex(index);
        System.out.println("After deleting index :");
        myList.printList();

        System.out.println("Enter value to delete");
        int value=sc.nextInt();
        myList.deleteByValue(value);
        System.out.println("After deleting value :");
        myList.printList();

        System.out.println("Enter index to retrieve");
        int ind=sc.nextInt();
        System.out.println("Element at index : " + myList.get(ind));
        sc.close();
    }
}
