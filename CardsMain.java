//main menu for cardsgames
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainMenu extends JFrame
{
    JButton GameOfCutJButton;
    JButton SolitaireJButton;
    JButton GofishJButton;
    JLabel CardGameJLabel;
    public void CreateUI()
    {
        Container contentPane=getContentPane();
        contentPane.setLayout(null);
        GameOfCutJButton=new JButton();
        GameOfCutJButton.setText("Game of Cut");
        GameOfCutJButton.setBounds(0,100,125,50);
        contentPane.add(GameOfCutJButton);
        CardGameJLabel=new JLabel();
        CardGameJLabel.setText("Main Menu");
        CardGameJLabel.setBounds(250,0,100,50);
        contentPane.add(CardGameJLabel);
        SolitaireJButton=new JButton();
        SolitaireJButton.setText("Solitaire");
        SolitaireJButton.setBounds(225,100,125,50);
        contentPane.add(SolitaireJButton);
        GofishJButton=new JButton();
        GofishJButton.setText("Go fish");
        GofishJButton.setBounds(459,100,125,50);
        contentPane.add(GofishJButton);
        GameOfCutJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent GameOfCutactionpressed) {
                GameOfCutGUI.Start();
            }
        });
        setTitle("Main Menu");
        setSize(600,600);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        MainMenu application = new MainMenu();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private MainMenu()
    {
        CreateUI();
    }
}
