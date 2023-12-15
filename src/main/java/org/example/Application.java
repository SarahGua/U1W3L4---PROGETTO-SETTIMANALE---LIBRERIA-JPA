package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U1W3L4 - PROGETTO SETTIMANALE - LIBRERIA JPA");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
    }
}
