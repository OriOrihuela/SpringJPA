package org.formacio.setmana2.domini;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_alumnes")
public class Alumne {

    /* ---- Properties ---- */
    @Id
    @Column(name = "alu_nom")
    private String nom = null;
    @Column(name = "alu_edat")
    private int edat = 0;


    /* ---- Getters ---- */
    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }


    /* ---- Setters ---- */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
}
