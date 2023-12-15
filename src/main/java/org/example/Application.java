package org.example;

import DAO.ElementDAO;
import entites.Books;
import entites.Element;
import entites.Magazine;
import entites.Periodicity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.Year;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U1W3L4 - PROGETTO SETTIMANALE - LIBRERIA JPA");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        ElementDAO ed = new ElementDAO(em);

        Books CimeTempestose = new Books("Cime Tempestose", 1847, 580, "Emily Bronte", "Romanzo");
        Books NinteenEightyFour = new Books("1984", 1949, 500, "George Orwell", "Romanzo");
        Books IlRitrattoDiDorianGrey = new Books("Il ritratto di Dorian Grey", 1890, 430, "Oscar Wild", "Romanzo");
        Books IlPiccoloPrincipe = new Books("Il Piccolo Principe", 1843, 210, "Antoine de Saint-Exupéry", "Racconto");
        Magazine Internazionale = new Magazine("Internazionale", 1993, 80, Periodicity.WEEKLY);
        Magazine Focus = new Magazine("Focus", 1992, 50, Periodicity.MONTHLY);
        Magazine Vogue = new Magazine("Vogue", 1982, 60, Periodicity.MONTHLY);

//        ed.addElement(CimeTempestose);
//        ed.addElement(NinteenEightyFour);
//        ed.addElement(IlRitrattoDiDorianGrey);
//        ed.addElement(IlPiccoloPrincipe);
//        ed.addElement(Internazionale);
//        ed.addElement(Focus);
//        ed.addElement(Vogue);

//        ed.removeElementByISBN(3122094b-1a4b-45d8-b307-b0baaafbea0b);

//        ed.findByYear(1993).forEach(System.out::println);



    }
}
