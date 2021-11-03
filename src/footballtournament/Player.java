/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballtournament;

import java.util.Random;

/**
 *
 * @author OMER
 */
public class Player {
    
    private String name;
    private String surname;
    private int number;
    private long power;
    
    public Player(String name, String surname, int number)
    {
        this.name = this.setName(name);
        this.surname = this.setSurname(surname);
        this.number = this.setNumber(number);
        this.power = this.setPower();
    }
    private int setNumber(int number)
    {
        if(number>99||number<0)
        {
            System.out.println("Player number is invalid, please enter between 0-99");
            return -1;
        }
        return number;
        
    }
    
    private String setName(String name)
    {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
    
    private String setSurname(String surname)
    {
        return surname.substring(0, 1).toUpperCase() + surname.substring(1);
    }
    
    private long setPower()
    {
        return 1L + (long) (Math.random() * (10L - 1L));
    }
    public long getPower()
    {
        return this.power;
    }
    public String getName()
    {
        return this.name;
    }
    public String getSurname()
    {
        return this.surname;
    }
    public int getNumber()
    {
        return this.number;
    }
    
    public String toString()
    {
        return "[ "+this.getName()+", "+this.getSurname()+", "+this.getNumber()+", "+this.getPower()+" ]";
    }
    
}
