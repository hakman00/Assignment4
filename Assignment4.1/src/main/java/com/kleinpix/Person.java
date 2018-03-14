package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   A small program using TDD method to demonstrate "Inheritance",
                one of the three core principals of Object Oriented Programming.
 */

public class Person
{
    private String name;
    private String surname;
    private int age;
    private double salary;
    private String address;

    //default constructor
    public Person()
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }
    //parameterized constructor
    public Person(String pName,String pLname,int pAge,double pSalary, String pAdd)
    {
        this.name = pName;
        this.surname = pLname;
        this.age = pAge;
        this.salary = pSalary;
        this.address = pAdd;
    }
    //METHODS
    //Getters - Accessors
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getAge()
    {
        return age;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getAddress()
    {
        return address;
    }
    //Setter - Mutators
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
}
