/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_task_1;

import java.time.LocalDate;

/**
 *
 * @author TANIM
 */
public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setname("xyz");
        LocalDate birthDate = LocalDate.of(1961, 5, 17);
         LocalDate date = LocalDate.now(); 
         System.out.println("Name is "+s1.getname());
         s1.calculateAge(birthDate,date);
        
    }
}