package com.jpa.test.springboot.web.domain;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EnableJpaAuditing
@EntityListeners(AuditingEntityListener.class)
public class Test { //출처 : https://velog.io/@sheltonwon/Spring-Boot-MariaDB-JPA-%EA%B0%84%EB%8B%A8-%EC%98%88%EC%8B%9C
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer testId;

    @Column(length = 100)
    private String testContents;

    @Builder
    public Test(Integer testId, String testContents) {
        this.testId = testId;
        this.testContents = testContents;
    }
}