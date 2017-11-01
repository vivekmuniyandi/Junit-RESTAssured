package com.example.sample;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SimpleREST extends ServerResource {

  public static void main(String args[]) {
    // Create a new Restlet component and add a HTTP server connector to it
    Component component = new Component();
    component.getServers().add(Protocol.HTTP, 8184);

    // Then attach it to the local host
    component.getDefaultHost().attach("/sample", SimpleREST.class);

    // Now, let's start the component!
    // Note that the HTTP server connector is also automatically started.
    try {
      component.start();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
}

  @Get("json")
  public JsonNode retrieve() {
    ObjectMapper mapper = new ObjectMapper();
    try {
      return mapper.readTree("{\"result\":\"success\"}");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}