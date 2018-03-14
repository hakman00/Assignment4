package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   Modified code to use an alternative solution to inheritance.
 */

public class Lecturer
{
    private String course;
    private int staffId;
    private Person person;

    public Lecturer(String course, int staffId, Person person)
    {
        this.course = course;
        this.staffId = staffId;
        this.person = person;
    }
    //METHODS
    //Getters - Accessors
    public String getCourse()
    {
        return course;
    }
    public int getStaffId()
    {
        return staffId;
    }
    public Person getPerson()
    {
        return person;
    }
    //Setter - Mutators
    public void setCourse(String course)
    {
        this.course = course;
    }
    public void setStaffId(int staffIdNumber)
    {
        this.staffId = staffIdNumber;
    }
    public void setPerson(Person person)
    {
        this.person = person;
    }
}
