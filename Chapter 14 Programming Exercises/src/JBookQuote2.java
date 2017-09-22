/*
Write application that displays a JFrame containing the opening sentence or two from your favourite book
And use a button to display it
 */

//requires import statement and extension: swing and JFrame respectively
import javax.swing.*;

//Event statements need to be imported for event handling
import java.awt.*;
import java.awt.event.*;

//Needs additional implements statement to listen for actions
public class JBookQuote2 extends JFrame implements ActionListener {

    //Layout aspects
    FlowLayout flow = new FlowLayout();
    JLabel label = new JLabel(" Jane Eyre: 'There was no possibility of taking a walk that day.'");
    JLabel label2 = new JLabel(" Moby Dick: 'Call Me Ishmael.'");
    JButton button = new JButton("Click Here");

    //Set up for JFrame
    public JBookQuote2(){

        super("Book Quote with Button");
        setLayout(flow);
        add(label);
        add(button);
        button.addActionListener(this);
        //Default close and exit application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Override statement to 'catch' an action made by the user
    @Override
    public void actionPerformed(ActionEvent e){
        add(label2);
        validate();
        repaint();
    }

    //running application
    public static void main(String[] args) {

        //run instance of JFrame class
        JBookQuote2 book = new JBookQuote2();
        book.setSize(400, 100);
        book.setVisible(true);
    }

}
