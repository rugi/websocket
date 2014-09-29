/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.codigoambar.websocket.web;

import java.util.HashSet;
import java.util.Set;
import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;


/**
 *
 * @author rugi
 */
public class ProgrammaticEchoServerAppConfig implements ServerApplicationConfig{

    @Override
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> endpointClasses) {

        Set configs = new HashSet<ServerApplicationConfig>();
        ServerEndpointConfig sec = ServerEndpointConfig.Builder.
                create(ProgrammaticEchoServer.class, "/programmaticecho").build();
        configs.add(sec);
        return configs;
    
    }

    @Override
    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
        return scanned;
    }
    
}
