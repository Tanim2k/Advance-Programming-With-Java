package com.controller;

import com.domain.LeaveApplication;
import com.service.LeaveApplicationService;
import com.service.LeaveTypeService;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/ibrahim")
public class LeaveApplicationController {

    private LeaveApplicationService leaveApplicationService;

    private LeaveTypeService leaveTypeService;



    public LeaveApplicationController(LeaveApplicationService leaveApplicationService, LeaveTypeService leaveTypeService /*StudentService studentService*/) {
        this.leaveApplicationService = leaveApplicationService;
        this.leaveTypeService = leaveTypeService;

    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


    @PostMapping(path = "/SaveValues")
    public void create(@Valid @RequestBody LeaveApplication leaveApplication) throws Exception {


        boolean result = leaveApplicationService.insert(leaveApplication);

    }


    @GetMapping("/leaveApplication/{id}")
    public LeaveApplication get(@PathVariable("id") Long id) {
        LeaveApplication leaveApplication = leaveApplicationService.get(id);
        return leaveApplication;
    }


    @RequestMapping("/leaveApplications")
    public  List<LeaveApplication> getAll() {

        List<LeaveApplication> leaveApplication = leaveApplicationService.getALL();
        return leaveApplication;
    }



    @PutMapping ("/leaveApplication/{id}")
    public void update(@Valid @RequestBody LeaveApplication leaveApplication,@PathVariable("id") Long id) throws Exception {

        boolean result = leaveApplicationService.update(leaveApplication,id);

    }
    @DeleteMapping("/leaveApllication/{id}")
    public boolean delete(@PathVariable("id") Long id) {
       leaveApplicationService.delete(id);
        return  true;

    }
}
