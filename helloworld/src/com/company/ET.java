package com.company;
import java.util.*;;

/**
 * Created by Donaldzou on 2017-04-28.
 */
public class ET {
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Donald Zou", 75000, 2016, 12, 16);
        staff[1] = new Employee("Justin Wong", 75000, 2016, 12, 16);
        staff[2] = new Employee("Charlie Chen", 75000, 2016, 12, 16);

        for (Employee e : staff)
            System.out.println("Name= " + e.getName() + ", Salary= " + e.getSalary() + ", Hire Day= " + e.getHireDay());
    }
}
class Employee{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name =  n;
        salary = s;
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);
        hireDay = cal.getTime();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }
}