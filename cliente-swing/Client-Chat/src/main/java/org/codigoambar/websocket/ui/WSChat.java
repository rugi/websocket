/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.codigoambar.websocket.ui;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rugi
 */
public class WSChat extends JPanel {

    private JLabel statusBar;
    private WSAddressBar address;
    private WSChatArea  chat ;
    public WSChat() {
        super();
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Status:");
        this.statusBar = new JLabel("No conectado.");
        this.statusBar.setBorder(title);
        this.address = new WSAddressBar();
        this.chat    = new WSChatArea();
        this.setLayout(new BorderLayout());
        this.add(this.address, BorderLayout.NORTH);
        this.add(this.chat, BorderLayout.CENTER);
        this.add(this.statusBar, BorderLayout.SOUTH);
        this.repaint();
    }

}
