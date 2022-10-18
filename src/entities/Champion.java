	package entities;

public class Champion
{
    private String name;
    private int life;
    private int attack;
    private int armor;
    
    public Champion(String name, int life, int attack, int armor)
    {this.name = name; this.life = life; this.attack = attack;
     this.armor = armor;}
    
    public void setName(String name)
    {this.name = name;}
    
    public String getName()
    {return name;}
    
    public void setLife(int life)
    {this.life = life;}
    
    public int getLife()
    {return life;}
    
    public void setAttack(int attack)
    {this.attack = attack;}
    
    public int getAttack()
    {return attack;}
    
    public void setArmor(int armor)
    {this.armor = armor;}
    
    public int getArmor()
    {return armor;}    
    
    public void takeDamage(Champion other)
    { 
    	if(armor < other.attack)
    	   life -= other.attack - armor;
    	else 
    	   life -= 1;
    } 
    
    public String status()
    {return name + ": " + life + " de vida";}
}
