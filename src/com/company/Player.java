package com.company;

import java.util.Scanner;

public class Player {
    int score;
    String Name;

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
        this.Name = scan.nextLine();
    }

    void addscore(int score)
    {
        this.score += score;
    }
    String GetName(){ return Name; }
    int getScore(){ return score; }

}
