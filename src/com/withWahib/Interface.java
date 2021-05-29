package com.withWahib;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Interface extends JFrame implements ActionListener {
    Scanner input = new Scanner( System.in );
    public ArrayList<String> customers;
    JTextArea jta ;
    DefaultTableModel model;
    JTable jtb;
    JFrame jfm;
    JButton addCustomer, customerInfo, accountInfo, creditInfo,delete,update;
    //JPanel panel;
    JLabel jlb1, jlb2, jlb3, jlb4, jlb5, jlb6;
    JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;

    public Interface() {
        Object[] header = {"Name", "Surname", "Email", "Phone Number"};
        jtb = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers( header );
        jtb.setModel( model );

        jtb.setBackground( Color.LIGHT_GRAY );
        jtb.setForeground( Color.BLACK );
        Font font = new Font( "",1, 14);
        jtb.setFont( font );
        jtb.setRowHeight( 30 );



        /*jta = new JTextArea(5,5);
        jta.setBounds(485,180,455,350);
        jta.setBackground(new Color(231, 198, 198));
        jta.setBorder(BorderFactory.createBevelBorder(1));
        jta.setEditable(false);*/

        JScrollPane scrollPane= new JScrollPane(jtb);
        scrollPane.setBounds(0,0,880,200  );new Dimension(400,350);


        jfm = new JFrame( "Wahib Bank " );
        jfm.setSize( 980, 600 );
        //panel = new JPanel();

        addCustomer = new JButton( "Add a customer" );
        delete = new JButton( "Delete" );
        customerInfo = new JButton( "Customer Information" );
        accountInfo = new JButton( "Account Information" );
        creditInfo = new JButton( "Credit Information" );
        update = new JButton( "Update" );

        jfm.add( addCustomer );
        jfm.add( delete );
        jfm.add( update );
        jfm.add( customerInfo );
        jfm.add( accountInfo );
        jfm.add( creditInfo );

        addCustomer.setBounds( 278, 520, 150, 30 );
        customerInfo.setBounds( 430, 520, 158, 30 );
        accountInfo.setBounds( 742, 520, 150, 30 );
        creditInfo.setBounds( 590, 520, 150, 30 );
        delete.setBounds( 175, 520, 100, 30 );
        update.setBounds( 70, 520, 100, 30 );


        jlb1 = new JLabel( "Name : " );
        jlb2 = new JLabel( "Surname : " );
        jlb3 = new JLabel( "Email Address : " );
        jlb4 = new JLabel( "Phone No : " );
        jlb5 = new JLabel( "My name and surname : " );
        jlb6 = new JLabel( "My student Number : " );

        jlb1.setBounds( 100, 300, 300, 20 );
        jlb2.setBounds( 100, 345, 300, 20 );
        jlb3.setBounds( 100, 377, 300, 40 );
        jlb4.setBounds( 100, 417, 300, 40 );
        jlb5.setBounds( 600, 237, 300, 40 );
        jlb6.setBounds( 600, 297, 300, 40 );

        jfm.add( jlb1 );
        jfm.add( jlb2 );
        jfm.add( jlb3 );
        jfm.add( jlb4 );
        jfm.add( jlb5 );
        jfm.add( jlb6 );

        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        jtf4 = new JTextField();
        jtf5 = new JTextField( "Wahib Hael " );
        jtf6 = new JTextField( "20360859109" );
        jtf1.setBounds( 200, 300, 200, 30 );
        jtf2.setBounds( 200, 340, 200, 30 );
        jtf3.setBounds( 200, 380, 200, 30 );
        jtf4.setBounds( 200, 420, 200, 30 );
        jtf5.setBounds( 750, 240, 200, 30 );
        jtf6.setBounds( 750, 300, 200, 30 );

        jfm.add( jtf1 );
        jfm.add( jtf2 );
        jfm.add( jtf3 );
        jfm.add( jtf4 );
        jfm.add( jtf5 );
        jfm.add( jtf6 );

        addCustomer.addActionListener( this );
        customerInfo.addActionListener( this );
        accountInfo.addActionListener( this );
        update.addActionListener( this );

        //panel.setBounds( 0, 20, 600, 400 );

        jfm.setLayout( null );
        //jfm.add( panel );
        jfm.setVisible( true );
        jfm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jfm.add(scrollPane);

        addCustomer.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] row = new Object[4];
                row[0] = jtf1.getText();
                row[1] = jtf2.getText();
                row[2] = jtf3.getText();
                row[3] = jtf4.getText();

                model.addRow( row );
            }
        } );
        delete.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d = jtb.getSelectedRow();
                if (d >= 0) {
                    model.removeRow( d );
                }
                else{
                    JOptionPane.showMessageDialog( jfm,"You have not chosen a customer !! " +
                            "", "Deletion Error ", 1 );
                }

            }
        } );
        jtb.addMouseListener( new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int d = jtb.getSelectedRow();
                jtf1.setText( model.getValueAt( d,0 ).toString() );
                jtf2.setText( model.getValueAt( d,1 ).toString() );
                jtf3.setText( model.getValueAt( d,2 ).toString() );
                jtf4.setText( model.getValueAt( d,3 ).toString() );
            }
        } );
        update.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int d = jtb.getSelectedRow();
                if (d>=0){
                    model.setValueAt(jtf1.getText(),d,0 );
                    model.setValueAt(jtf2.getText(),d,1 );
                    model.setValueAt(jtf3.getText(),d,2 );
                    model.setValueAt(jtf4.getText(),d,3 );
                }
                else {
                    JOptionPane.showMessageDialog(jfm, "you have not updated any information !! ","Update Error ",1);
                }

            }
        } );

        //
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

