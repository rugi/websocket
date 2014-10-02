/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.codigoambar.websocket.web;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;

/**
 *
 * @author rugi
 */
public class ProgrammaticEchoServer extends Endpoint {

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        final Session mySession = session;
        mySession.addMessageHandler(new MessageHandler.Whole<String>() {

            @Override
            public void onMessage(String text) {

                try {
                    System.out.println("Programmatic::On message in echo");
                    mySession.getBasicRemote().sendText("I got this (" + text + ") "
                            + " so, I am sending it back");
                } catch (IOException ex) {
                    System.out.println("Oh Dear, something wnet wrong "
                            + "trying to send the message back " + ex.getMessage());
                }

            }

        });

    }

}
