package Chapter_10;

import java.util.Arrays;

public class Ex_10_9 {
    public static void main(String[] args){
        Course course1 = new Course("English");
        course1.addStudent("Dinislam");
        course1.addStudent("Ajar");
        course1.addStudent("Beka");
        course1.addStudent("Vlad");
        System.out.println(course1.getCourseName());
        System.out.println(Arrays.toString(course1.getStudents()));
        course1.dropStudent("Beka");
        System.out.println(Arrays.toString(course1.getStudents()));
        System.out.println(course1.getNumberOfStudents());
    }
}
class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if(numberOfStudents >= student.length()){
            String[] temp = new String[student.length() * 2];
            System.arraycopy(students, 0, temp, 0, numberOfStudents+1);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }
    //if (size >= elements.length) {
    //int[] temp = new int[elements.length * 2];
    //System.arraycopy(elements, 0, temp, 0, elements.length);
    //elements = temp;
    //}
    public String[] getStudents() {
        String[] newStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, newStudents, 0, numberOfStudents);
        return newStudents;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        boolean drop = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if(students[i].equals(student)){
                drop = true;
            }
            if(drop) {
                students[i] = students[i+1];
            }
        }
        numberOfStudents--;
// Left as an exercise in Programming Exercise 10.9
    }
    public void clear(){
        students = new String[students.length];
    }
}
