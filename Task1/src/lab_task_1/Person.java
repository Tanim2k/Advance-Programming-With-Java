/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_task_1;

import java.time.LocalDate;
import java.time.Period;



/**
 *
 * @author TANIM
 */
public class Person {
     private String name;
    
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    
    public static void calculateAge(LocalDate birthDate, LocalDate currentDate) {
       
        if ((birthDate != null) && (currentDate != null)) {
            Period period = Period.between(birthDate, currentDate); 
            System.out.println("Age is "+period.getYears()+" Years "+period.getMonths()+" Month "+period.getDays()+" Days");
            
        } else {
            System.out.println("Birth Date cant be null");
        }
    }
}

