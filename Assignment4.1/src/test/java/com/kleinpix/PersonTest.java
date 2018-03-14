package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   A small program using TDD method to demonstrate "Polymorphasim",
                one of the three core principals of Object Oriented Programming.
 */

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest  extends TestCase
{
    @Test
    public void testPerson()
    {
        Person person1 = new Employee("Heinrich", "Klein",41,850000.00,"Kraaifontein");
        Person person2 = new Employee("Alec", "Klein",9, 900000.00, "Kraaifontein");
        assertEquals(person1, person2);
    }
    @Test
    public void testEmployee()
    {
        Person employee1 = new Employee("Dawn", "Klein", 41, 750000.00, "Kraaifontein");
        assertNotNull(employee1);
    }
    @Test
    public void testLecturerCourse()
    {
        Lecturer lecturer1 = new Lecturer("A", "Anikwue", 30, 980000.00, "Cape Town", "TP2");
        assertEquals("TP2", lecturer1.getCourse());
    }
    @Test
    public void testEmployeeName()
    {
        Person person3 = new Employee("Luke", "Klein", 7, 6590000.00, "Kraaifontein");
        assertEquals("Luke", person3.getName());
    }
}