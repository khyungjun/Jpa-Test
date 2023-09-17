package com.jpa.test.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.springboot.web.dto.TestDto;
import com.jpa.test.springboot.web.service.TestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
	
	private final TestService testService;

    @GetMapping("/test/{str}")
    public String test(@PathVariable String str) {
        TestDto res = testService.testServiceMethod(str);

        return "hello " + res.getTestStr() ;
    }
}
