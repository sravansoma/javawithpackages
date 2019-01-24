package CollectionsSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, 55));
        students.add(new Student(2, 65));
        students.add(new Student(3, 75));
        students.add(new Student(4, 85));
        students.add(new Student(5, 95));

        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }

    }
}

class Student implements Comparable<Student>{
    int rollno, marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student Roll No is " + rollno + " marks are " + marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.marks > o.marks ? -1 : this.marks < o.marks ? 1 : 0;
    }
}
