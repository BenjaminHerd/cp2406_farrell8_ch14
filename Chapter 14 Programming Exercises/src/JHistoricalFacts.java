/*
5 labels, click the button and a new one pops up
 */

//import statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//extends and implements statements for event driven programming
public class JHistoricalFacts extends JFrame implements ActionListener {

    //Layout Aspects
    FlowLayout flow = new FlowLayout();
    Container con = getContentPane();
    JLabel fact1 = new JLabel("Ford Model T, also known as 'Tin Lizzie' was produced during 1908 - 1927");
    JLabel fact2 = new JLabel("Sir Isaac Newton was born in 1643 and helped develop the principles of modern physics as well as the laws of motion");
    JLabel fact3 = new JLabel("Rene Descartes was born in 1596 and was a French philosopher, commonly brought up for his famous quote: 'Cogito ergo sum' (I think, therefore I am)");
    JLabel fact4 = new JLabel("Marie Curie was born in 1867 and was a Polish and naturalised-French physicist and chemist who conducted pioneering research on radioactivity");
    JLabel fact5 = new JLabel("One of the first Personal Computers was the MITS Altair 8800 made in 1975");
    JButton button = new JButton("Click here");

    //variable declaration
    int clickCounter = 0;

    //Set up for Frame
    public JHistoricalFacts(){
        super("Historical Facts");
        con.setLayout(flow);
        setSize(1000, 200);
        setVisible(true);
        con.add(fact1);
        fact1.setVisible(true);
        con.add(button);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Override to catch event as each occur
    @Override
    public void actionPerformed(ActionEvent e){
        ++clickCounter;
        if (clickCounter == 1){
            con.add(fact2);
            fact1.setVisible(false);
            fact2.setVisible(true);
        }
        else if (clickCounter == 2){
            con.add(fact3);
            fact2.setVisible(false);
            fact3.setVisible(true);
        }
        else if (clickCounter == 3){
            con.add(fact4);
            fact3.setVisible(false);
            fact4.setVisible(true);
        }
        else{
            con.add(fact5);
            fact4.setVisible(false);
            fact5.setVisible(true);
        }

    }
    //Running application
    public static void main(String[] args) {
        JHistoricalFacts frame = new JHistoricalFacts();
    }


}
