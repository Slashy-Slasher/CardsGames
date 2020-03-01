import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BlackJack extends JFrame
{
    int intcounter=0;
    Random rand=new Random();
    int randcard=rand.nextInt(51);
    static char[] charSuits={'H','C','D','S'};
    static char[] charfaces={'A','2','T','J','Q','K'};
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
        HitJButton=new JButton();
        HitJButton.setText("Hit");
        HitJButton.setBounds(1150,250,100,50);
        contentPane.add(HitJButton);
        foldJButton=new JButton();
        foldJButton.setText("fold");
        foldJButton.setBounds(1150,400,100,50);
        contentPane.add(foldJButton);
        Card1JLabelIcon=new JLabel();
        Card1JLabelIcon.setBounds(0,400,200,306);
        Card1JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Card1JLabelIcon);
        Card2JLabelIcon=new JLabel();
        Card2JLabelIcon.setBounds(200,400,200,306);
        Card2JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Card2JLabelIcon);
        Card3JLabelIcon=new JLabel();
        Card3JLabelIcon.setBounds(400,400,200,306);
        Card3JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Card3JLabelIcon);
        Card4JLabelIcon=new JLabel();
        Card4JLabelIcon.setBounds(600,400,200,306);
        Card4JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Card4JLabelIcon);
        Card5JLabelIcon=new JLabel();
        Card5JLabelIcon.setBounds(800,400,200,306);
        Card5JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Card5JLabelIcon);
        Dealer1JLabelIcon=new JLabel();
        Dealer1JLabelIcon.setBounds(0,0,200,306);
        Dealer1JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Dealer1JLabelIcon);
        Dealer2JLabelIcon=new JLabel();
        Dealer2JLabelIcon.setBounds(200,0,200,306);
        Dealer2JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Dealer2JLabelIcon);
        Dealer3JLabelIcon=new JLabel();
        Dealer3JLabelIcon.setBounds(400,0,200,306);
        Dealer3JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Dealer3JLabelIcon);
        Dealer4JLabelIcon=new JLabel();
        Dealer4JLabelIcon.setBounds(600,0,200,306);
        Dealer4JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Dealer4JLabelIcon);
        Dealer5JLabelIcon=new JLabel();
        Dealer5JLabelIcon.setBounds(800,0,200,306);
        Dealer5JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\cardsfacesresized\\red_back-resized.png"));
        contentPane.add(Dealer5JLabelIcon);
        foldJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent foldactionperformed) {
                AIPlay(Deck);
            }
        });
        HitJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent hitactionperformed) {
                if(intcounter==0)
                {
                    Card3JLabelIcon.setVisible(true);
                    randcard=rand.nextInt(51);
                    Card3JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[randcard]))+charSuits[Deck[randcard].getSuit()]+"resized.png"));
                    intcounter++;
                }
                else if(intcounter==1)
                {
                    Card4JLabelIcon.setVisible(true);
                    randcard=rand.nextInt(51);
                    Card4JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[randcard]))+charSuits[Deck[randcard].getSuit()]+"resized.png"));
                    intcounter++;
                }
                else if(intcounter==2)
                {
                    Card5JLabelIcon.setVisible(true);
                    randcard=rand.nextInt(51);
                    Card5JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[randcard]))+charSuits[Deck[randcard].getSuit()]+"resized.png"));
                    intcounter++;
                    AIPlay(Deck);
                }
                }
        });
        Play(Deck);
        setTitle("Go fish");
        setSize(1366,768);
        setVisible(true);
    }
    public void AIPlay(Card[]Deck)
    {
        Dealer3JLabelIcon.setVisible(true);
    }
    public void Play(Card[] Deck)
    {
        ShuffleDeck(Deck);
        Dealer3JLabelIcon.setVisible(false);
        Dealer4JLabelIcon.setVisible(false);
        Dealer5JLabelIcon.setVisible(false);
        Card3JLabelIcon.setVisible(false);
        Card4JLabelIcon.setVisible(false);
        Card5JLabelIcon.setVisible(false);
        Random rand=new Random();
        int randcard=rand.nextInt(51);
        Card1JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[randcard]))+charSuits[Deck[randcard].getSuit()]+"resized.png"));
        randcard=rand.nextInt(51);
        Card2JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[randcard]))+charSuits[Deck[randcard].getSuit()]+"resized.png"));
        randcard=rand.nextInt(51);
        Dealer1JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[randcard]))+charSuits[Deck[randcard].getSuit()]+"resized.png"));
        randcard=rand.nextInt(51);
        Dealer2JLabelIcon.setIcon(new ImageIcon("C:\\Users\\amort\\Desktop\\"+String.valueOf(GetCardCharValue(Deck[randcard]))+charSuits[Deck[randcard].getSuit()]+"resized.png"));

    }
    public BlackJack()
    {
        CreateUI();
    }
    public static void Start()
    {
        BlackJack application= new BlackJack();
    }
    public static void initDeck(Card[] Deck)
    {
        for(int x=0;x<52;x++)
        {
            Deck[x]=new Card();
            Deck[x].setposition(-1);
        }
    }
    public static void PopDeck(Card[] Deck)
    {
        int intindex;
        for(int suits=0;suits<4;suits++)
        {
            for(int value=0; value<13; value++)
            {
                intindex=value+(13*suits);
                Deck[intindex].setsuit(suits);
                Deck[intindex].setvalue(value+1);
            }
        }
    }
    public static void randomizeDeck(Card[] Deck)
    {
        boolean boolhaspos;
        int intrandomposition;
        Random rand=new Random();
        for(int y=0; y<Deck.length; y++)
        {
            boolhaspos=false;
            intrandomposition=rand.nextInt(52);
            while(boolhaspos==false)
            {
                intrandomposition=rand.nextInt(52);
                boolhaspos=true;
                for(int x=0; x<Deck.length; x++)
                {
                    if(Deck[x].getposition() == intrandomposition)

                        boolhaspos = false;
                }
            }
            Deck[y].setposition(intrandomposition);
        }
    }
    public static void ShuffleDeck(Card[] decktwo)
    {
        boolean boolswap=true;
        Card tempcard=new Card();
        while (boolswap == true)
        {
            boolswap = false;
            for(int x=0; x<decktwo.length-1; x++)
            {
                if (decktwo[x + 1].getposition() < decktwo[x].getposition())
                {
                    tempcard.setposition(decktwo[x].getposition());
                    tempcard.setsuit(decktwo[x].getSuit());
                    tempcard.setvalue(decktwo[x].getvalue());
                    decktwo[x].setposition(decktwo[x + 1].getposition());
                    decktwo[x].setsuit(decktwo[x + 1].getSuit());
                    decktwo[x].setvalue(decktwo[x + 1].getvalue());
                    decktwo[x + 1].setposition(tempcard.getposition());
                    decktwo[x + 1].setsuit(tempcard.getSuit());
                    decktwo[x + 1].setvalue(tempcard.getvalue());
                    boolswap = true;
                }
            }
        }
    }
    public static Character GetCardCharValue(Card card)
    {
        if(card.getvalue()==13)
        {
            return charfaces[0];
        }
        else if(card.getvalue()==9)
        {
            return charfaces[1];
        }
        else if(card.getvalue()==10)
        {
            return charfaces[2];
        }
        else if(card.getvalue()==11)
        {
            return charfaces[3];
        }
        else{
            return charfaces[4];
        }
    }
}
