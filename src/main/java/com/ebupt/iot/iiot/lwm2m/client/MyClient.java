package com.ebupt.iot.iiot.lwm2m.client;

import org.eclipse.californium.core.network.config.NetworkConfig;
import org.eclipse.californium.scandium.config.DtlsConnectorConfig;
import org.eclipse.leshan.client.californium.LeshanClient;
import org.eclipse.leshan.client.californium.LeshanClientBuilder;
import org.eclipse.leshan.client.engine.RegistrationEngineFactory;
import org.eclipse.leshan.client.object.Security;
import org.eclipse.leshan.client.resource.LwM2mObjectEnabler;
import org.eclipse.leshan.client.resource.ObjectsInitializer;
import org.eclipse.leshan.core.LwM2mId;
import org.eclipse.leshan.core.californium.EndpointFactory;
import org.eclipse.leshan.core.node.codec.LwM2mNodeDecoder;
import org.eclipse.leshan.core.node.codec.LwM2mNodeEncoder;
import org.eclipse.leshan.core.request.BindingMode;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
@Component
public class MyClient extends LeshanClient{

    public MyClient(String endpoint, InetSocketAddress localAddress, List<? extends LwM2mObjectEnabler> objectEnablers, NetworkConfig coapConfig, DtlsConnectorConfig.Builder dtlsConfigBuilder, EndpointFactory endpointFactory, RegistrationEngineFactory engineFactory, Map<String, String> additionalAttributes, LwM2mNodeEncoder encoder, LwM2mNodeDecoder decoder, ScheduledExecutorService sharedExecutor) {
        super(endpoint, localAddress, objectEnablers, coapConfig, dtlsConfigBuilder, endpointFactory, engineFactory, additionalAttributes, encoder, decoder, sharedExecutor);
    }

    @Override
    public void start() {
        String endpoint = "..." ; // choose an endpoint name
        LeshanClientBuilder builder = new LeshanClientBuilder(endpoint);
        LeshanClient client = builder.build();
        client.start();
    }

//    ObjectsInitializer initializer = new ObjectsInitializer();
//    initializer.setInstancesForObject(LwM2mId.SECURITY, Security.noSec("coap://leshan.eclipseprojects.io:5683", 12345));
//    initializer.setInstancesForObject(LwM2mId.SERVER, new Server(12345, 5 * 60, BindingMode.U, false));
//    initializer.setInstancesForObject(LwM2mId.DEVICE, new Device("Eclipse Leshan", "model12345", "12345", "U"));
//    initializer.setInstancesForObject(7, new ConnectivityStatistics());
//
//    // add it to the client
//    builder.setObjects(initializer.createAll());
}
