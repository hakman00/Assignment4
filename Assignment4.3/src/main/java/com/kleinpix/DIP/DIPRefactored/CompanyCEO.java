package com.kleinpix.DIP.DIPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   DIPRefactored: shows adherance to DIP.
 */

public class CompanyCEO
{
    private OpsManager opsManager;
    private Employee employee;

    public CompanyCEO()
    {

    }
    public  CompanyCEO(OpsManager opsManager, Employee employee)
    {
        this.opsManager = opsManager;
        this.employee = employee;
    }

    public OpsManager getOpsManager()
    {
        return opsManager;
    }
    public Employee getEmployee()
    {
        return employee;
    }

    public void setOpsManager(OpsManager opsManager)
    {
        this.opsManager = opsManager;
    }
    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }
}
