package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.beans.*;

@Controller
public class StudentRegisterController {
    @RequestMapping(method = RequestMethod.POST,value ="/register/student")
    @ResponseBody
    studentRegistrationReply registerStudent(@RequestBody studentRegisteration studentregd) {

        studentRegistrationReply stdregreply = new studentRegistrationReply();
        stdregreply.setName(studentregd.getName());
        stdregreply.setAge(studentregd.getAge());
        stdregreply.setregisterationNumber("12345678");
        stdregreply.setregisterationStatus("Successful");
        return stdregreply;
    }
}
