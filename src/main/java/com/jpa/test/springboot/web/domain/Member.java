package com.jpa.test.springboot.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Member { //출처 : https://code-mania.tistory.com/119

	@Getter
	@Setter
	@Id
	@GeneratedValue
	private Long Id;

	@Getter
	@Setter
	private String username;
}
