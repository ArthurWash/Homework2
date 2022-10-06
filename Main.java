import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField firstInt;
    JTextField secondInt;
    JTextField result;

    public static void main(String[] args){
        new Main().display();
    }

    private void display(){
        setSize(new Dimension(450, 200));
        setTitle("Homework2");
        Container c = getContentPane();
        getContentPane().setBackground(new Color(207, 207, 207));
        c.setLayout(null);

        firstInt = new JTextField();
        firstInt.setBounds(10, 40, 100, 21);

        secondInt = new JTextField();
        secondInt.setBounds(150, 40, 100, 21);

        result = new JTextField();
        result.setBounds(300, 40, 100, 21);

        c.add(firstInt);
        c.add(secondInt);
        c.add(result);
        setVisible(true);
    }
}