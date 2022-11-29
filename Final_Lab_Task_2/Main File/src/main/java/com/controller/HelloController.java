package com.controller;

import com.domain.Currency;
import com.domain.LeaveApplication;
import com.domain.LeaveType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.LeaveApplicationService;
import com.service.LeaveTypeService;
import com.service.StudentService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/hello")
public class HelloController {



    @RequestMapping("/currency/{from}/to/{to}")
    public Currency rate(@PathVariable("from")String from, @PathVariable("to") String to) throws IOException {
        Currency curr = new Currency();
        if(from.equals("USD") && to.equals("BDT")){
            curr.setRate(101.2);
        } else if (from.equals("BDT") && to.equals("USD")) {
            curr.setRate(0.12);
        }
        else{
            curr.setRate(0.0);
        }

        return curr;
    }


}
