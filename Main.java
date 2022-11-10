import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField firstInt;
    JTextField secondInt;
    JTextField resultBox;
    private JRadioButton addition;
    private JRadioButton subtraction;
    private JRadioButton multiplication;
    private JRadioButton division;

    public static void main(String[] args){
        new Main().display();
        
    }

    private void display(){
        setSize(new Dimension(415, 200));
        setTitle("Homework2");
        Container c = getContentPane();
        getContentPane().setBackground(new Color(207, 207, 207));
        c.setLayout(null);

        firstInt = new JTextField();
        firstInt.setBounds(10, 40, 100, 21);

        // Button Setup
        addition = new JRadioButton();
        getContentPane().add(addition);
        addition.setText("+");
        addition.setBounds(115, 40, 50, 21);
        addition.addActionListener(this);

        subtraction = new JRadioButton();
        getContentPane().add(subtraction);
        subtraction.setText("-");
        subtraction.setBounds(115, 60, 50, 21);
        subtraction.addActionListener(this);

        multiplication = new JRadioButton();
        getContentPane().add(multiplication);
        multiplication.setText("*");
        multiplication.setBounds(115, 80, 50, 21);
        multiplication.addActionListener(this);

        division = new JRadioButton();
        getContentPane().add(division);
        division.setText("/");
        division.setBounds(115, 100, 50, 21);
        division.addActionListener(this);

        // Button Group setup
        ButtonGroup math = new ButtonGroup();
        math.add(addition);
        math.add(subtraction);
        math.add(multiplication);
        math.add(division);

        secondInt = new JTextField();
        secondInt.setBounds(160, 40, 100, 21);

        JLabel equals = new JLabel("=");
        equals.setBounds(275, 40, 50, 21);

        resultBox = new JTextField();
        resultBox.setBounds(300, 40, 100, 21);

        c.add(firstInt);
        c.add(secondInt);
        c.add(equals);
        c.add(resultBox);
        setVisible(true);  
    }

    public void actionPerformed(ActionEvent evt){
        resultBox.setText("");
        try{
            int i = Integer.parseInt(firstInt.getText());
            int j = Integer.parseInt(secondInt.getText());
            double resultDouble = 0;

            if(evt.getSource() == addition)
                resultDouble = (i + j);
            
            if(evt.getSource() == subtraction)
                resultDouble = (i - j);

            if(evt.getSource() == multiplication)
                resultDouble = (i * j);

            if(evt.getSource() == division)
                if(j==0){
                JOptionPane.showMessageDialog(null, "Error: Division by zero");
                resultDouble = ((double) i / j);
                }

            resultBox.setText(String.valueOf(resultDouble));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}