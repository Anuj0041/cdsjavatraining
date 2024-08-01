import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Expense Calculator");
        frame.setSize(500, 400);
        frame.setLayout(null);

        JLabel expenseTitleLabel = new JLabel("Expenses:");
        expenseTitleLabel.setBounds(200, 10, 120, 30);
        expenseTitleLabel.setForeground(Color.RED);
        frame.add(expenseTitleLabel);

        JLabel expenseType = new JLabel("Expense Type :");
        expenseType.setBounds(20, 50, 120, 30);
        frame.add(expenseType);

        JTextField expenseTypeField = new JTextField();
        expenseTypeField.setBounds(130, 50, 120, 30);
        frame.add(expenseTypeField);

        JLabel expenseAmount = new JLabel("Expense Amount :");
        expenseAmount.setBounds(20, 90, 120, 30);
        frame.add(expenseAmount);

        JTextField expenseAmountTypeField = new JTextField();
        expenseAmountTypeField.setBounds(130, 90, 120, 30);
        frame.add(expenseAmountTypeField);


        JLabel incomeTitleLabel = new JLabel("Income:");
        incomeTitleLabel.setBounds(200, 130, 120, 30);
        incomeTitleLabel.setForeground(Color.GREEN);
        frame.add(incomeTitleLabel);

        JLabel incomeAmount = new JLabel("Expense Amount :");
        incomeAmount.setBounds(20, 150, 120, 30);
        frame.add(incomeAmount);

        JTextField inputAmountTypeField = new JTextField();
        inputAmountTypeField.setBounds(130, 150, 120, 30);
        frame.add(inputAmountTypeField);

        frame.setVisible(true);
    }
}