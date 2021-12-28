package com.user.controller;

import com.user.model.Test;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @PostMapping("/do")
    public int display(@RequestBody Test test ){
      int value = test.getI();
      return value;
    }
}
