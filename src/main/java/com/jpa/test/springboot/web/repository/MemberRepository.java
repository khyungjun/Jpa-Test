package com.jpa.test.springboot.web.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jpa.test.springboot.web.domain.Member;

@Repository
public class MemberRepository {

  @PersistenceContext
  private EntityManager em;

  public Long save(Member member) {
    em.persist(member);
    return member.getId();
  }

  public Member find(Long id) {
    return em.find(Member.class, id);
  }
}

/*
Spring Data JPA에서 EntityManager를 직접 사용하고싶은 경우
@PersistenceContext annotation과 함께 EntityManager를 선언하면
Spring Boot가 Entity Manager를 주입해준다.

참고로 순수 JPA만 사용하면 직접 선언해야하는 EntityManagerFactory는
application.yml(또는 .properties)로부터 설정을 읽어와서 자동으로 생성되고,
이렇게 생성된 EntityManagerFactory로부터 EntityManager도 자동으로 생성 및 주입된다.
또한 예시로 save method와 find 메서드가 만들어져있다.

보통 Spring data jpa를 사용하면 JpaRepository를 상속받는 interface를 만든다.
그리고 해당 interface는 기본적인 CRUD 기능을 제공해주므로 위와 같은 메서드들은 딱히 필요가 없다.
하지만 이 글은 내 공부의 복습차원이므로 그냥 만들어봤다~ 자 이제 위 클래스의 테스트 코드를 작성해보자~
*/
