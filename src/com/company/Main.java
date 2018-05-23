package com.company;

import java.util.Scanner;
import java.util.Timer;
public class Main {

    public static void main(String[] args) {

        StartGameSpace();
        
    }

    static void StartGameSpace ()
    {
        Scanner scan = new Scanner(System.in);
        Player User = new Player( scan );

        while (true)
        {
            int rng = (int)(Math.random() * 3 +1);
            System.out.print(rng);
        }

    }

    void SpawnDuck()
    {
        System.out.println("QUack");
    }
}
