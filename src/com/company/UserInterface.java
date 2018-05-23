package com.company;

import javax.swing.*;

public class UserInterface {

    public void begin() {

        String Name = JOptionPane.showInputDialog(null, "*** Enter Name ***\n");
        Player user = new Player( Name );

        boolean finished = false;
        while (!finished) {
            int Selection = showMenu();

            switch (Selection) {
                case 1:
                    GoHunting(user);
                    break;
                case 2:
                    CheckScore(user);
                    break;
                case 3:
                    finished = true;
                    JOptionPane.showMessageDialog(null, "*** Program Ended ***\n" +
                            "*** Thank you for using this program ***");
                    break;
                default:
                    continue;
            }
        }
    }
    public int showMenu() {
        int selection = 0;
        String stringSelection = JOptionPane.showInputDialog (
                "******* MENU *******\n\n" +
                        "1. Go out and hunt\n" +
                        "2. Check Score\n" +
                        "3. Exit Program\n\n" +
                        "Type the number of your selection, and click OK: ");
        selection = Integer.parseInt (stringSelection.trim());
        return selection;
    }

    public void GoHunting(Player User)
    {
        Animal huntee;
        int rng = (int)(Math.random() * 2 + 1);
        switch (rng) {
            case 1:
                huntee = new Duck ( "Daffy", 5 );
                break;
            case 2:
                huntee = new Deer ( "Bambi", 10 );
                break;
            default:
                huntee = new Deer ( "Bambi", 10 );
                break;
        }
        int Shoot = JOptionPane.showConfirmDialog(null, "*** Animal appeard ***\n" +
                huntee.toString() + "\nShoot?");
        System.out.print(Shoot);
        if(Shoot == 0)
        {
            huntee.Take_Damage(100);
            JOptionPane.showMessageDialog( null, huntee.Get_Name() + " has died" + "\n" +
            "Added 5 points" );
            User.addscore( 5 );
        }else
        {
            JOptionPane.showMessageDialog( null, huntee.Get_Name() + " Got away");
        }

    }

    public void CheckScore(Player user)
    {
        JOptionPane.showMessageDialog( null, user.Name + " score: " + user.getScore());
    }
}
