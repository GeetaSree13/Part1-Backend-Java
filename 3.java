//Create a class named Employee with the following fields: id (String), name (String), age (int), and dateOfJoining (Date).
//Use this Employee object with the previously implemented MyList class.

import java.time.LocalDate;
import java.util.*;

class Employee {
    String id;
    String name;
    int age;
    LocalDate dateOfJoining; //LocalDate is used instead of Date because it is outdated

    public Employee(String id, String name, int age, LocalDate dof) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dof;
    }

    @Override
    public String toString() {
        return "{ name: " + name + ", id: " + id + ", age: " + age + ", Date of joining: " + dateOfJoining + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return id.equals(other.id) && name.equals(other.name) && age == other.age && dateOfJoining.equals(other.dateOfJoining);
    }

}

class MyList<T> {
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
        data[--size] = null; 
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

    // Printing elements in an array
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyList<Employee> employee = new MyList<>();

        employee.add(new Employee("Y21CS127", "Alice", 30, LocalDate.of(2023, 1, 15))); // January 15, 2023
        employee.add(new Employee("Y21CS105", "Bob", 25, LocalDate.of(2012, 3, 10)));  // March 10, 2012
        employee.add(new Employee("Y21CS138", "Charlie", 35, LocalDate.of(2024, 6, 5))); // June 5, 2024
        System.out.print("Employee List: ");
        employee.printList();

        Scanner sc = new Scanner(System.in);
        // Deleting by index
        System.out.println("Enter index to delete:");
        int index = sc.nextInt();
        employee.deleteByIndex(index);
        System.out.print("After deleting index from Employee List: ");
        employee.printList();

        // Deleting by value
        System.out.println("Enter ID, name, age, year, month, day of employee to delete:");
        String id = sc.next();
        String name = sc.next();
        int age = sc.nextInt();
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        employee.deleteByValue(new Employee(id, name, age, LocalDate.of(year, month, day)));
        System.out.println("After deleting Employee from Employee List: ");
        employee.printList();

        // Retrieve element
        System.out.println("Enter index to retrieve:");
        int ind = sc.nextInt();
        System.out.println("Employee at index " + ind + ": " + employee.get(ind));

        sc.close();
    }
}
