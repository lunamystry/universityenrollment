package com.bbd.universityenrollment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void shouldCreateStudent() {
        Student johnny = new Student("Johnny");
        assertEquals(johnny.getName(), "Johnny");
    }

    @Test
    public void shouldCreateCourse() {
        Course course = new Course("Test");
        assertEquals(course.getName(), "Test");
    }
}
