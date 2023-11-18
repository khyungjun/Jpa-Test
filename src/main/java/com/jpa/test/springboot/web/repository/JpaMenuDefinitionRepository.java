package com.jpa.test.springboot.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.test.springboot.web.domain.MenuDefinition;

@Repository
public class JpaMenuDefinitionRepository implements MenuDefinitionRepository{

    @Autowired
    private EntityManagerFactory emf;
    private EntityManager em;

    @Override
    public MenuDefinition create(MenuDefinition menuDefinition) {
        try {

            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            try{
                em.persist(menuDefinition);
                System.out.println("menuName : " + menuDefinition.getMenuName());
                System.out.println("position : " + menuDefinition.getPosition());
                System.out.println("supermenuName : " + menuDefinition.getSuperMenuName());
                tx.commit();
            }
            catch (Exception e){
                tx.rollback();
                System.out.println(e.getMessage());
            }
            finally {
                em.clear();
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return menuDefinition;
    }

    @Override
    public List<MenuDefinition> readAll() {
        return null;
    }
}
