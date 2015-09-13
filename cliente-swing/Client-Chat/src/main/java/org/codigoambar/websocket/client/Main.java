    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.codigoambar.websocket.client;

import javax.swing.JFrame;
import org.codigoambar.websocket.ui.WSChat;

/**
 *
 * @author rugi
 */
public class Main {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("WS Chat");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                WSChat chat = new WSChat();
                frame.getContentPane().add(chat);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
