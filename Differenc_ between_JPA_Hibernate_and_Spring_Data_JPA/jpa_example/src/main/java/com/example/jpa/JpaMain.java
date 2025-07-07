package com.example.jpa;

import jakarta.persistence.*;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(new Student("Sanjana"));
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
