//Disable button after clicking event

//import statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener {

    //Layout aspects
    FlowLayout flow = new FlowLayout();

    //Button needs container to be disabled
    Container con = getContentPane();
    JButton button = new JButton("Click to disable");
    JLabel label = new JLabel("Okay, that's enough, calm down now...");

    //variable declaration
    int clickCounter = 0;


    //Frame Setup
    public JFrameDisableButton2(){

        //Have to add items to the container, similar to html in that sense
        super("Disable Button");
        con.setLayout(flow);
        setSize(180, 180);
        setVisible(true);
        con.add(button);
        //Need to add label to container, but make it invisible initially
        con.add(label);
        label.setVisible(false);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Override to catch event
    @Override
    public void actionPerformed(ActionEvent e){
        ++clickCounter;
        if (clickCounter == 8){
            button.setEnabled(false);
            label.setVisible(true);
        }


    }

    //Running application
    public static void main(String[] args) {

        JFrameDisableButton2 frame = new JFrameDisableButton2();

    }

}
