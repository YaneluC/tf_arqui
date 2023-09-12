package pe.edu.upc.demo_tp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStudents;
    @Column(name = "idPerson",length = 60,nullable = false)
    private int idPerson;
    @Column(name = "codStudents",length = 60,nullable = false)
    private String codStudents;

    public Students() {
    }

    public Students(int idStudents, int idPerson, String codStudents) {
        this.idStudents = idStudents;
        this.idPerson = idPerson;
        this.codStudents = codStudents;
    }

    public int getIdStudents() {
        return idStudents;
    }

    public void setIdStudents(int idStudents) {
        this.idStudents = idStudents;
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

}
