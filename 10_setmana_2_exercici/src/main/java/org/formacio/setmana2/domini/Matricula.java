package org.formacio.setmana2.domini;

import javax.persistence.*;

@Entity
@Table(name = "t_matricules")
public class Matricula {

    /* ---- Properties ---- */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mat_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "mat_alumne")
    private Alumne alumne;
    @OneToOne
    @JoinColumn(name = "mat_curs")
    private Curs curs;


    /* ---- Getters ---- */
    public Long getId() {
        return id;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public Curs getCurs() {
        return curs;
    }


    /* ---- Setters ---- */
    public void setId(Long id) {
        this.id = id;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }
}
