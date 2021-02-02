package com.ebupt.iot.iiot.lwm2m.server;

import org.eclipse.californium.core.network.CoapEndpoint;
import org.eclipse.californium.core.network.config.NetworkConfig;
import org.eclipse.leshan.core.node.codec.LwM2mNodeDecoder;
import org.eclipse.leshan.core.node.codec.LwM2mNodeEncoder;
import org.eclipse.leshan.server.californium.LeshanServer;
import org.eclipse.leshan.server.californium.LeshanServerBuilder;
import org.eclipse.leshan.server.californium.registration.CaliforniumRegistrationStore;
import org.eclipse.leshan.server.model.LwM2mModelProvider;
import org.eclipse.leshan.server.queue.ClientAwakeTimeProvider;
import org.eclipse.leshan.server.registration.RegistrationIdProvider;
import org.eclipse.leshan.server.security.Authorizer;
import org.eclipse.leshan.server.security.SecurityStore;
import org.springframework.stereotype.Component;

@Component
public class MyServer extends LeshanServer {
    public MyServer(CoapEndpoint unsecuredEndpoint, CoapEndpoint securedEndpoint, CaliforniumRegistrationStore registrationStore, SecurityStore securityStore, Authorizer authorizer, LwM2mModelProvider modelProvider, LwM2mNodeEncoder encoder, LwM2mNodeDecoder decoder, NetworkConfig coapConfig, boolean noQueueMode, ClientAwakeTimeProvider awakeTimeProvider, RegistrationIdProvider registrationIdProvider) {
        super(unsecuredEndpoint, securedEndpoint, registrationStore, securityStore, authorizer, modelProvider, encoder, decoder, coapConfig, noQueueMode, awakeTimeProvider, registrationIdProvider);
    }

    @Override
    public void start() {
        LeshanServerBuilder builder = new LeshanServerBuilder();
        LeshanServer server = builder.build();
        server.start();
    }

}
