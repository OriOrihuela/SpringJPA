package org.formacio.setmana2.domini;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_cursos")
public class Curs {

    /* ---- Properties ---- */
    @Id
    @Column(name = "cur_nom")
    private String nom = null;
    @Column(name = "cur_edatminima")
    private int edatMinima = 0;


    /* ---- Getters ---- */
    public String getNom() {
        return nom;
    }

    public int getEdatMinima() {
        return edatMinima;
    }


    /* ---- Setters ---- */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdatMinima(int edatMinima) {
        this.edatMinima = edatMinima;
    }
}
