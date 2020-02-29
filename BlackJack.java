import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class GofishGUI extends JFrame
{
    JLabel Card1JLabelIcon;
    JLabel Card2JLabelIcon;
    JLabel Card3JLabelIcon;
    JLabel Card4JLabelIcon;
    JLabel Card5JLabelIcon;
    JLabel Dealer1JLabelIcon;
    JLabel Dealer2JLabelIcon;
    JLabel Dealer3JLabelIcon;
    JLabel Dealer4JLabelIcon;
    JLabel Dealer5JLabelIcon;
    JButton HitJButton;
    JButton foldJButton;
    JButton HomeJButton;
    public void CreateUI()
    {
        Card [] Deck=new Card[52];
        Container contentPane=getContentPane();
        contentPane.setLayout(null);
        initDeck(Deck);
        PopDeck(Deck);
        randomizeDeck(Deck);
        ShuffleDeck(Deck);
        Card1JLabelIcon=new JLabel();
        Card1JLabelIcon.setBounds(0,400,200,306);
        Card1JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\red_back-resized.png"));
        contentPane.add(Card1JLabelIcon);
        Card2JLabelIcon=new JLabel();
        Card2JLabelIcon.setBounds(200,400,200,306);
        Card2JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\red_back-resized.png"));
        contentPane.add(Card2JLabelIcon);
        Card3JLabelIcon=new JLabel();
        Card3JLabelIcon.setBounds(400,400,200,306);
        Card3JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\red_back-resized.png"));
        contentPane.add(Card3JLabelIcon);
        Card4JLabelIcon=new JLabel();
        Card4JLabelIcon.setBounds(600,400,200,306);
        Card4JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\red_back-resized.png"));
        contentPane.add(Card4JLabelIcon);
        Card5JLabelIcon=new JLabel();
        Card5JLabelIcon.setBounds(800,400,200,306);
        Card5JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\red_back-resized.png"));
        contentPane.add(Card5JLabelIcon);
        Dealer1JLabelIcon=new JLabel();
        Dealer1JLabelIcon.setBounds(0,0,200,306);
        Dealer1JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\red_back-resized.png"));
        contentPane.add(Dealer1JLabelIcon);


        setTitle("Go fish");
        setSize(1366,768);
        setVisible(true);
    }
    public GofishGUI()
    {
        CreateUI();
    }
    public static void Start()
    {
        GofishGUI application= new GofishGUI();
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
}