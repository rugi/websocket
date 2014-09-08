/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.codigoambar.websocket.web;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author 
 */
@ServerEndpoint("/echo")
public class EchoServer {
    
    @OnMessage
    public String onMessage(String message) {
        System.out.println("On message in echo");
        return "I got this ("+message +") "
                + " so, I am sending it back";
    }
    
       @OnOpen
    public void onOpen (Session peer) {
        System.out.println("in OnOpen");
    }

    @OnClose
    public void onClose (Session peer) {
        System.out.println("in OnClose");
    }
    
}//class
