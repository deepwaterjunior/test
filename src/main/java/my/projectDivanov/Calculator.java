package my.projectDivanov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
//1
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEquals, buttonClear;
    private double num1, num2, result;
    private String operator;

    public Calculator() {
        // set up the frame
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // create text field for displaying input and output
        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        // create buttons
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        button7 = new JButton("7");
        button7.addActionListener(this);
        buttonPanel.add(button7);

        button8 = new JButton("8");
        button8.addActionListener(this);
        buttonPanel.add(button8);

        button9 = new JButton("9");
        button9.addActionListener(this);
        buttonPanel.add(button9);

        buttonDivide = new JButton("/");
        buttonDivide.addActionListener(this);
        buttonPanel.add(buttonDivide);

        button4 = new JButton("4");
        button4.addActionListener(this);
        buttonPanel.add(button4);

        button5 = new JButton("5");
        button5.addActionListener(this);
        buttonPanel.add(button5);

        button6 = new JButton("6");
        button6.addActionListener(this);
        buttonPanel.add(button6);

        buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(this);
        buttonPanel.add(buttonMultiply);

        button1 = new JButton("1");
        button1.addActionListener(this);
        buttonPanel.add(button1);

        button2 = new JButton("2");
        button2.addActionListener(this);
        buttonPanel.add(button2);

        button3 = new JButton("3");
        button3.addActionListener(this);
        buttonPanel.add(button3);

        buttonMinus = new JButton("-");
        buttonMinus.addActionListener(this);
        buttonPanel.add(buttonMinus);

        button0 = new JButton("0");
        button0.addActionListener(this);
        buttonPanel.add(button0);

        buttonClear = new JButton("C");
        buttonClear.addActionListener(this);
        buttonPanel.add(buttonClear);

        buttonEquals = new JButton("=");
        buttonEquals.addActionListener(this);
        buttonPanel.add(buttonEquals);

        buttonPlus = new JButton("+");
        buttonPlus.addActionListener(this);
        buttonPanel.add(buttonPlus);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == button7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == button8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == button9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == buttonPlus) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText(textField.getText() + " + ");
        } else if (e.getSource() == buttonMinus) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText(textField.getText() + " - ");
        } else if (e.getSource() == buttonMultiply) {
            num1 = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText(textField.getText() + " * ");
        } else if (e.getSource() == buttonDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText(textField.getText() + " / ");
        } else if (e.getSource() == buttonEquals) {
            num2 = Double.parseDouble(textField.getText().split(" ")[2]);
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            textField.setText(textField.getText() + " = " + Double.toString(result));
        } else if (e.getSource() == buttonClear) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}