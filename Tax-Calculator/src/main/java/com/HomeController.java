package com;

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

    @RequestMapping("Calculate")
    public String Viewform()
    {
        return "TaxCalculation";
    }

    @RequestMapping(path = "/processform",method = RequestMethod.POST)
   public String Handleform(@RequestParam("options") String catagory,@RequestParam("zones") String area,
                            @RequestParam("num1") Integer num1,@RequestParam("num2") Integer num2,
                            @RequestParam("num3") Integer num3,@RequestParam("num4") Integer num4,
                            @RequestParam("num5") Integer num5,@RequestParam("num6") Integer num6,
                            @RequestParam("num7") Integer num7,Model model)
   {

       if(catagory.equals("General"))
       {
           if(area.equals("Dhaka"))
           {
               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-30000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                    else
                   result+=(tot*(.05));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                   result+=(tot*(.10));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                   result+=(tot*(.15));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                   result+=(tot*(.20));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.25);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);
           }
           else if(area.equals("Sylhet"))
           {

               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-30000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.02));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.04));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.06));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.10));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.20);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);

           }
           else
           {
               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-30000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.04));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.08));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.12));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.15));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.20);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);
           }
       }
       else if(catagory.equals("Female"))
       {
           if(area.equals("Dhaka"))
           {

               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-35000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.05));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.10));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.15));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.20));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.25);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);
           }
           else if(area.equals("Sylhet"))
           {
               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-35000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.02));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.04));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.06));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.10));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.20);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);
           }
           else
           {

               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-35000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.04));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.08));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.12));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.15));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.20);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);

           }
       }
       else
       {
           if(area.equals("Dhaka"))
           {
               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-40000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.05));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.10));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.15));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.20));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.25);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);
           }
           else if(area.equals("Sylhet"))
           {

               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-40000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.02));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.04));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.06));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.10));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.20);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);
           }
           else
           {

               Integer Yearlybasic=num2*12;
               Integer houserent=num3*12-(Yearlybasic/2);
               Integer other=num6*12;
               Integer conv=num4*12-40000;
               Integer fesival=num2*2;
               Integer tot=Yearlybasic+houserent+other+conv+fesival;
               Double result=0.0;
               Integer store=tot;
               if(tot>0)
               {
                   result+=0;
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=100000)
                       result+=5000;
                   else
                       result+=(tot*(.04));

                   tot-=100000;
               }
               if(tot>0)
               {
                   if(tot>=300000)
                       result+=30000;
                   else
                       result+=(tot*(.08));
                   tot-=300000;
               }
               if(tot>0)
               {
                   if(tot>=400000)
                       result+=60000;
                   else
                       result+=(tot*(.12));
                   tot-=400000;
               }
               if(tot>0)
               {
                   if(tot>=500000)
                       result+=100000;
                   else
                       result+=(tot*(.15));
                   tot-=500000;
               }
               if(tot>0)
               {

                   result+=(tot*.20);
                   tot=0;
               }
               model.addAttribute("Basic",Yearlybasic);
               model.addAttribute("House",houserent);
               model.addAttribute("Conv",conv);
               model.addAttribute("Other",other);
               model.addAttribute("Festival",fesival);
               model.addAttribute("Total",store);
               model.addAttribute("Tax",result);

           }
       }
       return "ViewResult";
   }

}
