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
            Animal huntee;
            int rng = (int)(Math.random() * 3 +1);

            switch (rng) {
                case 1:
                    huntee = new Duck ( "Daffy", 5 );
                    break;
                 case 2:
                    huntee = new Deer ( "Bambi", 10 );
                    break;

                default:
                    System.out.println( "Nothing Appeared" );
                    continue;
            }

            System.out.println( huntee.toString() );
            System.out.println( "Shoot (Y/N)?");
            String in = scan.nextLine();

            if( in.toCharArray()[0] == 'Y')
            {
                huntee.Take_Damage(100);
            }else
            {
                System.out.println(huntee.Get_Name() + " got away");
            }
        }

    }

    void SpawnDuck()
    {
        System.out.println("QUack");
    }
}
