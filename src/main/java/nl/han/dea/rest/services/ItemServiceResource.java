package nl.han.dea.rest.services;

import javax.json.Json;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")

public class ItemServiceResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getItems() {
        return Response.ok("bread, butter").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getItemsInJson(){
        return Response.ok("[\"bread\", \"butter\"]").build();
    }
}
