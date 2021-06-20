package com.company.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubjectUI extends JFrame{
    private JPanel Panel1;
    private JTextField newsTextField;
    private JButton sendNewsButton;
    private JLabel newsLabel;
    private JButton addNewSubscriberButton;

    public SubjectUI(String title,Subject subject){
        this.setContentPane(Panel1);
        this.setTitle(title);

        sendNewsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n===============================================================\n");
                subject.notifyAllObservers(newsTextField.getText());
                System.out.println("\n===============================================================\n");
                newsTextField.setText("");
            }
        });

        addNewSubscriberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObserverUI observerUI = new ObserverUI("Subscribe to ABC",subject);
                observerUI.setSize(800,500);
                observerUI.setVisible(true);
            }
        });
    }
}
