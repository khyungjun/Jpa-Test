package com.jpa.test.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.springboot.web.domain.MenuDefinition;
import com.jpa.test.springboot.web.repository.MenuDefinitionRepository;

@Service
public class MenuService {

    @Autowired
    private MenuDefinitionRepository menuDefinitionRepository;

    public MenuDefinition addMenu(MenuDefinition menuDefinition){
        return menuDefinitionRepository.create(menuDefinition);
    }
}
