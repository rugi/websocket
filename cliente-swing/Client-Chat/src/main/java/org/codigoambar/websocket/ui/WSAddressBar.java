/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.codigoambar.websocket.ui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rugi
 */
public class WSAddressBar extends JPanel {

    private JLabel label;
    private JTextField address;
    private JButton goButton;

    public WSAddressBar() {
        super();
        this.label = new JLabel("WS EndPoint:");
        this.address = new JTextField("WS://");
        this.goButton = new JButton("GO");
        this.setLayout(new BorderLayout());
        this.add(this.label, BorderLayout.WEST);
        this.add(this.address, BorderLayout.CENTER);
        this.add(this.goButton, BorderLayout.EAST);
        this.repaint();
    }

}
