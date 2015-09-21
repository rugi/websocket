/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.codigoambar.websocket.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author RuGI
 */
public class WSChatArea extends JPanel {

    private JList people;
    private JTextArea chat;
    private JTextField message;
    private JSplitPane splitPane;

    public WSChatArea() {
        super();
        this.people = new JList();
        JScrollPane peopleScroller = new JScrollPane(this.people);
        this.chat = new JTextArea();
        this.message = new JTextField();
        JScrollPane chatScroller = new JScrollPane(this.chat);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                peopleScroller, chatScroller);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(150);

        //Provide minimum sizes for the two components in the split pane
        Dimension minimumSize = new Dimension(100, 50);

        this.setLayout(new BorderLayout());
        this.add(splitPane, BorderLayout.CENTER);
        this.add(message, BorderLayout.SOUTH);
        initEvents();
        this.repaint();
    }
    
    private void initEvents(){
        // el ENTER a this.mesage se debe reflejar en el rich Area.
        this.message.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("-----event  ----");
                chat.append(message.getText());
                chat.append("\n");
                message.setText("");
            }
        });
    }
}
