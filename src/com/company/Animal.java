package com.company;

public class Animal {
    String Name, Type, Call;
    int Health;


    Animal( String Name, String Type, String Call , int hp)
    {
        this.Name = Name;
        this.Type = Type;
        this.Health = hp;
    }

    String Get_Name(){ return Name; }
    String Get_Type(){ return Type; }
    String Get_Call(){ return Call; }
    int Get_Hp (){ return Health; }

    void Take_Damage ( int Damage )
    {
        this.Health -= Damage;
    }


}
