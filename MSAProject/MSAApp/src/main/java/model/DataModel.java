/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.BookMaster;
import java.util.Collection;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Named
//@Stateless  // in case of JTA
public class DataModel {
    @PersistenceContext(unitName = "msapu")
    EntityManager em;

//    public DataModel() {
//        em = Persistence.createEntityManagerFactory("msapu").createEntityManager();
//    }
    
    
    
    public Collection<BookMaster> getAllBooks()
    {
        return em.createNamedQuery("BookMaster.findAll").getResultList();
    }
    
//    public void insertBook(BookMaster bm)
//    {
//        // With JTA transaction methods not required
//       // em.getTransaction().begin(); // with out JTA
//        em.persist(bm);
//        //em.getTransaction().commit(); // without JTA
//    }
    
}
