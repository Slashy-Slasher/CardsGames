import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GameOfCutGUI extends JFrame
{
    static char[] charSuits={'H','C','D','S'};        //arrays for the character equivalents of the suit and face values of a card
    static char[] charfaces={'A','2','T','J','Q','K'};//arrays for the character equivalents of the suit and face values of a card
    private JButton StartJButton;                 //starts the game sequence, clears text fields, resets cards, creates new deck
    private JButton Player1SelectJButton;         //Jbutton that records a player's card choice, disables or enables the other player's button and textfield
    private JButton Player2SelectJButton;         //Jbutton that records a player's card choice, disables or enables the other player's button and textfield
    private JTextField Player1JTextfield;         //takes input from the players and uses it to summon the proper card face and to compare card value to check for winner
    private JTextField Player2JTextfield;         //takes input from the players and uses it to summon the proper card face and to compare card value to check for winner
    private JLabel Player1CardJLabelIcon;         //displays card backs and card faces
    private JLabel Player2CardJLabelIcon;         //displays card backs and card faces
    private JLabel Player1JLabel;                 //tells the user to draw from 0 to 50 or from the other player's card +1 to 51
    private JLabel Player2JLabel;                 //tells the user to draw from 0 to 50 or from the other player's card +1 to 51
    ImageIcon CardBack = new ImageIcon("C:\\Users\\amort\\Desktop\\red_back-resized.png");//Icon for the back of the card, displayed when no face value is available-the beginning of a game
    public void CreateUserInterface()
    {
        Card [] Deck=new Card[52];                                            //create a new card deck
        Container contentPane=getContentPane();                               //new content pane
        contentPane.setLayout(null);                                          //set layout null
        Font Textfont = new Font("comic sans MS", Font.ITALIC,15);//used to change the font of the jlables that display the range
        StartJButton = new JButton();                                         //start jbutton used to reset the game as well
        StartJButton.setText("Start");                                        //set text to an appropriate string
        StartJButton.setBounds(250,0,100,50);            //set bounds to an appropriate position
        contentPane.add(StartJButton);                                        //add the Jelement to the content pane
        Player1SelectJButton = new JButton();                                 //create a new button for player1's action
        Player1SelectJButton.setText("Player 1 Select");                      //set text to an appropriate string
        Player1SelectJButton.setBounds(25,100,150,50);   //set bounds to an appropriate position
        Player1SelectJButton.setEnabled(false);                               //disable player1's button
        contentPane.add(Player1SelectJButton);                                //add the Jelement to the content pane
        Player2SelectJButton = new JButton();                                 //button for player2's actions
        Player2SelectJButton.setText("Player 2 Select");                      //set text to an appropriate string
        Player2SelectJButton.setBounds(410,100,150,50);   //set bounds to an appropriate position
        Player2SelectJButton.setEnabled(false);                               //disable player2's button
        contentPane.add(Player2SelectJButton);                                //add the Jelement to the content pane
        Player1JTextfield = new JTextField();                                 //new text field to input a card value
        Player1JTextfield.setBounds(25,200,150,50);       //set bounds to an appropriate position
        Player1JTextfield.setEditable(false);                                 //disable the text field
        contentPane.add(Player1JTextfield);                                   //add the Jelement to the content pane
        Player2JTextfield = new JTextField();                                 //textfield to input a card value
        Player2JTextfield.setBounds(410,200,150,50);      //set bounds to an appropriate position
        Player2JTextfield.setEditable(false);                                 //disable the textfield
        contentPane.add(Player2JTextfield);                                   //add the Jelement to the content pane
        Player1CardJLabelIcon = new JLabel();                                 //label to display the card for player1
        Player1CardJLabelIcon.setBounds(0,250,200,306);   //set bounds to an appropriate position
        Player1CardJLabelIcon.setIcon(CardBack);                              //set the image of the card to the red card back
        contentPane.add(Player1CardJLabelIcon);                               //add the Jelement to the content pane
        Player2CardJLabelIcon = new JLabel();                                 //lebel to display the icon image of the card of player2
        Player2CardJLabelIcon.setBounds(385,250,200,306);//set bounds to an appropriate position
        Player2CardJLabelIcon.setIcon(CardBack);                              //setting the image of the icon to the red card back
        contentPane.add(Player2CardJLabelIcon);                               //add the Jelement to the content pane
        Player1JLabel = new JLabel();                                         //lable to display the range of player 1
        Player1JLabel.setText("Select from 0 to 50");                         //set text to an appropriate string
        Player1JLabel.setBounds(30,175,150,25);           //set bounds to an appropriate position
        Player1JLabel.setFont(Textfont);                                      //setting the font of the label to comic sans MS
        Player1JLabel.setVisible(false);                                      //hiding the label
        contentPane.add(Player1JLabel);                                       //add the Jelement to the content pane
        Player2JLabel = new JLabel();                                         //label to show the range of player 2
        Player2JLabel.setText("Select from x to 51");                         //set text to an appropriate string
        Player2JLabel.setBounds(415,175,150,25);          //set bounds to an appropriate position
        Player2JLabel.setFont(Textfont);                                      //setting the font of the label to comic sans MS
        Player2JLabel.setVisible(false);                                      //hiding the label
        contentPane.add(Player2JLabel);                                       //add the Jelement to the content pane
        StartJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent StartActionPerformed) {
                StartJButton.setEnabled(false);                                 //disable the start button
                Player1SelectJButton.setEnabled(true);                          //enable player1's button
                Player1CardJLabelIcon.setIcon(CardBack);                        //reset the card icons
                Player2CardJLabelIcon.setIcon(CardBack);                        //reset the card icons
                Player1JTextfield.setText("");                                  //reset the jtextfields
                Player2JTextfield.setText("");                                  //reset the jtextfields
                initDeck(Deck);                                                 //create, initialize, populate, randomize, and shuffle a new deck
                DumpDeck(Deck);                                                 //create, initialize, populate, randomize, and shuffle a new deck
                PopDeck(Deck);                                                 //create, initialize, populate, randomize, and shuffle a new deck
                DumpDeck(Deck);                                                 //create, initialize, populate, randomize, and shuffle a new deck
                randomizeDeck(Deck);                                            //create, initialize, populate, randomize, and shuffle a new deck
                DumpDeck(Deck);                                                 //create, initialize, populate, randomize, and shuffle a new deck
                ShuffleDeck(Deck);                                              //create, initialize, populate, randomize, and shuffle a new deck
                DumpDeck(Deck);                                                 //create, initialize, populate, randomize, and shuffle a new deck
                Player1JLabel.setVisible(true);                                 //set p1's label to visible
                Player1JTextfield.setEditable(true);                            //set p1's text box to be editable
                Player2JTextfield.setEditable(false);                           //disable p2's text box
            }
        });
        Player1SelectJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Player1SelectActionPerformed) {
                if(Integer.valueOf(Player1JTextfield.getText())<0)                                                                                                //if player1 chose a card below zero,
                {
                    JOptionPane.showMessageDialog(null,"Cannot draw from less than zero!","Error!",JOptionPane.INFORMATION_MESSAGE);//disallow them to continue playing
                }
                else if(Integer.valueOf(Player1JTextfield.getText())>50)                                                                                          //if player 1 chose a card above 50
                {
                    JOptionPane.showMessageDialog(null,"Not Allowed to draw above 50!","Error!", JOptionPane.INFORMATION_MESSAGE);  //disallow them to continue playing
                }
                else{
                    Player1CardJLabelIcon.setIcon(GetCardface(Integer.valueOf(Player1JTextfield.getText()),Deck));                                                //if player 1 chose a card between the designated constraints
                    Player1SelectJButton.setEnabled(false);                                                                                                       //disable their button
                    Player2SelectJButton.setEnabled(true);                                                                                                        //enable player2's button
                    Player1JLabel.setVisible(false);                                                                                                              //hide layer1's label
                    Player2JLabel.setVisible(true);                                                                                                               //show player2's label
                    Player2JLabel.setText("Select from "+(Integer.valueOf(Player1JTextfield.getText())+1)+" to 51");                                              //set player2's text to allow them to chose between p1's card+1 and 51
                    Player1JTextfield.setEditable(false);                                                                                                         //disable player1's text field
                    Player2JTextfield.setEditable(true);                                                                                                          //enable p2's text field
                }
            }
        });
        Player2SelectJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Player2SelectActionPerformed) {
                if(Integer.valueOf(Player2JTextfield.getText())<Integer.valueOf(Player1JTextfield.getText())+1)                                                       //if the player 2's chosen card value is below that of player 1's card
                {
                    JOptionPane.showMessageDialog(null,"Cannot draw from card below Player1!","Error!",JOptionPane.INFORMATION_MESSAGE);//disallow player2 to continue playing
                }
                else if(Integer.valueOf(Player2JTextfield.getText())>51)                                                                                              //if player2's chosen card is greater than 51
                {
                    JOptionPane.showMessageDialog(null,"Cannot draw above 51!","Error!",JOptionPane.INFORMATION_MESSAGE);               //disallow player2 to continue playing
                }
                else{
                    Player2SelectJButton.setEnabled(false);                                                                                                           //if player 2's card value is within the designated restrictions, disable their button
                    Player2JLabel.setVisible(false);                                                                                                                  //hide their label
                    StartJButton.setEnabled(true);                                                                                                                    //re-enable the start button
                    Player2CardJLabelIcon.setIcon(GetCardface(Integer.valueOf(Player2JTextfield.getText()),Deck));                                                    //set the card icon the the player's chosen card
                    WinCondition(Integer.valueOf(Player1JTextfield.getText()),Integer.valueOf(Player2JTextfield.getText()),Deck);                                     //check to see who won the game
                }
            }
        });
        setTitle("GameOfCutGUI");                                                                                                                                     //display the window with an appropriate size and title
        setSize(600,600);                                                                                                                               //display the window with an appropriate size and title
        setVisible(true);                                                                                                                                             //display the window with an appropriate size and title
    }
    private static ImageIcon GetCardface(int CardNum, Card[] Deck)                                                                                                                                            //Used to get the icon image of a card's face and suit value
    {
        ImageIcon ReturnedIcon=new ImageIcon();                                                                                                                                                               //icon which is returned to the jlabelicon
        if(Deck[CardNum].getvalue()==9 || Deck[CardNum].getvalue()==11 || Deck[CardNum].getvalue()==12 || Deck[CardNum].getvalue()==13 || Deck[CardNum].getvalue()==10 || Deck[CardNum].getvalue()==1)        //if the card has a value of A,J,Q,k,T or 2
        {
            ImageIcon CardIcon = new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[CardNum]))+charSuits[Deck[CardNum].getSuit()]+"resized.png");//find the icon value of the card based on the character face and suit values of the card
            ReturnedIcon=CardIcon;                                                                                                                                                                            //display the icon value of this card
        }
        else{
            ImageIcon CardIcon=new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(Deck[CardNum].getvalue())+charSuits[Deck[CardNum].getSuit()]+"resized.png");         //find the icon value of the card based on the character face and suit values of the card
            ReturnedIcon=CardIcon;                                                                                                                                                                            //display the icon value of this card
        }
        return(ReturnedIcon);                                                                                                                                                                                 //display the icon value of the selected card
    }
    private static void WinCondition(int P1Card, int P2Card, Card[] Deck)                                                                     //method to check who the winner of the game is
    {
        if(Deck[P1Card].getvalue()>Deck[P2Card].getvalue())                                                                                   //if player one had a higher card value
        {
            JOptionPane.showMessageDialog(null,"Player One Wins","End of game",JOptionPane.INFORMATION_MESSAGE);//create a popup that displays p1 as winner
        }
        else if(Deck[P1Card].getvalue()<Deck[P2Card].getvalue())                                                                              //else if player two had a higher card value
        {
            JOptionPane.showMessageDialog(null,"Player Two Wins","End of game",JOptionPane.INFORMATION_MESSAGE);//create a popup that displays p2 as winner
        }
        else{
            JOptionPane.showMessageDialog(null,"Equal cards!","Tie!",JOptionPane.INFORMATION_MESSAGE);          //display that the players tied if they have the same card value
        }
    }
    private GameOfCutGUI()                                          //method for calling the make interface method
    {
        CreateUserInterface();                                      //create user interface
    }
    public static void Start()
    {
        GameOfCutGUI application = new GameOfCutGUI();              //create a new application of class GameOfCutGui
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate the program upon window closure
    }
    public static void initDeck(Card[] Deck)                        //initialize deck methodA
    {
        for(int x=0;x<52;x++)                                       //run through the deck
        {
            Deck[x]=new Card();                                     //create a new card for each position in the array
            Deck[x].setposition(-1);                                //set the position value of each card to -1, so that it may be reassigned later
        }
    }
    public static void PopDeck(Card[] Deck)                         //method to populate deck
    {
        int intindex;                                               //index, used for tracking the position within the deck array to know which card to alter
        for(int suits=0;suits<4;suits++)                            //for each suit
        {
            for(int value=0; value<13; value++)                     //run through each card value, 13*4 being 52, so all cards are modified
            {
                intindex=value+(13*suits);                          //set the index to the value of the for loop plus 13* the suit, so that a unique value and suit are available for a card
                Deck[intindex].setsuit(suits);                      //set the suit at index of the deck array's card to the current suit in the for loop
                Deck[intindex].setvalue(value+1);                   //set the value at index of the deck array's card to the current value of the second for loop
            }
        }
    }
    public static void randomizeDeck(Card[] Deck)                   //randomize card values of cards in the deck
    {
        boolean boolhaspos;                                         //tests to see if a card has a position
        int intrandomposition;                                      //holds a randomly generated position
        Random rand=new Random();                                   //random num gen for random num for position of a card
        for(int y=0; y<Deck.length; y++)                            //run through the deck
        {
            boolhaspos=false;                                       //if a card has a position, re run the while loop
            intrandomposition=rand.nextInt(52);             //make a random number for position, 0-52
            while(boolhaspos==false)                                //while a card does not have a position
            {
                intrandomposition=rand.nextInt(52);         //new random num
                boolhaspos=true;                                    //don't re run the while loop
                for(int x=0; x<Deck.length; x++)                    //run through the deck
                {
                    if(Deck[x].getposition() == intrandomposition)  //if any other card has this same random number then

                        boolhaspos = false;                         //re run the while loop
                }
            }
            Deck[y].setposition(intrandomposition);                 //if no other card does, set the position of the card to the randomly generated number
        }
    }
    public static void DumpDeck(Card[] deck)                                                        //method that dumps the deck to the console
    {
        Character suit;                                                                             //suit, used for printing the character value from the array of a suit
        Character value;                                                                            //used for printing the character face value from the array of face values
        String total="";                                                                            //used to combine the suit and value characters with some extra text
        for(int x=0; x<deck.length; x++)                                                            //run through the deck
        {
            if(deck[x].getSuit() == 0)                                                              //if the suit value of a card is zero
            {
                suit=charSuits[0];                                                                  //print hearts
            }
            else if(deck[x].getSuit() == 1)                                                         //if suit value is one
            {
                suit=charSuits[1];                                                                  //print clubs/clovers
            }
            else if(deck[x].getSuit() == 2)                                                         //if the suit value is two
            {
                suit=charSuits[2];                                                                  //print diamonds
            }
            else{                                                                                   //if not either of the above
                suit=charSuits[3];                                                                  //print spades
            }
            if(deck[x].getvalue() == 13)                                                            //if the face value of a card is 13
            {
                value=charfaces[0];                                                                 //print ace, so that ace is the high card
                //System.out.println(value + " of " + suit + " in position " + deck[x].getposition());//print the results
            }
            else if(deck[x].getvalue()==1)                                                          //if the face value of a card is one
            {
                value=charfaces[1];                                                                 //print 2, not ace
                //System.out.println(value + " of " + suit + " in position " + deck[x].getposition());//print the results
            }
            else if(deck[x].getvalue()==9)                                                          //if the face value of a card is 9
            {
                value = charfaces[1];                                                                 //print ten
                //System.out.println(value + " of " + suit + " in position " + deck[x].getposition());//print the results
            }
            else if(deck[x].getvalue() == 10)                                                       //if the face calue of a card is 10
            {
                value = charfaces[2];                                                                 //print jack
                //System.out.println(value + " of " + suit + " in position " + deck[x].getposition());//print the results
            }
            else if(deck[x].getvalue() == 11)                                                       //if the face value of a card is 11
            {
                value=charfaces[3];                                                                 //print queen
               // System.out.println(value + " of " + suit + " in position " + deck[x].getposition());//print the results
            }
            else if(deck[x].getvalue() == 12)                                                       //if the face value of a card is 12
            {
                value=charfaces[4];                                                                 //print king
               // System.out.println(value + " of " + suit + " in position " + deck[x].getposition());//print the results
            }
            else{
                total=String.valueOf(deck[x].getvalue());                                           //if not any of those
                //System.out.println(total + " of " + suit + " in position " + deck[x].getposition());//print the integer face value of the card and the results of the game
            }
        }
        //System.out.println("+++++++++++++++++++++++++++++++++++++++++");                            //buffer to signal the end of a single print
    }
    public static void ShuffleDeck(Card[] decktwo)                                                  //bubble sort which sorts cards based on position
    {
        boolean boolswap=true;                                                                      //bool used to keep the while loop going
        Card tempcard=new Card();                                                                   //temporary card used to hold the value of one card so that two may be swapped
        while (boolswap == true)                                                                    //while swap is true
        {
            boolswap = false;                                                                       //reset the while loop
            for(int x=0; x<decktwo.length-1; x++)                                                   //run through the deck
            {
                if (decktwo[x + 1].getposition() < decktwo[x].getposition())                        //if this card has a higher value than the card to its left in the array
                {
                    tempcard.setposition(decktwo[x].getposition());                                 //swapping card values so that they appear to be reordered properly
                    tempcard.setsuit(decktwo[x].getSuit());                                         //swapping card values so that they appear to be reordered properly
                    tempcard.setvalue(decktwo[x].getvalue());                                       //swapping card values so that they appear to be reordered properly
                    decktwo[x].setposition(decktwo[x + 1].getposition());                           //swapping card values so that they appear to be reordered properly
                    decktwo[x].setsuit(decktwo[x + 1].getSuit());                                   //swapping card values so that they appear to be reordered properly
                    decktwo[x].setvalue(decktwo[x + 1].getvalue());                                 //swapping card values so that they appear to be reordered properly
                    decktwo[x + 1].setposition(tempcard.getposition());                             //swapping card values so that they appear to be reordered properly
                    decktwo[x + 1].setsuit(tempcard.getSuit());                                     //swapping card values so that they appear to be reordered properly
                    decktwo[x + 1].setvalue(tempcard.getvalue());                                   //swapping card values so that they appear to be reordered properly
                    boolswap = true;                                                                //continue with the while loop
                }
            }
        }
    }
    public static Character GetCardCharValue(Card card)                                             //get the character value of a card, if its value is not 0-8
    {
        if(card.getvalue()==13)                                                                     //if the card's value is 13
        {
            return charfaces[0];                                                                    //return ace
        }
        else if(card.getvalue()==9)                                                                 //if 9
        {
            return charfaces[1];                                                                    //return T(Ten)
        }
        else if(card.getvalue()==10)                                                                //if 10
        {
            return charfaces[2];                                                                    //return jack
        }
        else if(card.getvalue()==11)                                                                //if 11
        {
            return charfaces[3];                                                                    //return queen
        }
        else{
            return charfaces[4];                                                                    //return king
        }
    }
}
