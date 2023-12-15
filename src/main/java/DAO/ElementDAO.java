package DAO;

import entites.Element;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.UUID;

public class ElementDAO {
    private final EntityManager em;

    public ElementDAO(EntityManager em) {
        this.em = em;
    }

    public void addElement(Element element){
        EntityTransaction transiction = em.getTransaction();
        transiction.begin();
        em.persist(element);
        transiction.commit();
        System.out.println("Elemento salvato correttamente");
    }

    public void removeElementByISBN(UUID ISBN){
        Element found = em.find(Element.class, ISBN);
        if(found != null){
            EntityTransaction transiction = em.getTransaction();
            transiction.begin();
            em.remove(found);
            transiction.commit();
            System.out.println("L'elemento è stato cancellato correttamente");
        } else {
            System.err.println("L'elemento con codice ISBN " + ISBN + " non è stato trovato");
        }
    }

    public List<Element> findByYear(int pubblicationYear){
        TypedQuery<Element> getElementByYear = em.createNamedQuery("findByYear", Element.class);
        getElementByYear.setParameter("year", pubblicationYear);
        return getElementByYear.getResultList();
    }

    public List<Element> finByAuthor(String author){
        TypedQuery<Element> getElementByAuthor = em.createNamedQuery("findByAuthor", Element.class);
        getElementByAuthor.setParameter("author", author);
        return getElementByAuthor.getResultList();
    }

    public  List<Element> findByTitle(String title){
        TypedQuery<Element> getElementByTitle = em.createNamedQuery("findByTitle", Element.class);
        getElementByTitle.setParameter("partialName", "%" + title + "%");
        return getElementByTitle.getResultList();
    }
}
