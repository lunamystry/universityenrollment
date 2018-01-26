package com.bbd.universityenrollment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
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
}
