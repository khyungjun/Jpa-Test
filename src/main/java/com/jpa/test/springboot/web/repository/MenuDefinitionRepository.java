package com.jpa.test.springboot.web.repository;

import java.util.List;

import com.jpa.test.springboot.web.domain.MenuDefinition;

public interface MenuDefinitionRepository {
	
    MenuDefinition create(MenuDefinition menuDefinition);
    
    List<MenuDefinition> readAll();
    
    // 추후 update
    
    // 추후 delete
}
