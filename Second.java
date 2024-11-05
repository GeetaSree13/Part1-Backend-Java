import java.util.Arrays;
import java.util.Scanner;

public class MyList<T> {
    private Object[] data;
    private int size;

    public MyList() {
        data = new Object[100];
        size = 0;
    }

    // Adds a new value to the list
    public void add(T value) {
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
        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = 0; 
        
    }

    // Deletes an element based on its value
    public void deleteByValue(T value) {
        int index = indexOf(value);
        if (index == -1) {
            System.out.println("Value not found in the list");
        } else {
            deleteByIndex(index);
        }
    }

    // Retrieves the value at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return null;
        }
        return (T) data[index];
    }

    // Finds the index of a specific value
    private int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
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
        MyList<Integer> integerList = new MyList<>();
       
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.printList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to delete");
        int index=sc.nextInt();
        integerList.deleteByIndex(index);
        System.out.println("After deleting index :");
        integerList.printList();

        System.out.println("Enter value to delete");
        int value=sc.nextInt();
        integerList.deleteByValue(value);
        System.out.println("After deleting value :");
        integerList.printList();

        System.out.println("Enter index to retrieve");
        int ind=sc.nextInt();
        System.out.println("Element at index : " + integerList.get(ind));
        sc.close();
    }
}
