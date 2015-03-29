package io.tasteit.rest.activities.exception;

public class ResourceNotFoundException extends BadRequestException {

    private static final long serialVersionUID = 7327499492243043259L;

    private static final String ERROR_CODE = "resource_not_found";
    private static final String ERROR_DESCRIPTION = "The request failed due to resource being requested does not exist.";
    
    public ResourceNotFoundException() {
        super(ERROR_CODE, ERROR_DESCRIPTION);
    }
}