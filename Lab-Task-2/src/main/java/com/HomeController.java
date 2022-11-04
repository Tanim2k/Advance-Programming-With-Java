package com;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("Calculator")
   public String Showform()
   {
       return "Calculator";
   }
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
   public String Handleform(@RequestParam("quantity") Integer num1,@RequestParam("quantity2") Integer num2,@RequestParam("calculator") String op,Model model1)
   {
       User user=new User();
       user.setCalculator(op);
       user.setQuantity(num1);
       user.setQuantity2(num2);
       System.out.println("Number 1 "+user.getQuantity());
       System.out.println("Number 2 "+user.getQuantity2());
       model1.addAttribute("number1",user.getQuantity());
       model1.addAttribute("number2",user.getQuantity2());
       model1.addAttribute("operation",user.getCalculator());
      if(op.equals("Summation")) {

          Integer sum=num1+num2;

          model1.addAttribute("result",sum);
      }
      else if(op.equals("Subtraction")) {
          Integer sub=num1-num2;

          model1.addAttribute("result", sub);
      }
      else if(op.equals("Multiplication"))
      {
          Integer mul=num1*num2;

          model1.addAttribute("result", mul);
      }
      else {
          Integer div=num1/num2;

          model1.addAttribute("result", div);
      }


       return "Result";
   }

}
