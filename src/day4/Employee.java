package day4;

import java.time.LocalDate;

public class Employee {

   private int id;
   private String name;
   private String salary;
   private LocalDate hireDate;

   // Default constructor
   private Employee() {}

   //Paramaterized constructor
   public Employee(int id, String name, String salary, LocalDate hireDate) { // constructor overloading

      this.id = id;
      this.name = name;
      this.salary=salary;
      this.hireDate=hireDate;


   }

}

