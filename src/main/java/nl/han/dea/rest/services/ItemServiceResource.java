package nl.han.dea.rest.services;

import nl.han.dea.rest.services.dto.ItemDTO;

import javax.json.Json;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")

public class ItemServiceResource {

    private final ItemService itemService;

    public ItemServiceResource() {
        this.itemService = new ItemService();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getItems() {
        return Response.ok("bread, butter").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getItemsInJson() {
        return Response.ok("[\"bread\", \"butter\"]").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllItemsInJson() {
        return Response.ok(itemService.getAll()).build();
    }
}
