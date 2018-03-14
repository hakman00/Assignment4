package com.kleinpix.DIP.DIPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   DIPViolated: shows the DIP being violated.
 */

public class CompanyCEO
{
   private OpsManager opsManager;
   private Employee employee;

   public double salOpsManger()
   {
       return opsManager.empSalary();
   }

   public double Employee()
   {
       return employee.empSalary();
   }
}
