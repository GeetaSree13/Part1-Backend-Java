//Implement a generic MyList class with a member that holds a generic array of size 100.
//This class should support the following operations: adding a new value, deleting an element based on its index,
//deleting an element based on its value, and retrieving a value from a specific index. 
//The class should be capable of creating lists for Integer, String, and custom classes. 
//Use the same structure as the previous class and make it generic.

import java.util.Arrays;
import java.util.Scanner;

//custom class
class Student{
    String name;
    int rollno;
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return name +" : "+ rollno;
    }
    
}

public class MyList<T> {
    private Object[] data;
    private int size;

    public MyList() {
        data = new Object[100];
        size = 0;
    }

    // Adds a new value to the list
    public void add(T value) {
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

        MyList<String> stringList = new MyList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.printList();

        MyList<Student> studentList = new MyList<>();
        studentList.add(new Student("P", 20));
        studentList.add(new Student("Q", 25));
        studentList.add(new Student("R", 35));
        studentList.add(new Student("S", 30));
        studentList.add(new Student("T", 40));
        studentList.printList();

        // Deleting by index
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to delete");
        int index=sc.nextInt();
        integerList.deleteByIndex(index);
        stringList.deleteByIndex(index);
        studentList.deleteByIndex(index);
        System.out.println("After deleting index Integer list:");
        integerList.printList();
        System.out.println("After deleting index string list:");
        stringList.printList();
        System.out.println("After deleting index student list:");
        studentList.printList();

        // Deleting by value
        System.out.println("Enter value to delete");
        int value=sc.nextInt();
        String s=sc.next();
        String n=sc.next();
        int r=sc.nextInt();
        integerList.deleteByValue(value);
        stringList.deleteByValue(s);
        studentList.deleteByValue(new Student(n, r));
        System.out.println("After deleting value integer list:");
        integerList.printList();
        System.out.println("After deleting index string list:");
        stringList.printList();
        System.out.println("After deleting index student list:");
        studentList.printList();

        // Retrieve element
        System.out.println("Enter index to retrieve");
        int ind=sc.nextInt();
        System.out.println("Element at index : " + integerList.get(ind));
        System.out.println("Element at index : " + stringList.get(ind));
        System.out.println("data at index : " + studentList.get(ind));
        sc.close();
    }
}
