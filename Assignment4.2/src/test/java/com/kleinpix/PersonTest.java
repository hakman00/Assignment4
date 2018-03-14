package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   Modified code to use an alternative solution to inheritance.
 */

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase
{
    Person person = new Person("Heinrich", "Klein", 41, 850000.00, "Kraaifontein");
    Employee employee = new Employee(650157, new Person("Dawn","Klein",41,750000.00,"Kraaifontein"));
    Lecturer lecturer = new Lecturer("TP2", 123321, person);

    @Test
    public void testPerson()
    {
        assertEquals(employee.getPerson(),employee.getPerson());
    }
    @Test
    public void testEmployee()
    {
        assertEquals(employee.getPerson().getName(), lecturer.getPerson().getName());
    }
    @Test
    public void testLecturerCourse()
    {
        assertEquals(lecturer.getPerson().getName(), lecturer.getPerson().getName());
    }
    @Test
    public void testEmployeeName()
    {
        assertEquals("Zeke", employee.getPerson().getName());
    }
    @Test
    public void testLecturerStaffId()
    {
        Lecturer lecturer1 = new Lecturer("TP2", 123321, new Person("Luke", "Klein", 7, 690000.00, "Kraaifontein"));
        assertEquals(123321,lecturer1.getStaffId());
    }
    @Test
    public void testPersonSame()
    {
        assertSame(employee.getPerson(), employee.getPerson());
    }
    @Test
    public void testPersonNotSame()
    {
        assertNotSame(lecturer.getPerson(), lecturer.getPerson());
    }
    @Test
    public void testPersonNotNull()
    {
        assertNotNull(person);
    }
}