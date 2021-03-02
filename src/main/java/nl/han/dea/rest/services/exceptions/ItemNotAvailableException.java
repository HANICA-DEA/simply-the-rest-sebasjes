package  nl.han.dea.rest.services.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ItemNotAvailableException extends RuntimeException implements ExceptionMapper {

    @Override
    public Response toResponse(Throwable throwable) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
