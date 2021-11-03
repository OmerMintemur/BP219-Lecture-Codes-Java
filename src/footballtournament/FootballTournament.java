/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballtournament;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author OMER
 */
public class FootballTournament {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here
        
        Tournament t = new Tournament();
        t.generateTeams("Teams.txt");
        t.beginTournament();
        ArrayList<Team> temas = t.getResultsForTable();
        temas.forEach((l)->System.out.println(l.getName()+"-->"+l.getPoint()));
    }
    
}
