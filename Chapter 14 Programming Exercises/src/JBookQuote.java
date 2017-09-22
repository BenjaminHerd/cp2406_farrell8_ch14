/*
Write application that displays a JFrame containing the opening sentence or two from your favourite book
 */

//requires import statement and extension: swing and JFrame respectively
import javax.swing.*;

public class JBookQuote extends JFrame {

    //Layout aspects
    JLabel label = new JLabel(" Jane Eyre: 'There was no possibility of taking a walk that day.'");

    //Set up for JFrame
    public JBookQuote(){

    super("Book Quote for Exercise 1");
    setSize(400, 100);
    add(label);

    //Default close and exit application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //running application
    public static void main(String[] args) {

        //run instance of JFrame class
        JBookQuote book = new JBookQuote();
        book.setVisible(true);
    }

}
