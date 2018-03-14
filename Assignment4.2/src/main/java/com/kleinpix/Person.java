package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   Modified code to use an alternative solution to inheritance.
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

    }
    //parameterized constructor
    public Person(String name,String surname,int age,double salary, String address)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.address = address;
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
    //toString method to print
    public void displayPerson()
    {
        System.out.println ("Name: " + name + "\n" +
                            "Surname: " + surname + "\n" +
                            "Age: " + age + "\n" +
                            "Salary: " + salary + "\n" +
                            "Address: " + address);
    }
}
