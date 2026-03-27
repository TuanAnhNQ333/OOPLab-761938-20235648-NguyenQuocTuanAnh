/**
 * 2.2.5
 */

package com.example.oop_lab.lab1.FirstProgram;

import javax.swing.*;

public class calculate {
    public static void main(String[] args) {
        String strNum1 =  JOptionPane.showInputDialog("Enter First Number");
        String strNum2 =  JOptionPane.showInputDialog("Enter Second Number");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        JOptionPane.showMessageDialog(null,
                "sum is: " + sum);
        JOptionPane.showMessageDialog(null,
                "diff is: " + diff);
        JOptionPane.showMessageDialog(null,
                "quotient is: " + quotient);
        JOptionPane.showMessageDialog(null,
                "product is: " + product);

        System.exit(0);

    }
}
