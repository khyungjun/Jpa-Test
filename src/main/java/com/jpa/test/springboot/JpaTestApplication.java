package com.jpa.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaTestApplication {

	// 참고 : https://velog.io/@sheltonwon/Spring-Boot-MariaDB-JPA-%EA%B0%84%EB%8B%A8-%EC%98%88%EC%8B%9C
	public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}

}
