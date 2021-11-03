/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballtournament;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author OMER
 */
public class Tournament {
    
    private static ArrayList<Team> teams = new ArrayList<Team>() ;
    
    public Tournament()
    {
        //teams = new ArrayList<Team>();
    }
    
    private static BufferedReader getReader(String filename) throws FileNotFoundException
    {
        return new BufferedReader(new FileReader(new File(filename)));
    }
    public static void generateTeams(String filename) throws FileNotFoundException, IOException
    {
        BufferedReader br = getReader(filename);
        String line;
        String [] splitted;
        String teamname="";
        Team tm = null;
        int flag = 0;
        
        while((line=br.readLine())!=null)
        {
            if(line.contains("-"))
            {
                //System.out.println(line);
                teamname = line.split("-")[1];
                tm = new Team(teamname);
                teams.add(tm);
            }

            else
            {
                splitted = line.split(" ");
                Player p = new Player(splitted[0], splitted[1], Integer.parseInt(splitted[2]));
                tm.addPlayer(p);
                //System.out.println(teamname);
            }
            
        }

    }
    public static void deletePoints()
    {
        for(Team t:teams)
        {
            t.setPoint(0);
        }
    }
    public static void beginTournament()
    {
        
        int numberofteams = teams.size();
        for(int playing_teams = 0;playing_teams<numberofteams;playing_teams++)
        {
            for(int played_teams = playing_teams+1;played_teams<numberofteams-1;played_teams++)
            {
                
               if(teams.get(playing_teams).getTotalPower() > teams.get(played_teams).getTotalPower())
               {
                   teams.get(playing_teams).increasePoint(teams.get(played_teams), 1);
                   teams.get(played_teams).increasePoint(teams.get(playing_teams), -1);
                   System.out.println(teams.get(playing_teams).getName()+":1-0:"+teams.get(played_teams).getName());
               }
               else if(teams.get(playing_teams).getTotalPower()==teams.get(played_teams).getTotalPower())
               {
                   teams.get(playing_teams).increasePoint(teams.get(played_teams), 0);
                   teams.get(played_teams).increasePoint(teams.get(playing_teams), 0);
                   System.out.println(teams.get(playing_teams).getName()+":0-0:"+teams.get(played_teams).getName());
               }
               else if(teams.get(playing_teams).getTotalPower()<teams.get(played_teams).getTotalPower())
               {
                   System.out.println(teams.get(playing_teams).getName()+":0-1:"+teams.get(played_teams).getName());
                   teams.get(playing_teams).increasePoint(teams.get(played_teams), -1);
                   teams.get(played_teams).increasePoint(teams.get(playing_teams), 1);
               }
            }
            
          
        }
        
    }
    public static ArrayList<Team> getResultsForTable()
    {
        Comparator<Team> c;
        c = (s1, s2) -> s2.getPoint()-s1.getPoint();
        teams.sort(c);
        return teams;
    }
    public static ArrayList<Team> getTeamsforComboBox()
    {
        return teams;
    }
    
    public static ArrayList<Player> getSpecificTeam(String teamName)
    {
       for(Team tm:teams)
       {
           if(tm.getName().equalsIgnoreCase(teamName))
               return tm.getPlayers();
       }
       return null;
    }
    
    
}
