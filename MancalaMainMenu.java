import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MancalaMainMenu extends JPanel implements ActionListener
{
    final JButton quitButton = new JButton("Exit");                               //Button to exit the program
    final JButton singlePlayer = new JButton("Single Player v. AI");              //Button for one players option
    final JButton twoPlayers  = new JButton("Two players");                       //Button for two players option
    final JButton instruction  = new JButton("Instructions");                     //Button for instructions
    final MancalaBoard frame;

    public MancalaMainMenu(MancalaBoard b)
    {
        /*Declarations*/
        frame = b;

        //Frame to hold button
        setLayout(new BorderLayout());
        final JLabel title = new JLabel("Mancala", JLabel.CENTER);                    //Title of Game
        JPanel center = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel subCenter = new JPanel(new GridLayout(4,1));                     //Stores the 3 buttons to end or start game

        /*Start Below*/
        title.setFont(new Font("Ubuntu", Font.BOLD, 32) );
        frame.add(title, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

        subCenter.add(singlePlayer);
        subCenter.add(twoPlayers);
        subCenter.add(instruction);
        subCenter.add(quitButton);

        center.add(subCenter);
        center.setBackground(new Color(136,249,249));

        quitButton.addActionListener(this);
        singlePlayer.addActionListener(this);
        twoPlayers.addActionListener(this);
        instruction.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click == quitButton) {
            System.exit(0);
        }
        if (click == instruction) {
            frame.showInstructions();
        }
        if (click == singlePlayer) {
        }
        if (click == twoPlayers) {
        }
    }

}
