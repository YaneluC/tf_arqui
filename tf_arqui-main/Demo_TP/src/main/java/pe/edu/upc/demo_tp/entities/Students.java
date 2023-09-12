package pe.edu.upc.demo_tp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStudents;
    @Column(name = "codUniversity",length = 60,nullable = false)
    private String codUniversity;
    @Column(name = "idPerson",length = 60,nullable = false)
    private int idPerson;
    @Column(name = "codStudents",length = 60,nullable = false)
    private String codStudents;
    @Column(name = "codCareer",length = 60,nullable = false)
    private String codCareer;

    public Students() {
    }

    public Students(int idStudents, String codUniversity, int idPerson, String codStudents, String codCareer) {
        this.idStudents = idStudents;
        this.codUniversity = codUniversity;
        this.idPerson = idPerson;
        this.codStudents = codStudents;
        this.codCareer = codCareer;
    }

    public int getIdStudents() {
        return idStudents;
    }

    public void setIdStudents(int idStudents) {
        this.idStudents = idStudents;
    }

    public String getCodUniversity() {
        return codUniversity;
    }

    public void setCodUniversity(String codUniversity) {
        this.codUniversity = codUniversity;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getCodStudents() {
        return codStudents;
    }

    public void setCodStudents(String codStudents) {
        this.codStudents = codStudents;
    }

    public String getCodCareer() {
        return codCareer;
    }

    public void setCodCareer(String codCareer) {
        this.codCareer = codCareer;
    }
}
