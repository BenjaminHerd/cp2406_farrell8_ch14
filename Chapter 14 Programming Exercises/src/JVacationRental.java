//import statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener {

    //Layout aspects
    FlowLayout flow = new FlowLayout();
    String companyName = new String("Lambert's Vacation Rentals");
    Font bigFont = new Font("Arial", Font.PLAIN, 24);

    //variable declaration
    final int PARK_PRICE = 600, POOL_PRICE = 750, LAKE_PRICE = 825;
    int totalPrice = 0;

    //Making button groups
    ButtonGroup locationGrp = new ButtonGroup();

    //Check Box objects
    JCheckBox parkBox = new JCheckBox("Parkside", false);
    JCheckBox poolBox = new JCheckBox("Poolside", false);
    JCheckBox lakeBox = new JCheckBox("Lakeside", false);

    final int ONE_PRICE = 0, TWO_PRICE = 75, THREE_PRICE = 150;
    ButtonGroup bdrmGroup = new ButtonGroup();
    JCheckBox oneBox = new JCheckBox("1 Bedroom", false);
    JCheckBox twoBox = new JCheckBox("2 Bedrooms", false);
    JCheckBox threeBox = new JCheckBox("3 Bedrooms", false);

    final int NON_MEALS_PRICE = 0, MEALS_PRICE = 200;
    ButtonGroup mealGrp = new ButtonGroup();
    JCheckBox noMealsBox = new JCheckBox("No meals", false);
    JCheckBox mealsBox = new JCheckBox("Meals Included", false);
    JTextField totPrice = new JTextField(10);
    String output;

    //Public class constructor
    public JVacationRental(){
        super("Vacation Combobox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        locationGrp.add(parkBox);
        parkBox.addItemListener(this);

        locationGrp.add(poolBox);
        poolBox.addItemListener(this);
        locationGrp.add(lakeBox);
        lakeBox.addItemListener(this);

        bdrmGroup.add(oneBox);
        twoBox.addItemListener(this);
        bdrmGroup.add(twoBox);
        threeBox.addItemListener(this);
        bdrmGroup.add(threeBox);

        mealGrp.add(noMealsBox);
        noMealsBox.addItemListener(this);
        mealGrp.add(mealsBox);
        mealsBox.addItemListener(this);

        add(parkBox);
        add(poolBox);
        add(lakeBox);
        add(oneBox);
        add(twoBox);
        add(threeBox);
        add(noMealsBox);
        add(mealsBox);

        totPrice.setText("0");
        add(totPrice);
    }

    //Runnning application
    public static void main(String[] args) {

        JVacationRental frame = new JVacationRental();
        frame.setSize(320, 200);
        frame.setVisible(true);
    }

    //Override method
    @Override
    public void itemStateChanged(ItemEvent check){

        //Other variable for checking each item
        Object source = check.getItem();

        //If statements for checking each possible combination of values
        if (source == parkBox){
            int select = check.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += PARK_PRICE;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= PARK_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }

        else if(source == poolBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += POOL_PRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= POOL_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == lakeBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += LAKE_PRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= LAKE_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == oneBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += ONE_PRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= ONE_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == twoBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += TWO_PRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= TWO_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == threeBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += THREE_PRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= THREE_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == noMealsBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += NON_MEALS_PRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= NON_MEALS_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == mealsBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += MEALS_PRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= MEALS_PRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }

    }


}
