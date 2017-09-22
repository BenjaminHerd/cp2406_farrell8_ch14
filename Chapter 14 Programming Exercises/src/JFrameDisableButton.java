//Disable button after clicking event

//import statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener {

    //Layout aspects
    FlowLayout flow = new FlowLayout();

    //Button needs container to be disabled
    Container con = getContentPane();
    JButton button = new JButton("Click to disable");


    //Frame Setup
    public JFrameDisableButton(){

        //Have to add items to the container, similar to html in that sense
        super("Disable Button");
        con.setLayout(flow);
        setSize(180, 180);
        setVisible(true);
        con.add(button);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Override to catch event
    @Override
    public void actionPerformed(ActionEvent e){

        button.setEnabled(false);

    }

    //Running application
    public static void main(String[] args) {

        JFrameDisableButton frame = new JFrameDisableButton();

    }

}
