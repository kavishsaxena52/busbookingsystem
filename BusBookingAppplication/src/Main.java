

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        JFrame frame= new JFrame("BusBookimgSystem");





        JLabel namelb,emaillb,mobilelb,genderlb,addresslb,sourcelb,destinationlb,paymentlb,bookingIdlb;




        JTextField nametf,emailtf,mobiletf,gendertf,addresstf,sourcetf,destinationtf,paymenttf;






        JButton booknowbtn=new JButton("BookNow");
        JButton clearbtn=new JButton("Clear");
        JButton cancelbtn=new JButton("Cancel");
        JButton exitbtn=new JButton("Exit");


        namelb=new JLabel("Name :");
        emaillb=new JLabel("Email :");
        mobilelb=new JLabel("Mobile :");
        genderlb=new JLabel("Gender :");
        addresslb=new JLabel("Address :");
        sourcelb=new JLabel("Source :");
        destinationlb=new JLabel("Destination :");
        paymentlb=new JLabel("Payment :");
        bookingIdlb=new JLabel();


        nametf=new JTextField();
        emailtf=new JTextField();
        mobiletf=new JTextField();
        gendertf=new JTextField();
        addresstf=new JTextField();
        sourcetf=new JTextField();
        destinationtf=new JTextField();
        paymenttf=new JTextField();



        booknowbtn=new JButton("BookNow");
        clearbtn=new JButton("Clear");
        cancelbtn=new JButton("Cancel");
        exitbtn=new JButton("Exit");


        namelb.setBounds(20,30,100,30);
        emaillb.setBounds(20,70,100,30);
        mobilelb.setBounds(20,110,100,30);
        genderlb.setBounds(20,150,100,30);
        addresslb.setBounds(20,190,100,30);
        sourcelb.setBounds(20,230,100,30);
        destinationlb.setBounds(20,270,100,30);
        paymentlb.setBounds(20,310,100,30);
        bookingIdlb.setBounds(50,460,450,40);



        nametf.setBounds(120,30,150,30);
        emailtf.setBounds(120,70,150,30);
        mobiletf.setBounds(120,110,150,30);
        gendertf.setBounds(120,150,150,30);
        addresstf.setBounds(120,190,150,30);
        sourcetf.setBounds(120,230,150,30);
        destinationtf.setBounds(120,270,150,30);
        paymenttf.setBounds(120,310,150,30);

        clearbtn.setBounds(50,360,100,40);
        cancelbtn.setBounds(180,360,100,40);
        booknowbtn.setBounds(50,410,100,40);
        exitbtn.setBounds(180,410,100,40);



        frame.add(namelb);
        frame.add(bookingIdlb);
        frame.add(emaillb);
        frame.add(mobilelb);
        frame.add(genderlb);
        frame.add(addresslb);
        frame.add(sourcelb);
        frame.add(destinationlb);
        frame.add(paymentlb);

        frame.add(nametf);
        frame.add(emailtf);
        frame.add(mobiletf);
        frame.add(gendertf);
        frame.add(addresstf);
        frame.add(sourcetf);
        frame.add(destinationtf);
        frame.add(paymenttf);



        frame.add(clearbtn);



        frame.add(booknowbtn);
        frame.add(cancelbtn);
        frame.add(exitbtn);




        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(700,600);
        frame.setVisible(true);

        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nametf.setText("");
                emailtf.setText("");
                mobiletf.setText("");
                gendertf.setText("");
                addresstf.setText("");
                sourcetf.setText("");
                destinationtf.setText("");
                paymenttf.setText("");

            }
        });
        booknowbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nametf.getText().toString().isEmpty() || emailtf.getText().toString().isEmpty()|| mobiletf.getText().toString().isEmpty() || addresstf.getText().toString().isEmpty() || gendertf.getText().toString().isEmpty() || sourcetf.getText().toString().isEmpty() || destinationtf.getText().toString().isEmpty() || paymenttf.getText().toString().isEmpty() ){
                    bookingIdlb.setText("Please fill the details");
                }
                else{
                    Random random=new Random();
                    int id= random.nextInt(999999);
                    bookingIdlb.setText("Your booking is confirmed and your booking id"+id);

                }

            }
        });








    }
}