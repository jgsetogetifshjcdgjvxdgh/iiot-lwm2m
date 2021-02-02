//package com.ebupt.iot.iiot.lwm2m.client;
//
//import org.eclipse.leshan.client.object.Security;
//import org.eclipse.leshan.client.resource.ObjectsInitializer;
//import org.eclipse.leshan.core.LwM2mId;
//import org.eclipse.leshan.core.request.BindingMode;
//
//public class MyClientBuilder {
//    // create objects
//    ObjectsInitializer initializer = new ObjectsInitializer();
//    initializer.setInstancesForObject(LwM2mId.SECURITY, Security.noSec("coap://leshan.eclipseprojects.io:5683", 12345));
//    initializer.setInstancesForObject(LwM2mId.SERVER, new Server(12345, 5 * 60,BindingMode.U, false));
//    initializer.setInstancesForObject(LwM2mId.DEVICE, new Device("Eclipse Leshan", "model12345", "12345", "U"));
//
//    // add it to the client
//    builder.setObjects(initializer.createAll());
//}
