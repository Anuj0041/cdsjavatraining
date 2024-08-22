import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JButton add_button = new JButton("ADD");
        add_button.setBounds(130, 250, 120, 40);
        add_button.setBackground(Color.GREEN);
        frame.add(add_button);

        JButton view_button = new JButton("View");
        view_button.setBounds(260,250,120,40);
        view_button.setBackground(Color.RED);
        frame.add(view_button);

        add_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expense_type= expenseTypeField.getText();
                int expanse_Amount= expense_amount_field.getText().isEmpty()?0:Integer.parseInt();
                if (expanse_Amount!=0)

            }
        });

