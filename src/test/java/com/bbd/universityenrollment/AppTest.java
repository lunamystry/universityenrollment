package com.bbd.universityenrollment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void shouldCreateStudent() {
        Student johnny = new Student("Johnny", 1, "1923-02-07");
        assertEquals(johnny.getName(), "Johnny");
        assertEquals(johnny.getStudentNumber(), 1);
        assertEquals(johnny.getDob(), "1923-02-07");

        johnny.setName("Dukey");
        johnny.setStudentNumber(2);
        johnny.setDob("Changed");

        assertEquals(johnny.getName(), "Dukey");
        assertEquals(johnny.getStudentNumber(), 2);
        assertEquals(johnny.getDob(), "Changed");
    }

    @Test
    public void shouldCreateCourse() {
        Course course = new Course("Test", 1);
        assertEquals(course.getName(), "Test");
        assertEquals(course.getCapacity(), (Integer) 1);

        course.setName("Some other name");
        course.setCapacity(2);
        assertEquals(course.getName(), "Some other name");
        assertEquals(course.getCapacity(), (Integer) 2);
    }
}
