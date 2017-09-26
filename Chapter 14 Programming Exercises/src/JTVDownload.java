/*

 */

//import statements

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JTVDownload extends JFrame implements ItemListener {

    //Layout for frame
    FlowLayout flow = new FlowLayout();
    JComboBox<String> tvGuide = new JComboBox<String>();

    JLabel tvTitle = new JLabel("Channel List");
    JLabel aLabel = new JLabel("Channel Brief: ");
    JTextField desriptionField = new JTextField(30);

    //Variable Declaration for lists
    String [] programs = {"Ch. 1", "Ch. 2", "Ch. 3", "Ch. 4", "Ch. 5"};

    //Extra array item to display descriptions, since none is also added to combobox
    String[] channelDesciptions = {"(No Description)", "Channel One: Retro Gaming and Entertainment news.", "Channel Two: MTV and Music Spotlights.",
            "Channel Three: Computing Technology and IT news.", "Channel Four: Arts and Literature", "Channel Five: Biological sciences and chemistry."};


    //Public function
    public JTVDownload(){
        //Title of Frame
        super("JTVDownload Guide");
        //Setting to exit on close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Apply layout to frame
        setLayout(flow);
        //Adds an item listener statement to change things in frame based on selected item
        tvGuide.addItemListener(this);
        add(tvTitle);

        //Adding items to comboBox
        //For loop for doing so
        tvGuide.addItem("none");
        for (int x = 0; x < programs.length; ++x)
           tvGuide.addItem(programs[x]);

        add(tvGuide);
        add(aLabel);
        add(desriptionField);

    }

    //Running application
    public static void main(String[] args) {

        JFrame frame = new JTVDownload();
        frame.setSize(400, 150);
        frame.setVisible(true);

    }

    //Override method to handle itemListener events (Listens for changes in the combobox in this case
    @Override
    public void itemStateChanged(ItemEvent list){
        //Get the place of the source in the list
        Object source = list.getSource();
        //If the source matches the item in the array, change the text field to show corresponding description
        if (source == tvGuide){
            int channelNum = tvGuide.getSelectedIndex();
            desriptionField.setText(channelDesciptions[channelNum]);

        }
    }

}
