package com.jpa.test.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jpa.test.springboot.web.domain.MenuDefinition;
import com.jpa.test.springboot.web.service.MenuService;

@Controller
public class MenuDefinitionController {

    @Autowired
    private MenuService menuService;

    @PostMapping("menus")
    @ResponseBody
    public MenuDefinition addMenu(){
        MenuDefinition menuDefinition1 = new MenuDefinition();
        menuDefinition1.setMenuName("test1");
        menuDefinition1.setPosition(1L);
        menuDefinition1.setSuperMenuName("test");

        menuService.addMenu(menuDefinition1);

        return menuDefinition1;
    }

}
