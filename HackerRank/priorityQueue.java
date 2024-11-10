
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
/*
 * Create the Student and Priorities classes here.
 */

class Student{
    int id;
    String name;
    double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCGPA(){
        return cgpa;
    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        LinkedList<Student> pq = new LinkedList<Student>(); 
  
        for(int i=0;i<events.size();i++){
            String[] entry = events.get(i).split("\\s+");
            
            if(entry[0].equals("ENTER")){

                Student s = new Student(Integer.parseInt(entry[3]), entry[1], Double.parseDouble(entry[2]));
                pq.add(s);
                
                
            }
            
            else if(entry[0].equals("SERVED")){
                //sort the queue first
                Collections.sort(pq, new CompareStudents());
                try{pq.removeFirst();}catch(Exception e){};
            }
        }
        return pq;
    }
}

class CompareStudents implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        //sorting logic
        if(s1.cgpa<s2.cgpa){
            return 1;
        }
        if(s1.cgpa>s2.cgpa){
            return -1;
        }
        if(s1.name.compareTo(s2.name)!=0){
            return s1.name.compareTo(s2.name);
        }
       
        if(s1.id<s2.id){
            return -1;
        }
        if(s1.id>s2.id){
            return 1;
        }
        return 0;
    }
}

