package com.company;

public class Animal {
    private String Name, Type, Call;
    private int Health;


    Animal( String Name, String Type, String Call , int hp)
    {
        this.Name = Name;
        this.Type = Type;
        this.Health = hp;
    }

    public String Get_Name(){ return Name; }
    public String Get_Type(){ return Type; }
    public String Get_Call(){ return Call; }
    int Get_Hp (){ return Health; }

    void Take_Damage ( int Damage )
    {
        this.Health -= Damage;
        if (this.Health <= 0)
        {
            System.out.println( this.Name + " has died" );
        }
    }

    @Override
    public String toString()
    {
        return "Name: " + Name + " Health: " + Health;
    }
}
