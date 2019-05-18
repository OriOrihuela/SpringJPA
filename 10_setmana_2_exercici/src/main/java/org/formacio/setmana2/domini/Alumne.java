package org.formacio.setmana2.domini;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

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


    /* ---- Behaviours ---- */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumne)) return false;
        Alumne alumne = (Alumne) o;
        return Objects.equals(nom, alumne.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
