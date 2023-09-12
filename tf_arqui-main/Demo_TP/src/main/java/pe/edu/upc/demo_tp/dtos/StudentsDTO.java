package pe.edu.upc.demo_tp.dtos;

import javax.persistence.Column;

public class StudentsDTO {
    private int idStudents;
    private String codUniversity;
    private int idPerson;
    private String codStudents;
    private String codCareer;

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
