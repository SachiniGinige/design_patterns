package com.company.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObserverUI extends JFrame{
    private JTextField subscriberNameTextField;
    private JLabel subscriberNameLabel;
    private JButton subscribeButton;
    private JPanel FormPanel1;
    private JPanel FormPanel2;
    private JComboBox purposeComboBox;
    private JComboBox modeComboBox;
    private JTextField emailTextField;
    private JLabel emailAddressLabel;
    private JButton unsubscribeButton;
    private String[] purpose= {"Read news", "Wrap food"};

    String name;
    String email;
    int type;
    Observer observer = null;
    Subject subject = new Subject();

    public ObserverUI(String title){
        this.setContentPane(FormPanel1);
        this.setTitle(title);

        unsubscribeButton.setVisible(false);
        emailAddressLabel.setVisible(false);
        emailTextField.setVisible(false);

        for (String s : purpose) {
            purposeComboBox.addItem(s);
        }
        modeComboBox.addItem("printed copy");

        purposeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(purposeComboBox.getSelectedItem().equals("Read news")){
                    modeComboBox.addItem("e-copy");
                }
                else if(purposeComboBox.getSelectedItem().equals("Wrap food")){
                    modeComboBox.removeItem("e-copy");
                    type=2;
                }
            }
        });

        modeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(modeComboBox.getSelectedItem().equals("e-copy")){
                    emailAddressLabel.setVisible(true);
                    emailTextField.setVisible(true);
                    type=3;
                }
                else if(modeComboBox.getSelectedItem().equals("printed copy")){
                    type=1;
                }
            }
        });

        subscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name=subscriberNameTextField.getText();
                email=emailTextField.getText();

                if(((type==1)||(type==2)||(type==3))&&(!name.equals(""))){

                    if(type==1){
                        observer = new Type1Observer(name);
                    }
                    else if(type==2){
                        observer = new Type2Observer(name);
                    }
                    else if(type==3){
                        observer = new Type3Observer(name,email);

                    }
                    subject.subscribe(observer);
                }

                else{
                    System.out.println("Could not subscribe. Please try again");
                }
                subscribeButton.setVisible(false);
                unsubscribeButton.setVisible(true);

                SubjectUI subjectUI= new SubjectUI("Subject UI",subject);
                subjectUI.setSize(800,500);
                subjectUI.setDefaultCloseOperation(subjectUI.EXIT_ON_CLOSE);
                subjectUI.setVisible(true);
            }
        });

        unsubscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subject.unsubscribe(observer);
            }
        });
    }

}


