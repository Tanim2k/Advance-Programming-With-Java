package com.service;

import com.domain.leaveApplication;
import com.domain.leaveType;
import com.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Transactional
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public void insert( ) throws SQLException {
        leaveApplication lapplication = new leaveApplication();
        leaveType obj = new leaveType();



        obj.setCategory("XYZ");
        obj.setTotalDays(6);
        obj.setl_id(3);

        lapplication.setId(2);
        lapplication.setFromDate("12th Nov 2022");
        lapplication.setReason("Fever");
        lapplication.setTotalDate(6);
        lapplication.setToDate("18th Nov 2022");
        lapplication.setLeaveT(obj);

        studentRepository.create(lapplication);





    }
}