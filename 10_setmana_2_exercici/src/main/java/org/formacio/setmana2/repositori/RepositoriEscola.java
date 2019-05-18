package org.formacio.setmana2.repositori;

import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Repository
public class RepositoriEscola {

    /* ---- Properties ---- */
    @PersistenceContext
    private EntityManager entityManager = null;


    /* ---- Getters ---- */
    public EntityManager getEntityManager() {
        return entityManager;
    }

    /* ---- Behaviours ---- */
    public Curs carregaCurs(String nom) {
        Curs curs = getEntityManager().find(Curs.class, nom);
        return curs;
    }

    public Matricula apunta(String alumne, String curs) throws EdatIncorrecteException {
        return null;
    }


}
