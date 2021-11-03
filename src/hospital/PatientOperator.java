/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author OMER
 */
public class PatientOperator {
    
    private static ArrayList<Patient> patients = new ArrayList<Patient>();
    
    public static void addPatient(Patient p)
    {
        patients.add(p);
    }
    
    public static String showPatients()
    {
        String s ="";
        for(Patient p:patients)
        {
            s = s + p.toString()+"\n";
        }
        return s;
    }
    
    
    
}
