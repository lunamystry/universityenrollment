package com.bbd.universityenrollment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

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
