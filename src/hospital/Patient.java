/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author OMER
 */
public class Patient {
    private String name;
    private String surname;
    private String disease;
    private String doctorName;

    public Patient(String name, String surname, String disease, String doctorName) {
        this.name = name;
        this.surname = surname;
        this.disease = disease;
        this.doctorName = doctorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", surname=" + surname + ", disease=" + disease + ", doctorName=" + doctorName + '}';
    }
    
    
}
