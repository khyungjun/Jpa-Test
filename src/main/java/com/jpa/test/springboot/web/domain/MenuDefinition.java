package com.jpa.test.springboot.web.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "MENUDEFINITION")
public class MenuDefinition implements Serializable { //출처 : https://jeongsu.tistory.com/288
	
	@Getter
	@Setter
    @Id
    @Column(name = "MENUNAME")
    private String menuName;

	@Getter
	@Setter
    @Id
    @Column(name = "POSITION")
    private Long position;

	@Getter
	@Setter
    @Id
    @Column(name = "SUPERMENUNAME")
    private String superMenuName;

    public MenuDefinition() {
    }

    public MenuDefinition(String menuName, Long position, String superMenuName) {
        this.menuName = menuName;
        this.position = position;
        this.superMenuName = superMenuName;
    }
}