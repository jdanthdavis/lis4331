//SS8
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DistanceCalculator implements ActionListener
{
    public static void main (String [] args)
    {
        DistanceCalculator gui = new DistanceCalculator();
    }

private JFrame frame;
private JTextField heightField;
private JTextField weightField;
private JLabel bmiLabel;
private JButton computeButton;

public DistanceCalculator() 
{
    //set up components
    heightField = new JTextField(5);
    weightField = new JTextField(5);
    bmiLabel = new JLabel("Compute Distance Leg C.");
    computeButton = new JButton("Compute");

    //attach GUI as event listener to Compute Button
    computeButton.addActionListener(this);

    //layout
    JPanel north = new JPanel(new GridLayout (2,2));
    north.add(new JLabel("Leg A: "));
    north.add(heightField);
    north.add(new JLabel("Leg B: "));
    north.add(weightField);

    //overall frame
    frame = new JFrame("BMI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    frame.add(north, BorderLayout.NORTH);
    frame.add(bmiLabel, BorderLayout.CENTER);
    frame.add(computeButton, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
}

//Handles clicks on Compute button by computing the BMI.
public void actionPerformed(ActionEvent event)
{
    String heightText = heightField.getText();
    double height = Double.parseDouble(heightText);
    String weightText = weightField.getText();
    double weight = Double.parseDouble(weightText);

    //compute BMI and display it onscreen
    //double bmi = weigh / (height * height) * 703;
    double bmi = Math.sqrt(Math.pow(height, 2 ) + Math.pow(weight, 2));

    //Math.pow(i,2)
    //Math.sqrt(value)
    bmiLabel.setText(String.format("Leg C: %,.2f", bmi));
    }
}