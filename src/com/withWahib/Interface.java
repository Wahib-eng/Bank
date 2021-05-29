package com.withWahib;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Interface extends JFrame implements ActionListener {
    Scanner input = new Scanner(System.in);
    public ArrayList<String> customers;
    String header[] = new String[]{"Name", "Surname", "Email", "Phone Number"};
    JTextArea jta ;
    DefaultTableModel dtm;
    int row, col;

    JFrame jfm;
    JButton addCustomer, customerInfo, accountInfo, creditInfo;
    JPanel panel;
    JLabel jlb1, jlb2, jlb3, jlb4, jlb5, jlb6;
    JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;



    public Interface() {

        jta = new JTextArea(5,5);
        jta.setBounds(485,180,455,350);
        add(jta);
        jta.setBackground(new Color(231, 198, 198));
        jta.setBorder(BorderFactory.createBevelBorder(1));
        jta.setForeground(new Color(0, 0, 0));
        jta.setEditable(false);


        JScrollPane scrollPane= new JScrollPane(panel);
        scrollPane.setPreferredSize(new Dimension(400,350));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        jfm = new JFrame("Wahib Bank ");
        jfm.setSize(1000, 700);
        panel = new JPanel();


        addCustomer = new JButton("Add a customer");
        customerInfo = new JButton("Customer Information");
        accountInfo = new JButton("Account Information");
        creditInfo = new JButton("Credit Information");

        add(addCustomer);
        add(customerInfo);
        add(accountInfo);

        jfm.add(addCustomer);
        jfm.add(customerInfo);
        jfm.add(accountInfo);
        jfm.add(creditInfo);

        addCustomer.setBounds(200, 420, 150, 30);
        customerInfo.setBounds(480, 550, 158, 30);
        accountInfo.setBounds(792, 550, 150, 30);
        creditInfo.setBounds(640, 550, 150, 30);

        jlb1 = new JLabel("Name : ");
        jlb2 = new JLabel("Surname : ");
        jlb3 = new JLabel("Email Address : ");
        jlb4 = new JLabel("Phone No : ");
        jlb5 = new JLabel("My name and surname : ");
        jlb6 = new JLabel("My student Number : ");

        jlb1.setBounds(100, 200, 300, 20);
        jlb2.setBounds(100, 240, 300, 20);
        jlb3.setBounds(100, 280, 300, 40);
        jlb4.setBounds(100, 320, 300, 40);
        jlb5.setBounds(600, 20, 300, 40);
        jlb6.setBounds(600, 60, 300, 40);

        jfm.add(jlb1);
        jfm.add(jlb2);
        jfm.add(jlb3);
        jfm.add(jlb4);
        jfm.add(jlb5);
        jfm.add(jlb6);

        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        jtf4 = new JTextField();
        jtf5 = new JTextField("Wahib Hael ");
        jtf6 = new JTextField("20360859109");
        add(jtf1);
        add(jtf2);
        add(jtf3);
        add(jtf4);
        jfm.add(jtf1);
        jfm.add(jtf2);
        jfm.add(jtf3);
        jfm.add(jtf4);
        jfm.add(jtf5);
        jfm.add(jtf6);

        jtf1.setBounds(200, 200, 200, 30);
        jtf2.setBounds(200, 240, 200, 30);
        jtf3.setBounds(200, 280, 200, 30);
        jtf4.setBounds(200, 320, 200, 30);
        jtf5.setBounds(750, 20, 200, 30);
        jtf6.setBounds(750, 60, 200, 30);

        addCustomer.addActionListener(this);
        customerInfo.addActionListener(this);
        accountInfo.addActionListener(this);
        creditInfo.addActionListener(this);

        panel.setLayout(null);
        panel.setBounds(0, 20, 600, 400);


        jfm.add(panel);
        jfm.setVisible(true);
        panel.setVisible(true);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(jta);

        //panel.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = jtf1.getText().toString();
        String surname = jtf2.getText().toString();
        String email = jtf3.getText().toString();
        int phoneNo = Integer.parseInt(jtf4.getText().toString());
        Customer c1 ;
        c1 = new Customer(name,surname,email,phoneNo);

        if (e.getSource()==addCustomer){

            jta.setText(name);
            jta.setText(surname);
            jta.setText(email);
            jta.setText(String.valueOf(phoneNo));

        }
        if (e.getSource()=="customerInfo"){

        }

    }


}

