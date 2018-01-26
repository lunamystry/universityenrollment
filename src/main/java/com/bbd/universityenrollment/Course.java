package com.bbd.universityenrollment;

import java.util.ArrayList;

public class Course {
    private Integer capacity;
    private String name;
    private ArrayList<Student> students;
    private Integer numberOfCourses;

    public Course(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Integer getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(Integer numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public boolean enrollStudent(Student s) {
        if (this.students.size() < this.capacity) {
            return this.students.add(s);
        } else {
            return false;
        }
    }

    public boolean unenrollStudent(Student s) {
        return this.students.remove(s);
    }
}
