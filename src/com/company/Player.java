package com.company;

import java.util.Scanner;

public class Player {
    int score;
    String Name;
    double avgTime;

    Player( String n )
    {
        Name = n;
    }

    Player( Scanner scan )
    {
        CreatePlayer(scan);
    }

    void CreatePlayer(Scanner scan)
    {
        System.out.println("Plaese enter your name:");
        this.Name = scan.nextLine();
    }

    void addscore(int score)
    {
        this.score += score;
    }
    String GetName(){ return Name; }
    int getScore(){ return score; }

}
