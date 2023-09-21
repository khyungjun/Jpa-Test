package com.jpa.test.springboot.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jpa.test.springboot.web.dto.TestDto;
import com.jpa.test.springboot.web.repository.TestRepository;

import lombok.RequiredArgsConstructor;

@Service
@Component
@RequiredArgsConstructor
public class TestService {
	
    private final TestRepository testRepository;

    public TestDto testServiceMethod(String str) {
        TestDto testDto = new TestDto(str);

        return testDto;
    }

}
