/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballtournament;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author OMER
 */
public class Team {
    
    private ArrayList<Player> players;
    private String name;
    private HashMap history;
    private int point;
    
    public Team(String name)
    {
        this.name = name;
        players = new ArrayList<Player>();
        history = new HashMap();
        point = 0;
        
    }
    
    public void addPlayer(Player p)
    {
        this.players.add(p);
    }
    public void increasePoint(Team t, int result)
    {
        history.put(t.getName(), result);
        if (result==1)
        {
            this.point+=3;
        }
        else if (result==0)
        {
            this.point+=1;
        }
        else
        {
            this.point+=0;
        }
    }
    public ArrayList<Player> getPlayers()
    {
        return this.players;
    }
    

    public int getPoint()
    {
        return this.point;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getTotalPower()
    {
       int sum = 0;
       for(Player p:players)
       {
           sum+=p.getPower();
       }
       return (int) sum;
    }
    
    public void setPoint(int point)
    {
        this.point = point;
    }
    
    
}
