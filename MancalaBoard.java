/*
    * Author: Lam Nguyen
    * Purpose: Demonstrate skills in the Java Language through the development of a mancala game,
      involving the use of several different concepts in Java.
    * Start: November 29, 2017
    * End: TBD
    *
    *
    *
    *
    *
    * Additional Information: User is prompt with the decision to play with an AI opponent
      or with a friend. If the choice of AI opponent is chosen, Player is first to go.
    * Additional Features: Ability for players to be able to play on different computers
*/
import javax.swing.*;
import java.awt.*;

public class MancalaBoard extends JFrame {

    private MancalaMainMenu main;
    private MancalaInstructions instruct;

    private CardLayout cardHold;
    public static void main(String[] args)
    {
        new MancalaBoard();
    }
    public MancalaBoard()
    {
        setTitle("Mancala");

        new MancalaMainMenu(this);
       

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }
    public void showAllPanels()
    {
        Container c = getContentPane();
        cardHold = new CardLayout();
        c.setLayout(cardHold);

        c.add(new MancalaMainMenu(this), "Main Menu");
        c.add(new MancalaInstructions(this), "Instructions");
    }
    public void showMainScreen()
    {
        new MancalaMainMenu(this);
        pack();
    }
    public void showInstructions()
    {
        cardHold.show(getContentPane(), "Instructions");
        pack();
    }



}

