package com.example.sample;

import org.restlet.Component;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;


public class SampleRESTEndPoint extends ServerResource {

  public static void main(String args[]) {
    // Create a new Restlet component and add a HTTP server connector to it
    Component component = new Component();
    component.getServers().add(Protocol.HTTP, 8184);

    // Then attach it to the local host
    component.getDefaultHost().attach("/sample", SampleRESTEndPoint.class);

    // Now, let's start the component!
    // Note that the HTTP server connector is also automatically started.
    try {
      component.start();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
}

  @Get
  public Representation retrieve() {
    return new StringRepresentation("{\"result\":\"success\"}", MediaType.APPLICATION_JSON);
  }
}