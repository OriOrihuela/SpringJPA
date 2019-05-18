package org.formacio.setmana2.repositori;

import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.stereotype.Repository;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Repository
public class RepositoriEscola {

    /* ---- Behaviours ---- */
    public Curs carregaCurs(String nom) {
        return null;
    }

    public Matricula apunta(String alumne, String curs) throws EdatIncorrecteException {
        return null;
    }


}
