package Heap_DataStructure;

class student implements Comparable<student>{
    String name;
    int rollNo;
    double cgpa;
    student(String name, int rollNo, double cgpa){
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    
    public int compareTo(student s){
        return Double.compare(this.cgpa, s.cgpa);
    }
}
public class customeComparable {
    public static void main(String[] args) {
        student s1 = new student("Ravi", 1, 9.8);
        student s2 = new student("Kishan", 2, 8.2);
        student s3 = new student("Akash", 3, 9.2);
        student s4 = new student("Satyam", 4, 7.8);
        student s5 = new student("chandan", 5, 5.8);

        student[] arr = {s1,s2,s3,s4,s5};
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i].name);
        }
    }
}
