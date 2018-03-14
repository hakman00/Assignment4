package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   A small program using TDD method to demonstrate "Polymorphasim",
                one of the three core principals of Object Oriented Programming.
 */

public class Lecturer extends Person
{
    private String course;
    private int staffId;

    public Lecturer(String name, String surname, int age,double salary, String address, String course)
    {
        super(name, surname, age, salary, address);
        this.course = course;
        this.staffId = staffId;
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

    //Setter - Mutators
    public void setCourse(String course)
    {
        this.course = course;
    }
    public void setStaffId(int staffIdNumber)
    {
        this.staffId = staffIdNumber;
    }
}
