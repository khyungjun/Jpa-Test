package com.jpa.test.springboot.web.repository;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.test.springboot.web.domain.Member;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    public void test() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("memberA");

        //when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);

        //then
       Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
    }
}

/*
너무나 당연하게도 EntityManager는 트랜잭션 내에서만 동작할 수 있다.

DB로 select문만 나갈 때는 트랜잭션이 없어도 된다.
이러한 트랜잭션을 직접 생성 및 시작하고
에러 여부에 따라 커밋이나 롤백을 하는 부분을 직접 코드로 작성할 수도 있지만,

@Transactional Annotation을 사용하면 Spring Boot가 대신 해준다.
이렇게 트랜잭션을 관리해주는 @Transactional이 없다면 위 코드에서는 에러가 난다.

또한 @Transactional이 @Test와 함께 사용될 경우 test 메서드가 끝난 뒤
자동으로 rollback된다. 이렇게 편한 @Transactional을 놔두고
굳이 직접 트랜잭션 관련 설정 코드를 작성할 필요는 없을 것이다.

이 Annotation은 javax와 org.springframework, 2군데에서 제공하고 있다.
이 중 유용한 설정들이 많은 org.springframework에서 제공하는 @Transactional이 권장된다.
*/