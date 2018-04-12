import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MancalaInstructions extends JPanel implements ActionListener
{
    static MancalaBoard frame;
    public MancalaInstructions(MancalaBoard a)
    {
        JButton back = new JButton("Back");
        frame = a;
        JLabel tutorialTitle = new JLabel("Tutorial");
        tutorialTitle.setFont(new Font("Ubuntu", Font.BOLD, 32));

        setLayout(new BorderLayout());
        JPanel store = new JPanel();
        add(store, BorderLayout.CENTER);

        back.addActionListener(this);
        store.add(back);
    }
    public void actionPerformed(ActionEvent e)
    {
        frame.showMainScreen();
    }



}
