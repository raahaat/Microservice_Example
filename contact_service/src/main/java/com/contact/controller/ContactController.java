package com.contact.controller;

import com.contact.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/test")
public class ContactController {

    @PostMapping("/do")
    public Test display(@RequestBody Test test1){
       Test test2 = test1.setI(test1.getI());
         test1.setDate(new Date());
//       return test2;
//        int result = test1.getI();
//        Date date = new Date();

        return test1;
    }
}
