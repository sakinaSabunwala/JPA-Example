/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javajpademo.Main;

import com.mycompany.javajpademo.Entity.HelloWorld;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author sakina
 */
public class Demo {

    private static EntityManager em;

    public static void main(String[] args) {

       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManager");
        em = emf.createEntityManager();

        //storing data in table
        em.getTransaction().begin();
        HelloWorld helloWorld = new HelloWorld();

        helloWorld.setMessage("music is life");

        em.persist(helloWorld);
        em.flush();
        em.getTransaction().commit();
        
        
        //retrieve data'
        Query query = em.createQuery("SELECT m FROM HelloWorld m" , HelloWorld.class);
        List<HelloWorld> message = query.getResultList();
        
        for(HelloWorld m : message){
            System.out.println("MESSAGE:" + m);
        }
        
        
        
        em.close();
    }

}
